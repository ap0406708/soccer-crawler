package com.soccer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class LeagueInfo {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String leagueUnique;
	private String leagueNameCn;
	private String leagueNameEn;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLeagueUnique() {
		return leagueUnique;
	}
	public void setLeagueUnique(String leagueUnique) {
		this.leagueUnique = leagueUnique;
	}
	public String getLeagueNameCn() {
		return leagueNameCn;
	}
	public void setLeagueNameCn(String leagueNameCn) {
		this.leagueNameCn = leagueNameCn;
	}
	public String getLeagueNameEn() {
		return leagueNameEn;
	}
	public void setLeagueNameEn(String leagueNameEn) {
		this.leagueNameEn = leagueNameEn;
	}

}
