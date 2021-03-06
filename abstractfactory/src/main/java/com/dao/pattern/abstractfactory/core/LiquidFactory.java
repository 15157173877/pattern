package com.dao.pattern.abstractfactory.core;

import com.dao.pattern.abstractfactory.interfaces.IUse;
import com.dao.pattern.factory.interfaces.Iliquid;

/**
 * 液体的工厂类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.abstractfactory.core.LiquidFactory.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 16:03:00
 * @modifier 阿导
 * @updated 2018-01-30 16:03:00
 */
public class LiquidFactory extends AbstractFactory {

    /**
     * 液体工厂类
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param clazz
     * @return com.dao.pattern.factory.interfaces.Iliquid
     */
    @Override
    public <T> Iliquid getLiquid(Class<? extends T> clazz) {

        Iliquid obj = null;

        try {
            obj = (Iliquid) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }

    /**
     * 用处工厂
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param clazz
     * @return com.dao.pattern.abstractfactory.interfaces.IUse
     */
    @Override
    public <T> IUse getUse(Class<? extends T> clazz) {
        return null;
    }
}
