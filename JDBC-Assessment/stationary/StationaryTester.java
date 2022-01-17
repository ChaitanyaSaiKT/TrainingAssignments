package com.thoughtfocus.Stationary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.Server;

public class StationaryTester {
	
	public static void main(String[] args) {
		Connection connection = null;
		
		
		createTableforStationary(connection);
		
		try {
			connection = DriverManager.getConnection("jdbc:h2:mem:ThoughtFocus", "sa", "sa");
			if(connection!=null) {
				System.out.println("connection acquired");
			}
			else {
				System.out.println("Connection not acquired");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		}
	StationaryDAO dao = new StationaryDAO();
	StationaryDTO dto = new StationaryDTO();
	
	
	public static final String createTableQuery=
			"CREATE TABLE Stationary("
			+"name VARCHAR(15),"
			+"price DOUBLE,"
			+"type VARCHAR(10),"
			+"quantity INT,"
			+"brandname VARCHAR(15),"
			+"serialnumber INT serialnumber"
			+")";
	
	private static void createTableforStationary(Connection connection ) {
		Statement statement ;
		try {
			statement= connection.createStatement();
			statement.execute(createTableQuery);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

	
	
	
	}

