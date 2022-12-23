package com.axacolpatria.output;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"age",
"phoneNumber",
"address"
})
@Generated("jsonschema2pojo")
public class CutomersDetailBean {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("age")
	private String age;
	
	@JsonProperty("phoneNumber")
	private String phoneNumber;
	
	@JsonProperty("address")
	private String address;
	
}
