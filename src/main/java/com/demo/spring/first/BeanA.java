package com.demo.spring.first;

public class BeanA {

	private BeanB beanB;
	
	public BeanB getBeanB() {
		System.out.println("Setting BeanB in BeanA");
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanA()
	{
		System.out.println("Instantiating BeanA");
	}
}
