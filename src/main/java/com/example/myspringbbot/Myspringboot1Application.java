package com.example.myspringbbot;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Myspringboot1Application {

	public static void main(String[] args) {
//		SpringApplication.run(Myspringboot1Application.class, args);
		
		SpringApplication app = new SpringApplication(
				Myspringboot1Application.class);
		app.setBanner(new Banner() {

			@Override
			public void printBanner(Environment environment, 
					Class<?> sourceClass, PrintStream out) {
				// TODO Auto-generated method stub
				out.print("\n\n\tTest My Banner!\n\n".toUpperCase());
			}
			
		});
		app.run(args);
	}

}
