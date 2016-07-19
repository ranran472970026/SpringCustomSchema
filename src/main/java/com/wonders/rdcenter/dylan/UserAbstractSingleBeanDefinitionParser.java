package com.wonders.rdcenter.dylan;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by dylan_Apple on 16/7/19.
 */
public class UserAbstractSingleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    protected  Class getBeanClass(Element elment){

            return  UserSchema.class;

    }
    protected  void doParse(Element element , BeanDefinitionBuilder bean){

        String username = element.getAttribute("username");
        String password=element.getAttribute("password");
        if (StringUtils.hasText(username)) {
            bean.addPropertyValue("username",username);
        }
        if (StringUtils.hasText(username)) {
            bean.addPropertyValue("password",password);
        }
    }
}
