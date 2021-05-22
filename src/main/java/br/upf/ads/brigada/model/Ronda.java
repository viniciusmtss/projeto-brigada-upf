package br.upf.ads.brigada.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ronda {

	@Id
	private Integer id;
	private Date dataHoraInicio;
	private Date dataHoraFim;
	private Date dataHoraUltima;
	private Float latUltima;
	private Float lonUltima;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public Date getDataHoraUltima() {
		return dataHoraUltima;
	}

	public void setDataHoraUltima(Date dataHoraUltima) {
		this.dataHoraUltima = dataHoraUltima;
	}

	public Float getLatUltima() {
		return latUltima;
	}

	public void setLatUltima(Float latUltima) {
		this.latUltima = latUltima;
	}

	public Float getLonUltima() {
		return lonUltima;
	}

	public void setLonUltima(Float lonUltima) {
		this.lonUltima = lonUltima;
	}

}
