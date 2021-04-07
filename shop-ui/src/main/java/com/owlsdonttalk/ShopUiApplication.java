package com.owlsdonttalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * TODO
 *  1. разобраться с мапингом - в анотации класса и методов
 * 	2. просмотр карточки товара
 * 	3. просмотр товаров внутри категории
 */

@SpringBootApplication
public class ShopUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopUiApplication.class, args);
	}

}
