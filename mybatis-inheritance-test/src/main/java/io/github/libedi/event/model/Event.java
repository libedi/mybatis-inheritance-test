package io.github.libedi.event.model;

import org.apache.ibatis.type.Alias;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Alias("Event")
@Getter
@ToString
@EqualsAndHashCode
public class Event {
	
	@EqualsAndHashCode.Include
	private Long eventId;
	private String eventName;
	private EventType eventType;
	private EventDetail eventDetail;

}
