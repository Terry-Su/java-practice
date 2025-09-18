package com.example.demo;

import org.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SimeIocContainer {
    // 存储已注册的Bean定义
    private Map<String, BeanDefinition> beanDefinitions = new HashMap<>();
    // 存储已创建的Bean实例
    private Map<String, Object> singletonBeans = new HashMap<>();

    /**
    * 注册bean
    * */
    public void registerBean(String beanName, Class<?> beanClass, boolean singleton){
        beanDefinitions.put(beanName, new BeanDefinition(beanClass, singleton));
    }

    /**
     * 获取Bean实例
     */
    public Object getBean(String beanName) throws Exception {
        // 如果是单例且已创建，直接返回
        if (singletonBeans.containsKey(beanName)) {
            return singletonBeans.get(beanName);
        }

        // 获取Bean定义
        BeanDefinition definition = beanDefinitions.get(beanName);
        if (definition == null) {
            throw new Exception("Bean " + beanName + " not found");
        }

        // 创建bean实例
        Object bean = createBean(definition.getBeanClassName());
        if (definition.isSingleton()) {
            singletonBeans.put(beanName, bean);
        }
        return bean;
    }


    /**
     * 创建Bean实例并注入依赖
     */
    private Object createBean(Class<?> beanClass) throws Exception {
        // 使用无参构造函数创建实例
        Constructor<?> constructor = beanClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object bean = constructor.newInstance();

        // 注入依赖
        injectDependencies(bean);
        return bean;
    }

    /**
     * 为Bean注入依赖
     */
    private void injectDependencies(Object bean) throws Exception {
        Field[] fields  = bean.getClass().getDeclaredFields();

        for (Field field : fields) {
            // 检查字段是否有需要注入的注解
            Inject annotation = field.getAnnotation(Inject.class);
            if (annotation != null) {
                Class<?> dependencyClass = field.getType();
                String dependencyBeanName = getBeanName(dependencyClass);

                // 获取依赖的Bean实例
                Object dependency = getBean(dependencyBeanName);

                // 设置字段可访问并注入依赖
                field.setAccessible(true);
                field.set(bean, dependency);
            }
        }
    }

    /**
     * 根据类名生成默认的Bean名称（首字母小写）
     */
    private String getBeanName(Class<?> clazz) {
        String className = clazz.getSimpleName();
        return Character.toLowerCase(className.charAt(0)) + className.substring(1);
    }
}



