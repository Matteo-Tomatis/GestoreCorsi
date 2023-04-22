package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.model.Divisione;
import it.polito.tdp.corsi.model.Studente;

public class StudenteDAO {
	
	public List<Studente> getStudentiByCorso(String codice){
		
		String sql = "SELECT s.matricola, s.cognome, s.nome, s.CDS "
				+ "FROM studente s, iscrizione i "
				+ "WHERE s.matricola=i.matricola AND i.codins=?";
		
		List<Studente> risultato = new ArrayList<>();
		
		Connection conn = ConnectDB.getConnection();
		
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, codice);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Studente s = new Studente(rs.getInt("matricola"), 
						rs.getString("cognome"), rs.getString("nome"), 
						rs.getString("CDS"));
				risultato.add(s);
			}
				st.close();
				rs.close();
				conn.close();
				return risultato;
		} catch (SQLException e) {
			System.out.println("Errore nella connessione al db");
			e.printStackTrace();
			return null;
		}

	}
	
	public List<Divisione> getDivisioneStudenti(String codins) {
		String sql = "SELECT s.CDS, COUNT(*) AS n "
				+ "FROM studente s, iscrizione i "
				+ "WHERE s.matricola=i.matricola AND i.codins=? AND s.CDS<>\"\" "
				+ "GROUP BY s.CDS";
		
		List<Divisione> risultato = new ArrayList<>();
		
		Connection conn = ConnectDB.getConnection();
		
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, codins);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Divisione d = new Divisione(rs.getString("CDS"), rs.getInt("n"));
				risultato.add(d);
			}
				st.close();
				rs.close();
				conn.close();
				return risultato;
		} catch (SQLException e) {
			System.out.println("Errore nella connessione al db");
			e.printStackTrace();
			return null;
		}

	}

}
