package ru.yandex.practicum.catsgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//  Функция автоматической настройки не всегда отвечает задачам приложения.
//  В некоторых случаях, например при тестировании, может понадобиться отключить
//  автоконфигурацию подключения к базе данных. Чтобы объяснить Spring Boot,
//  что его помощь не требуется, добавьте в аннотацию @SpringBootApplication
//  параметр exclude со значением DataSourceAutoConfiguration.class.

// @SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class CatsgramApplication {

	public static void main(String[] args) {

		SpringApplication.run(CatsgramApplication.class, args);
	}

}
