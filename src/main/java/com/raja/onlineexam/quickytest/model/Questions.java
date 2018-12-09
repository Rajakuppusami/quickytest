package com.raja.onlineexam.quickytest.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int qstNo;
	private String qstType;
	private String qst;
	private String link;
	private String optionType;
	private String options[];
	private String timing;
	private String companyName;
	private String testName;
	private String maxMark;
	private String ans;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQstNo() {
		return qstNo;
	}
	public void setQstNo(int qstNo) {
		this.qstNo = qstNo;
	}
	public String getQstType() {
		return qstType;
	}
	public void setQstType(String qstType) {
		this.qstType = qstType;
	}
	public String getQst() {
		return qst;
	}
	public void setQst(String qst) {
		this.qst = qst;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getOptionType() {
		return optionType;
	}
	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getMaxMark() {
		return maxMark;
	}
	public void setMaxMark(String maxMark) {
		this.maxMark = maxMark;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", qstNo=" + qstNo + ", qstType=" + qstType + ", qst=" + qst + ", link=" + link
				+ ", optionType=" + optionType + ", options=" + Arrays.toString(options) + ", timing="
				+ timing + ", companyName=" + companyName + ", testName=" + testName + ", maxMark=" + maxMark + ", ans="
				+ ans + "]";
	}

}
