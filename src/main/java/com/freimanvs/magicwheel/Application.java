package com.freimanvs.magicwheel;

import com.freimanvs.magicwheel.services.PrintService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
//@EnableAutoConfiguration
//@EnableAspectJAutoProxy
public class Application {
	
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		System.out.println("MagicWheel application started!");
	}

	@Bean("printService")
	@Qualifier("printService")
	@Scope("singleton")
	public PrintService printService() {
		return new PrintService();
	}

}