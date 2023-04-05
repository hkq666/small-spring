package org.smallspring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 黄凯强
 * @version 1.0
 * @date 2023/4/5 15:43
 */
public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>(16);

    public void registerBean(String beanName, Object bean) {
        beanMap.put(beanName, bean);
    }

    public Object getBean(String beanName) {
        return beanMap.get(beanName);
    }
}
