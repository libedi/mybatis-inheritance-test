package io.github.libedi.event.model;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.ToString;

@Alias("MgmDetail")
@Getter
@ToString(callSuper = true)
public class MgmDetail extends EventDetail {
	
	private String mgmTel;

}
