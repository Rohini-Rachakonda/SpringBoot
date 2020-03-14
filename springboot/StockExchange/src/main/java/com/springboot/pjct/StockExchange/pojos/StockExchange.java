package com.springboot.pjct.StockExchange.pojos;



import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="stockexchange")

public class StockExchange {
	@Id
	private int id;
	private String stockexchange;
	private String brief;
	private String contactaddress;
	private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactaddress() {
		return contactaddress;
	}
	public void setContactaddress(String contactaddress) {
		this.contactaddress = contactaddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", stockexchange=" + stockexchange + ", brief=" + brief + ", contactaddress="
				+ contactaddress + ", remarks=" + remarks + "]";
	}
		}

