package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO{
	static List<Player> list=new ArrayList<Player>();
	public List<Player> getAllPlayers() throws ClassNotFoundException, SQLException, IOException 
	{
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM player JOIN skill ON player.skill_id=skill.id");
		while(rs.next())
		    {			
				long pid = rs.getLong(1);
				
				String pName = rs.getString(2);
				
				String pCountry = rs.getString(3);	
				
				long sid = rs.getLong(4);
				
				
				String sName = rs.getString(7);
				
				Skill skill = new Skill(sid,sName);
				
				Player player = new Player(pid,pName,pCountry,skill);
				
				list.add(player);  
		    }
		return list;	
	}	
	 }
