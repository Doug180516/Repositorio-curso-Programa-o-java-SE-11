package br.com.kasolution.dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Treinamento {

	private String curso;
	private String instrutor;
	private LocalDate dataInicio;
	private LocalTime horaInicio;

	public Treinamento(String curso, String instrutor, LocalDate dataInicio, LocalTime horaInicio) {
		this.curso = curso;
		this.instrutor = instrutor;
		this.dataInicio = dataInicio;
		this.horaInicio = horaInicio;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
}
