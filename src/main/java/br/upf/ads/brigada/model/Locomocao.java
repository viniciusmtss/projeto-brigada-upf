package br.upf.ads.brigada.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Locomocao implements Serializable {

	private static final long serialVersionUID = 800513102980081084L;

	@Id
	private Integer id;
	private String placa;
	private String descricao;

	public Locomocao() {
		super();
	}

	public Locomocao(Integer id, String placa, String descricao) {
		super();
		this.id = id;
		this.placa = placa;
		this.descricao = descricao;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
