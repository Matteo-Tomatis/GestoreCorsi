package it.polito.tdp.corsi.model;

import java.util.Objects;

public class Corso {
	
	private String cod;
	private int crd;
	private String nome;
	private int pd;
	
	public Corso(String cod, int crd, String nome, int pd) {
		this.cod = cod;
		this.crd = crd;
		this.nome = nome;
		this.pd = pd;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public int getCrd() {
		return crd;
	}
	public void setCrd(int crd) {
		this.crd = crd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPd() {
		return pd;
	}
	public void setPd(int pd) {
		this.pd = pd;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		return Objects.equals(cod, other.cod);
	}
	
	
	

}
