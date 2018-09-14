package com.soccer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TeamInfo {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String teamUnique;
	private String teamNameCn;
	private String teamNameEn;
	private String countryRegion;
	private String city;
	private String home;
	private String telephone;
	private String email;
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeamUnique() {
		return teamUnique;
	}
	public void setTeamUnique(String teamUnique) {
		this.teamUnique = teamUnique;
	}
	public String getTeamNameCn() {
		return teamNameCn;
	}
	public void setTeamNameCn(String teamNameCn) {
		this.teamNameCn = teamNameCn;
	}
	public String getTeamNameEn() {
		return teamNameEn;
	}
	public void setTeamNameEn(String teamNameEn) {
		this.teamNameEn = teamNameEn;
	}
	public String getCountryRegion() {
		return countryRegion;
	}
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public TeamInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TeamInfo(String teamUnique, String teamNameCn, String teamNameEn, String countryRegion,
			String city, String home, String telephone, String email, String address) {
		super();
		this.teamUnique = teamUnique;
		this.teamNameCn = teamNameCn;
		this.teamNameEn = teamNameEn;
		this.countryRegion = countryRegion;
		this.city = city;
		this.home = home;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teamUnique=").append(teamUnique);
        sb.append(", teamNameCn=").append(teamNameCn);
        sb.append(", teamNameEn=").append(teamNameEn);
        sb.append(", countryRegion=").append(countryRegion);
        sb.append(", city=").append(city);
        sb.append(", home=").append(home);
        sb.append(", telephone=").append(telephone);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append("]");
        return sb.toString();
    }

}
