package com.xyc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 可以使用@Component注册，也可以使用xml配置文件：
 * <bean class="com.xyc.processor.BeanPostPrcessorDemo"/>
 * Created by xyc on 2017/8/20 0020.
 */
@Component
public class BeanPostPrcessorDemo implements BeanPostProcessor {
    /**
     * Bean 实例化之前进行的处理
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "---postProcessBeforeInitialization");
        return bean;
    }

    /**
     * Bean 实例化之后进行的处理
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "---postProcessAfterInitialization");
        return bean;
    }
}
