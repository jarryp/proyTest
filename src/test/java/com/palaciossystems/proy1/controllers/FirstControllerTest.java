package com.palaciossystems.proy1.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FirstControllerTest {
	
	@Test
	public void firstTest() {
		FirstController controller = new FirstController();
		assertThat(controller.first()).isNotNull();
	}
	
	
}
