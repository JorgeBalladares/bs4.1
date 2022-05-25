package com.example.bs41;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {
	@Value("${spring.profiles.active:}")
	String activeProfile;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	Perfiles getProfile(){
		if (activeProfile.equals("perfil1")){
			return new Perfil1();
		}
		return new Perfil2();
	}

}
