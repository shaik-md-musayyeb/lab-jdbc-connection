package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, IOException, SQLException {
		
	// Fill your code

//		ConnectionManager cm = new ConnectionManager();
		Connection c = null;
		c= ConnectionManager.getConnection();
		if(c!= null) {
			System.out.println("Connection established");
		}
		else
			System.out.println("Incorrect username / password");
		
		
	}
}
