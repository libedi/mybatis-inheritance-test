package io.github.libedi.event.model;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.ToString;

@Alias("PostDetail")
@Getter
@ToString(callSuper = true)
public class PostDetail extends EventDetail {
	
	private String email;

}
