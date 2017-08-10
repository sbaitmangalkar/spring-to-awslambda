package com.service.order.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * A thread safe singleton class that provides spring application context
 *  
 * @author Shyam | catch.shyambaitmangalkar@gmail.com
 *
 */
public class Application {
	private static ApplicationContext springApplicationContext;
	
	private static ApplicationContext getApplicationContext() {
		if(springApplicationContext == null) {
			synchronized (ApplicationContext.class) {
				if(springApplicationContext == null) {
					springApplicationContext = new AnnotationConfigApplicationContext();
				}
			}
		}
		return springApplicationContext;
	}
	
	public static<T> T getBean(Class<T> clazz) {
		ApplicationContext context = getApplicationContext();
		AnnotationConfigApplicationContext webContext = null;
		if(context instanceof AnnotationConfigApplicationContext)
			webContext = (AnnotationConfigApplicationContext) context;
		webContext.register(WebConfigLambda.class);
		webContext.refresh();
		return webContext.getBean(clazz);
	}
}
