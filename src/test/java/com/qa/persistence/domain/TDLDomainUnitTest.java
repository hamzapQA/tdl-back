package com.qa.persistence.domain;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//unit test
@SpringBootTest
public class TDLDomainUnitTest {
	
	private TDLDomain toDo;
	
	
	
	@Test
	public void setterGetterTest() {
		toDo = new TDLDomain(1L, "Test Entry", null);
		
		Assertions.assertThat(toDo).isNotNull();
		toDo.setId(1L);
		toDo.setName("Something");
		toDo.setTaskList(null);
		
		Assertions.assertThat(toDo.getId()).isNotNull();
		Assertions.assertThat(toDo.getName()).isNotNull();
		Assertions.assertThat(toDo.getTaskList()).isNull();
	}

}
