package com.evanyz.springDIscovery;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by evan on 2019/3/3.
 */
public class BeanInitialize {

	public static void main(String[] args) {

		//定义资源在哪里
		ClassPathResource resource = new ClassPathResource("aa.xml");

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		//定义一个Reader,怎么去读资源,读完资源回调一个Register
		//ResourceLoader通过统一的Resource接口来读取资源
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		//用Reader去读资源,解析到了让Reader去回调Register
		reader.loadBeanDefinitions(resource);

	}
}
