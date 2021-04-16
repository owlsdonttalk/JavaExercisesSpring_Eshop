package com.owlsdonttalk.shopui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
 * TODO
 *  1. разобраться с мапингом - в анотации класса и методов
 * 	3. просмотр товаров внутри категории
 * 	7. Оптимизация запросов
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.owlsdonttalk.admin.service"})
public class ShopUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopUiApplication.class, args);
	}

}
