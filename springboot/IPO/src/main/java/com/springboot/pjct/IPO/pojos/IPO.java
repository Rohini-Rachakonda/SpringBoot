package com.springboot.pjct.IPO.pojos;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IPO")
public class IPO {
	@Id
	private int id;
	private String companyname;
	private String stockexchange;
	private float pricepershare;
	private int numofshares;
	Date openDateTime=new Date();
	private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public float getPricepershare() {
		return pricepershare;
	}
	public void setPricepershare(float pricepershare) {
		this.pricepershare = pricepershare;
	}
	public int getNumofshares() {
		return numofshares;
	}
	public void setNumofshares(int numofshares) {
		this.numofshares = numofshares;
	}
	public Date getopenDateTime() {
		return openDateTime;
	}
	public void setopenDateTime(Date openDateTime) {
		openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPO [id=" + id + ", companyname=" + companyname + ", stockexchange=" + stockexchange
				+ ", pricepershare=" + pricepershare + ", numofshares=" + numofshares + ", openDateTime=" + openDateTime
				+ ", remarks=" + remarks + "]";
	}
	}
