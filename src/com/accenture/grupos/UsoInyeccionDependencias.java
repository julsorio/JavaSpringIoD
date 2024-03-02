package com.accenture.grupos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * clase donde se pone en practica la inyeccion de dependencias
 * creando el contexto de spring a partir del fichero applicationContext.xml
 * 
 * @author Andrea Ravagli Castillo
 */
public class UsoInyeccionDependencias {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Grupo grupo = (Grupo) context.getBean("grupo");
		System.out.println(grupo.toString());
		for(Componente componente : grupo.componentes) {
			System.out.println(componente.toString());
		}
	}

}
