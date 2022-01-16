package com.SpringCore.Stereotype;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// App app = context.getBean("app", App.class);
		// App app2 = context.getBean("app", App.class);
		//
		// System.out.println(app.hashCode());
		// System.out.println(app2.hashCode());
		// System.out.println(app.getName());
		// System.out.println(app.getCity());
		// System.out.println(app.getAlname());

		spEL el = context.getBean("spel", spEL.class);

		System.out.println(el);

		// SpelExpressionParser ex = new SpelExpressionParser();
		// org.springframework.expression.Expression expression =
		// ex.parseExpression("55+10");
		//
		// System.out.println(expression.getValue());

	}
}
