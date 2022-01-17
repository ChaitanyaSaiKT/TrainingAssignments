package com.thoughtfocus.Stationary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StationaryDAO {
	
	Connection connection;
	
	public StationaryDAO(Connection connection) {
		this.connection=connection;
		
		
	}
	
	public StationaryDAO() {
		
	}
	public static final String deleteBySerialNumberQuery = "DELETE From Stationary "
            +"Where serialnumber=?";
	public static final String updatePriceByBrandNameQuery = "UPDATE Application "
            +"SET price=?"
            +"Where brandname=?";

	private String insertquery = "Insert into Stationary values(?,?,?,?,?,?)";
	
	public boolean add(StationaryDTO dto) {
		PreparedStatement ps=null;
		try {
			ps = connection.prepareStatement(insertquery);
			ps.setString(1, dto.getName());
			ps.setDouble(2, dto.getPrice());
			ps.setString(3, dto.getType());
			ps.setInt(4, dto.getQuantity());
			ps.setString(5, dto.getBrandname());
			ps.setInt(6, dto.getSerialnumber());
			
			ps.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public static void getAll(Connection connection) {
		String query = "SELECT * FROM Stationary";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				
				String name = resultSet.getString("name");
				double price = resultSet.getDouble("price");
				String type = resultSet.getString("type");
				double rate = resultSet.getDouble("price");
				String brandname = resultSet.getString("brandname");
				int serialnumber = resultSet.getInt("serialnumber");
				System.out.println(name +"," +price+","+type+","+rate+","+brandname+","+serialnumber);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	StationaryDTO deleteBySerialNumber(Connection connection, int serialnumber ) {
		try (PreparedStatement preparedStatement=connection.prepareStatement(deleteBySerialNumberQuery)){
			preparedStatement.setInt(1, serialnumber);
			preparedStatement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	StationaryDTO UpdatePriceByBrandName(Connection connection, double price, String brandname ) {
		try (PreparedStatement preparedStatement=connection.prepareStatement(updatePriceByBrandNameQuery)){
			preparedStatement.setDouble(1, price);
			preparedStatement.setString(2, brandname);
			preparedStatement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}

}
