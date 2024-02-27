package com.accenture.grupos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoInyeccionDependencias {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Grupos grupo = (Grupos) context.getBean("grupo");
		System.out.println(grupo.toString());
		for(Componente componente : grupo.componentes) {
			System.out.println(componente.toString());
		}
	}

}
