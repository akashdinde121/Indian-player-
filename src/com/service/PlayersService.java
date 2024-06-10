package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.PlayersDao;
import com.model.Players;
import com.mysql.fabric.xmlrpc.base.Array;

public class PlayersService {

	
	public ArrayList<Players> getplayerslist() throws ClassNotFoundException, SQLException {
		
		PlayersDao pd = new PlayersDao();
        ArrayList<Players> al = pd.getplayerslist();
        return al ;
		
	}
	
	
	public ArrayList<Players> getmorethanscore() throws ClassNotFoundException, SQLException {
		PlayersDao pd = new PlayersDao ();
		ArrayList<Players> al = pd.getmorethanscore(); 

		return al;
	}
	
	public ArrayList<Players> getproperdetails () throws ClassNotFoundException, SQLException {
		PlayersDao pd = new PlayersDao ();
		ArrayList<Players> al = pd.getproprdetails();

		return al;
	}

	public ArrayList<Players> getmorehighscore() throws ClassNotFoundException, SQLException{
		
		PlayersDao pd= new PlayersDao();
		ArrayList<Players> list= pd.getmorehighscore();
		
		return list;
		
	}
}

