package com.axacolpatria.output;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomersResponseBean {
	
	@JsonProperty("codigo") //200
	private String codigo;
	
	@JsonProperty("estado") //Peticion procesada correctamente
	private String estado;
	
	@JsonProperty("cutomersDetailBean")
	private List<CutomersDetailBean> cutomersDetailBean;

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the cutomersDetailBean
	 */
	public List<CutomersDetailBean> getCutomersDetailBean() {
		return cutomersDetailBean;
	}

	/**
	 * @param cutomersDetailBean the cutomersDetailBean to set
	 */
	public void setCutomersDetailBean(List<CutomersDetailBean> cutomersDetailBean) {
		this.cutomersDetailBean = cutomersDetailBean;
	}
	
	
	

}
