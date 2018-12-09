package com.raja.onlineexam.quickytest.controller;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.raja.onlineexam.quickytest.daoimple.QuestionsDAOImple;
import com.raja.onlineexam.quickytest.model.CompanyTestList;
import com.raja.onlineexam.quickytest.model.Questions;
import com.raja.onlineexam.quickytest.model.TestDetails;

@Controller
public class MainController {

	@Autowired
	QuestionsDAOImple questiondaoimpl;
	
	private static Logger logger=LogManager.getLogger(MainController.class);
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
		logger.debug("Enter into sample test page ...");
		model.put("message", "sample");
		logger.debug("----Exit----");
		return "test";
	}
	
	@GetMapping("/questions")
	@ResponseBody
	public List<Questions> getQuestions() {
		logger.debug("Enter into get all question controller ...");
		return questiondaoimpl.getAllQuestions();
	}
	
	@PostMapping("/addquestions")
	@ResponseBody
	public int addQuestion(@RequestBody Questions question) {
		logger.debug("Enter into add question controller ...");
		questiondaoimpl.addQuestions(question);
		logger.debug("Question are updated in db.");
		return question.getQstNo();
	}
	
	@GetMapping("/{companyName}/questions")
	@ResponseBody
	public List<Questions> getQuestionsByCompanyName(@PathVariable String companyName) {
		logger.debug("Enter into get all question controller ...");
		return questiondaoimpl.findQuestionsByCompanyName(companyName);
	}
	
	@GetMapping("/{companyName}/{testName}/questions")
	@ResponseBody
	public List<Questions> getQuestionsByCompanyNameAndTestname(@PathVariable String companyName, @PathVariable String testName) {
		logger.debug("Enter into get all question controller ...");
		return questiondaoimpl.findQuestionsByCompanyNameAndTestname(companyName,testName);
	}
	
	@GetMapping("/{companyName}/testlist")
	@ResponseBody
	public List<CompanyTestList> getQuestions(@PathVariable String companyName) {
		logger.debug("Enter into get all question controller ...");
		return questiondaoimpl.findQuestionsByCompanysGroupByTestName(companyName);
	}
	
	@GetMapping("/testdetails")
	public String getTestDetails() {
		return "testdetails";
	}
	
	@PostMapping("/submittestdetails")
	public ModelAndView getTestdetailsvalues(@ModelAttribute TestDetails testdetails) {
		ModelAndView model =new ModelAndView("formquestions");
		model.addObject("testName", testdetails.getTestName());
		model.addObject("noOfQst", testdetails.getNoOfQst());
		model.addObject("totalMarks", testdetails.getTotalMarks());
		model.addObject("totalTime", testdetails.getTotalTime());
		logger.debug("Testdetils object :"+testdetails.toString());
		return model;
	}
	
	
}
