package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main{
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		SkillDAO skilldao = new SkillDAO();    
		PlayerDAO playerdao =  new PlayerDAO();
		System.out.println("List of all player and their skill");
		System.out.println("ID  NAME  COUNTRY  SKILL");
		List<Player> list=new ArrayList<Player>();
		list = playerdao.getAllPlayers();
		for(int i=0;i<list.size();i++) {
			System.out.println(i+1+". "+list.get(i).getName()+"   "+list.get(i).getCountry()+"    "+skilldao.getSkillBylD(list.get(i).getSkill().getSkillId()).getSkillName());
		}
	}
}
