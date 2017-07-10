package com.fs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.IMessageConverter;
import com.fs.beans.MessageWriter;

public class FSTest {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/fs/common/application-context.xml"));
		messageWriter = factory.getBean("messageWriter",MessageWriter.class);
		/*IMessageConverter messageConverter = (IMessageConverter) factory.getBean("pdfMessageConverter");
		messageWriter.setMessageConverter(messageConverter);*/
		messageWriter.writeMessage("Welcome to Spring");
		
		
	}
}
