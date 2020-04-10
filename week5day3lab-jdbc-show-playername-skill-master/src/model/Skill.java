package model;

public class Skill{
	Long skillId;
	String skillName;
	public Skill(long skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}
	public Skill() {
		// TODO Auto-generated constructor stub
	}
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
}
