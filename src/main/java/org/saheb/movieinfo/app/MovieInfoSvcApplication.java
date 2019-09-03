package org.saheb.movieinfo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.saheb.movieinfo")
public class MovieInfoSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoSvcApplication.class, args);
	}

}
