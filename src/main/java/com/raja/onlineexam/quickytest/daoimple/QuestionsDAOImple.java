package com.raja.onlineexam.quickytest.daoimple;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raja.onlineexam.quickytest.dao.QuestionsDAO;
import com.raja.onlineexam.quickytest.model.CompanyTestList;
import com.raja.onlineexam.quickytest.model.Questions;

@Service
public class QuestionsDAOImple {
	
	private static Logger logger=LogManager.getLogger(QuestionsDAOImple.class);

	@Autowired
	QuestionsDAO questionsdao;

	public List<Questions> getAllQuestions() {
		logger.debug("Enter into questionsdao for getting all question from db");
		List<Questions> list =new ArrayList<Questions>();
		questionsdao.findAll().forEach(questions -> list.add(questions));
		return list;
	}

	public void addQuestions(Questions question) {
		logger.debug("Enter into questionsdao for adding question to db");
		questionsdao.save(question);
	}

	public List<Questions> findQuestionsByCompanyName(String companyName) {
		List<Questions> list =new ArrayList<Questions>();
		questionsdao.findQuestionsByCompanyName(companyName).forEach(question -> list.add(question));
		return list;
	}

	public List<Questions> findQuestionsByCompanyNameAndTestname(String companyName, String testName) {
		List<Questions> list =new ArrayList<Questions>();
		questionsdao.findQuestionsByCompanysAndTestname(companyName, testName).forEach(question -> list.add(question));
		return list;
	}

	public List<CompanyTestList> findQuestionsByCompanysGroupByTestName(String companyName) {
		List<CompanyTestList> list =new ArrayList<CompanyTestList>();
		questionsdao.findQuestionsByCompanysGroupByTestName(companyName).forEach(question -> list.add(question));
		return list;
	}
	
	
	
}
