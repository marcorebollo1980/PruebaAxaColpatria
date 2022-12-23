package com.axacolpatria.output;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomersResponseBean {
	
	@JsonProperty("codigo") //200
	private String codigo;
	
	@JsonProperty("estado") //Peticion procesada correctamente
	private String estado;
	
	@JsonProperty("cutomersDetailBean")
	private List<CutomersDetailBean> cutomersDetailBean;
	

}
