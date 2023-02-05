package com.hitd.spring;

import com.hitd.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ZhangWeinan
 * @Date 2023/2/5 15:43
 * @DES
 * @Since Copyright(c)
 */

public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person =context.getBean(Person.class);
		System.out.println(person);


	}
}
