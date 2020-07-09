package annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextPro implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 取得存储在静态变量中的ApplicationContext.
     */
    public static ApplicationContext getApplicationContext() {
        return context;
    }

    public static <T> T getBean(String name, Class<T> aClass) {
        return context.getBean(name, aClass);
    }

    public static <T> T getBean(Class<T> aClass) {
        return context.getBean(aClass);
    }

    public static String getEmbeddedValue(String propertiesKey) {
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context.getAutowireCapableBeanFactory();
        return beanFactory.resolveEmbeddedValue(propertiesKey);
    }

}
