package com.example.sqlconnect.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee_tb {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="cus_name", columnDefinition = "VARCHAR(50)")
	private String name;
	
	@Column(name ="package_name", columnDefinition = "VARCHAR(50)")
	private String packname;
	
	@Column(name ="remaining_data", columnDefinition = "INT")
	private int remaining;
	
	@Column(name ="password", columnDefinition = "VARCHAR(50)")
	private String password;
	
	@Column(name ="Total_payable", columnDefinition = "int")
	private int totalpayable;
	
	
	public String toString()
	{
		return name+ ":" +id+ ":" +packname + ":" +remaining + ":" + password + ":" + totalpayable;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPackname() {
		return packname;
	}


	public void setPackname(String packname) {
		this.packname = packname;
	}


	public int getRemaining() {
		return remaining;
	}


	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}


	public int getTotalpayable() {
		return totalpayable;
	}


	public void setTotalpayable(int totalpayable) {
		this.totalpayable = totalpayable;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
}
