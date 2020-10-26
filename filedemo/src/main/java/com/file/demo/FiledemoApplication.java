package com.file.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.file.demo.storage.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FiledemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiledemoApplication.class, args);
	}

}
