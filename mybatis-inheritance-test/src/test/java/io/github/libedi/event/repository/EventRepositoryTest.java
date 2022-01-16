package io.github.libedi.event.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import io.github.libedi.event.model.Event;

@MybatisTest
public class EventRepositoryTest {
	
	@Autowired
	private EventRepository repository;
	
	@Test
	public void init() {
		assertThat(this.repository).isNotNull();
	}
	
	@Test
	public void allSelect() {
		
		List<Event> actual = this.repository.findAll();
		
		assertThat(actual).isNotNull();
		actual.forEach(System.out::println);
		
	}
	
	@Test
	public void oneSelect() {
		Long id = 1L;
		Optional<Event> actual = this.repository.findById(id);
		assertThat(actual).isNotEmpty();
		System.out.println(actual.get());
		
	}
	

}
