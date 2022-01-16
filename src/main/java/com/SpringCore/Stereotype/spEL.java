package com.SpringCore.Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spel")
public class spEL {
	@Value("#{1+2}")
	private int a;
	@Value("#{2+3}")
	private int b;

	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private int rqrtval;

	@Value(" #{ T(java.lang.Math).PI }")
	private double fixedval;

	@Value("#{ new String('Agravat Nayan')}")
	private String name;

	@Value("#{ 8<4}")
	private boolean isActive;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "spEL [a=" + a + ", b=" + b + ", rqrtval=" + rqrtval + ", fixedval=" + fixedval + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}

	public spEL(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public spEL() {
		super();
		// TODO Auto-generated constructor stub
	}

}
