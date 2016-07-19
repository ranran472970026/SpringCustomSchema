package com.wonders.rdcenter.dylan;


import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by dylan_Apple on 16/7/19.
 */
public class UserSchemaNamespaceHandlerSupport extends NamespaceHandlerSupport {

    public void init() {

        registerBeanDefinitionParser("user",new UserAbstractSingleBeanDefinitionParser());
    }
}
