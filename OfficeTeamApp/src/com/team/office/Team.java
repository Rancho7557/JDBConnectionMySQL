package com.team.office;

 

public class Team {
	
	private int tcsId;
	private String tcsName;
	private String tcsPhoneNo;
	private String tcsCity;
	
	
	//gettter and setter method using sours file 
	
	public int getTcsId() {
		return tcsId;
	}

	public void setTcsId(int tcsId) {
		this.tcsId = tcsId;
	}

	public String getTcsName() {
		return tcsName;
	}

	public void setTcsName(String tcsName) {
		this.tcsName = tcsName;
	}

	public String getTcsPhoneNo() {
		return tcsPhoneNo;
	}

	public void setTcsPhoneNo(String tcsPhoneNo) {
		this.tcsPhoneNo = tcsPhoneNo;
	}

	public String getTcsCity() {
		return tcsCity;
	}

	public void setTcsCity(String tcsCity) {
		this.tcsCity = tcsCity;
	}

	public Team(int tcsId, String tcsName, String tcsPhoneNo, String tcsCity) {
		super();
		this.tcsId = tcsId;
		this.tcsName = tcsName;
		this.tcsPhoneNo = tcsPhoneNo;
		this.tcsCity = tcsCity;
	}

	public Team(String tcsName, String tcsPhoneNo, String tcsCity) {
		super();
		this.tcsName = tcsName;
		this.tcsPhoneNo = tcsPhoneNo;
		this.tcsCity = tcsCity;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Team [tcsId=" + tcsId + ", tcsName=" + tcsName + ", tcsPhoneNo=" + tcsPhoneNo + ", tcsCity=" + tcsCity
				+ "]";
	}
	
	 

}
