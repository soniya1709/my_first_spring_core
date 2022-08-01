package com.prowings;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext cts=new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentSetterContext s=(StudentSetterContext)cts.getBean("std");
	Employee e=(Employee)cts.getBean("emp");
	System.out.println(s);
	System.out.println(e);
	System.out.println("************");
	Student_Proto_Scop s1=(Student_Proto_Scop)cts.getBean("s");
	Student_Proto_Scop s2=(Student_Proto_Scop)cts.getBean("s");
	System.out.println(s1==s2);
	System.out.println("==================");
	int count=cts.getBeanDefinitionCount();
	System.out.println(count);
	String[] names=cts.getBeanDefinitionNames();
	System.out.println(Arrays.toString(names));
}
}
