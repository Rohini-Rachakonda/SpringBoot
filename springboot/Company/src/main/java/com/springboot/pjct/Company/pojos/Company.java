package com.springboot.pjct.Company.pojos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.springboot.pjct.Company.Ipo;

@Entity
@Table(name="Company")
public class Company {
	@Id
	private String companyname;
	private float turnover;
	private String ceo;
	private String boardofdirectors;
	private String listedinstockexchange;
	private String sector;
	private String brief;
	private String stockcode;
	@Transient
	List<Ipo> ipoList;
	public List<Ipo> getIpoList() {
		return ipoList;
	}
	public void setIpoList(List<Ipo> ipoList) {
		this.ipoList = ipoList;
	}
	
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardofdirectors() {
		return boardofdirectors;
	}
	public void setBoardofdirectors(String boardofdirectors) {
		this.boardofdirectors = boardofdirectors;
	}
	public String getListedinstockexchange() {
		return listedinstockexchange;
	}
	public void setListedinstockexchange(String listedinstockexchange) {
		this.listedinstockexchange = listedinstockexchange;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getStockcode() {
		return stockcode;
	}
	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", turnover=" + turnover + ", ceo=" + ceo + ", boardofdirectors="
				+ boardofdirectors + ", listedinstockexchange=" + listedinstockexchange + ", sector=" + sector
				+ ", brief=" + brief + ", stockcode=" + stockcode + "]";
	}
	
	}
