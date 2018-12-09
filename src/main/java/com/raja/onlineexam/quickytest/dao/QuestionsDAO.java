package com.raja.onlineexam.quickytest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.raja.onlineexam.quickytest.model.CompanyTestList;
import com.raja.onlineexam.quickytest.model.Questions;

public interface QuestionsDAO extends CrudRepository<Questions, Long> {

	public List<Questions> findQuestionsByCompanyName(String companyName);
	
	public List<Questions> findQuestionByTestName(String testName);
	
	@Query("select q from Questions q where q.companyName = ?1 order by q.testName")
	public List<Questions> findQuestionByCompanysOrderByTestName(String companyName);
	
	@Query("select new com.raja.onlineexam.quickytest.model.CompanyTestList(q.companyName,q.testName,count(q.testName)) from Questions q where q.companyName =?1 group by q.testName")
	public List<CompanyTestList> findQuestionsByCompanysGroupByTestName(String companyName);
	
	@Query("select q from Questions q where q.companyName= ?1 and q.testName= ?2")
	public List<Questions> findQuestionsByCompanysAndTestname(String companyName,String testname);
	
}
