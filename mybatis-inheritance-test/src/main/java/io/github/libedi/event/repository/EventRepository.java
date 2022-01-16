package io.github.libedi.event.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import io.github.libedi.event.model.Event;

@Repository
@Mapper
public interface EventRepository {

	List<Event> findAll();

	Optional<Event> findById(Long id);
	
	

}
