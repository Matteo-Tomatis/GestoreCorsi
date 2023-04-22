package it.polito.tdp.corsi.db;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.model.Corso;

public class Test {

	public static void main(String[] args) {
		CorsoDAO dao = new CorsoDAO();
		
		List<Corso> result = new ArrayList<>();
		
		result = dao.getCorsoIscritti(1);
		
		for(Corso c : result) {
			System.out.println(c.getCod() + " " + c.getNome() + " " + c.getCrd());
		}

	}

}
