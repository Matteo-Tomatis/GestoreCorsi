package it.polito.tdp.corsi.model;

import java.util.*;

import it.polito.tdp.corsi.db.CorsoDAO;
import it.polito.tdp.corsi.db.StudenteDAO;

public class Model {
	private CorsoDAO corsoDAO;
	private StudenteDAO studenteDAO;
	
	public Model() {
		this.corsoDAO = new CorsoDAO();
		this.studenteDAO = new StudenteDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(int periodo){
		return this.corsoDAO.getCorsiByPeriodo(1);
	}
	
	public List<Corso> getCorsoIscritti(int periodo){
		return this.corsoDAO.getCorsoIscritti(periodo);
	}
	
	public List<Studente> getStudentiByCorso(String codins){
		return this.studenteDAO.getStudentiByCorso(codins);
	}
	
	public List<Divisione> getDivisione(String codins){
		return this.studenteDAO.getDivisioneStudenti(codins);
	}
}
