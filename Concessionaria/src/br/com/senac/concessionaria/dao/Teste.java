package br.com.senac.concessionaria.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {
	public static void main(String args[]) throws SQLException {
		Connection cnx = UtilDB.getConnection();
		
		if(cnx != null) {
			System.out.println("Conex�o estabelecida!");
		} else {
			System.out.println("Falha na conex�o");
		}
	}
}
