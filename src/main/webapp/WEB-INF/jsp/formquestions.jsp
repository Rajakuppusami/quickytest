<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Question</title>
<link href="/webjars/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script type="text/javascript" src="/webjars/bootstrap/4.1.2/js/bootstrap.min.js"></script>
<script type="text/javascript">
	var testName='${testName}';
	var noOfQst=${noOfQst};
	var totalMarks=${totalMarks};
	var totalTime='${totalTime}';
	
	$(document).ready(function(){
	   
	});
</script>
</head>
<body>
	<p> Given Details <br> Test Name ${testName}<br> No. Of. Questions ${noOfQst}<br> Total Marks ${totalMarks}<br> Total Time ${totalTime} </p>
	<div>
		Question No. <input type="text" name="qstNo" value="1" disabled="disabled"><br>
		Question Type <select name="qstType">
						  <option value="PASSAGE">Passage</option>
						  <option value="FILL_UPS">Fill Ups</option>
						  <option value="OPTION">option</option>
						  <option value="REARRAGE">Rearrange</option>
					  </select><br>
		Question <textarea name="">Enter Questions</textarea><br>
		Image <input type="file"><br>
		Answer Type <select name="optionType">
						  <option value="MULTICHOICES">MultiChoices</option>
						  <option value="CHOOSE_THE_BEST">Choose the best</option>
						  <option value="FILL_UPS">Fill Ups</option>
					</select><br>
		Options :<div id="options"></div><input type="text"><button id="addoptions">Add Options</button><br>
		Time to complete this question <input type="text" name="timing"><br>
		Maximium Mark to this question <input type="number"><br>
		Answer <input type="text" name="ans"><br>
		<button id="addquestions">Add Questions</button>		
	</div>
</body>
</html>