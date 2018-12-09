package com.raja.onlineexam.quickytest.model;

public class CompanyTestList {

	private String companyName;
	private String testName;
	private long questionCount;
	
	public CompanyTestList(String companyName, String testName, long questionCount) {
		this.companyName = companyName;
		this.testName = testName;
		this.questionCount = questionCount;
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

	public long getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(long questionCount) {
		this.questionCount = questionCount;
	}

	@Override
	public String toString() {
		return "CompanyTestList [companyName=" + companyName + ", testName=" + testName + ", questionCount="
				+ questionCount + "]";
	}
	
}
