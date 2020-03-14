package com.springboot.pjct.StockPrice.pojos;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockprice")

public class StockPrice {
	
	private String companycode;
	@Id
	private String stockexchange;
	private Integer currentprice;
	private String date;
	private String time;
	private String uploadfile;
	public String getCompanycode() {
		return companycode;
	}
	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public Integer getCurrentprice() {
		return currentprice;
	}
	public void setCurrentprice(Integer currentprice) {
		this.currentprice = currentprice;
	}
	
	@Override
	public String toString() {
		return "StockPrice [companycode=" + companycode + ", stockexchange=" + stockexchange + ", currentprice="
				+ currentprice + ", date=" + date + ", time=" + time + ", uploadfile=" + uploadfile + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(String uploadfile) {
		this.uploadfile = uploadfile;
	}
	
	}
