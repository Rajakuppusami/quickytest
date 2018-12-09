package com.raja.onlineexam.quickytest.model;

public class TestDetails {

	private String companyName;
	private String testName;
	private int noOfQst;
	private int totalMarks;
	private String totalTime;
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
	public int getNoOfQst() {
		return noOfQst;
	}
	public void setNoOfQst(int noOfQst) {
		this.noOfQst = noOfQst;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	@Override
	public String toString() {
		return "TestDetails [companyName=" + companyName + ", testName=" + testName + ", noOfQst=" + noOfQst
				+ ", totalMarks=" + totalMarks + ", totalTime=" + totalTime + "]";
	}
	
}
