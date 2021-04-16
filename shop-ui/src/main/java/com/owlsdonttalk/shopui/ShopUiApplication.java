package com.owlsdonttalk.shopui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/***
 * TODO
 *  1. разобраться с мапингом - в анотации класса и методов
 * 	3. просмотр товаров внутри категории
 * 	7. Оптимизация запросов
 */

@SpringBootApplication
@ComponentScan({"com.owlsdonttalk.admin.service", "com.owlsdonttalk.db", "com.owlsdonttalk.pictureservice"})
@EntityScan("com.owlsdonttalk.db")
@EnableJpaRepositories("com.owlsdonttalk.db")
public class ShopUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopUiApplication.class, args);
	}

}
