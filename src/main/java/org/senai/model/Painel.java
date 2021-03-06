package org.senai.model;

public class Painel {

	private int id;
	private String nomePaciente = "";
	private String status = "";
	private String local = "";
	private String inicioPrevisto = "";
	private String inicioCirurgia = "";
	private String fimCirurgia = "";
	private String saidaPrevista= "";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getInicioPrevisto() {
		return inicioPrevisto;
	}
	public void setInicioPrevisto(String inicioPrevisto) {
		this.inicioPrevisto = inicioPrevisto;
	}
	public String getInicioCirurgia() {
		return inicioCirurgia;
	}
	public void setInicioCirurgia(String inicioCirurgia) {
		this.inicioCirurgia = inicioCirurgia;
	}
	public String getFimCirurgia() {
		return fimCirurgia;
	}
	public void setFimCirurgia(String fimCirurgia) {
		this.fimCirurgia = fimCirurgia;
	}
	public String getSaidaPrevista() {
		return saidaPrevista;
	}
	public void setSaidaPrevista(String saidaPrevista) {
		this.saidaPrevista = saidaPrevista;
	}
	
}
