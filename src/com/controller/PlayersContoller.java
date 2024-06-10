package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.PlayersDao;
import com.model.Players;
import com.service.PlayersService;

public class PlayersContoller {

	void getprintdata() throws ClassNotFoundException, SQLException {

		PlayersService ps= new PlayersService();
		ArrayList<Players> al=ps.getplayerslist();

		for (Players players : al) {
			System.out.println(players.getId());
			System.out.println(players.getName());
			System.out.println(players.getHscore());
			System.out.println(players.getCentury());
			System.out.println();
		}

	}
	void getprintmorethanscore() throws ClassNotFoundException, SQLException {

		PlayersService ps= new PlayersService();
		ArrayList<Players> al=ps.getmorethanscore();
		
		for (Players players : al) {
			
			System.out.println("More Than Century :-> "+players);
		}
		System.out.println();
	}

	void getprintproperdetails() throws ClassNotFoundException, SQLException {
		PlayersService ps= new PlayersService();

		ArrayList<Players> al=ps.getproperdetails();
		for (Players players : al) {
			
			System.out.println("Players Proper Details"+players);

		}
		System.out.println();
	}


	void getmorehighscore() throws ClassNotFoundException, SQLException {
		
		PlayersService ps= new PlayersService();
		ArrayList<Players> list= ps.getmorehighscore();
		
		for (Players players : list) {
			
			System.out.println(players);
		}
		
	}
		public static void main(String[] args) throws ClassNotFoundException, SQLException {

			PlayersContoller pc = new PlayersContoller();
			
			pc.getprintdata();
			

		}
	}
