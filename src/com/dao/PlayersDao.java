package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.config.PlayersConfig;
import com.model.Players;

public class PlayersDao {

	public ArrayList<Players> getplayerslist() throws ClassNotFoundException, SQLException {
	Connection con = PlayersConfig.getinfo();
	PreparedStatement ps = con.prepareStatement("select * from india");
	ResultSet rs= ps.executeQuery();
	 
    	ArrayList<Players> al = new ArrayList<>();
		while (rs.next()){
        al.add(new Players(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));			
		}
		return al;
	}
	public ArrayList<Players> getmorethanscore() throws ClassNotFoundException, SQLException {
		Connection con = PlayersConfig.getinfo();
		PreparedStatement ps = con.prepareStatement("select * from india where century >50");
		ResultSet rs= ps.executeQuery();
		
	    	ArrayList<Players> al = new ArrayList<>();
			while (rs.next()){

				al.add(new Players(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));			
			}
			return al;
		}
	public ArrayList<Players> getproprdetails() throws ClassNotFoundException, SQLException {
		Connection con = PlayersConfig.getinfo();
		PreparedStatement ps = con.prepareStatement("select * from india where id=3");
		ResultSet rs= ps.executeQuery();
		
	    	ArrayList<Players> al = new ArrayList<>();
			while (rs.next()){

				al.add(new Players(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));			
			}
			return al;
		}
	
	public ArrayList< Players> getmorehighscore() throws ClassNotFoundException, SQLException{
		
		Connection con = PlayersConfig.getinfo();
		PreparedStatement ps= con.prepareStatement("select * from india where hscore>200");
		ResultSet rs= ps.executeQuery();
		 ArrayList<Players> list= new ArrayList<>();
		
		 
		 while (rs.next()) {
			 
			 list.add(new Players(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));	
		 }
		
		return list;
		
		
	}
	
	
}
