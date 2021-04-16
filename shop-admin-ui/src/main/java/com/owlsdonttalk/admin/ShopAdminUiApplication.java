package com.owlsdonttalk.admin;

import com.owlsdonttalk.db.persist.model.Category;
import com.owlsdonttalk.db.persist.repo.CategoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@ComponentScan({"com.owlsdonttalk.db", "com.owlsdonttalk.admin", "com.owlsdonttalk.pictureservice"})
@EntityScan("com.owlsdonttalk.db")
@EnableJpaRepositories("com.owlsdonttalk.db")
public class ShopAdminUiApplication {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(ShopAdminUiApplication.class, args);
	}
}
