package org.saheb.movieinfo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.saheb.movieinfo")
@EnableEurekaClient//Optional
public class MovieInfoSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoSvcApplication.class, args);
	}

}
