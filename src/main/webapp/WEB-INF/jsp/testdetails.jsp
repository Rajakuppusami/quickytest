<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/webjars/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script type="text/javascript" src="/webjars/bootstrap/4.1.2/js/bootstrap.min.js"></script>
</head>
<body>
<div>
	<form action="/submittestdetails" method="post">
		<p>Fill the detail to create a test</p><br>
		Company Name <input type="text" name="companyName"><br>
		Test Name <input type="text" name="testName"><br>
		Number of questions <input type="number" name="noOfQst"><br>
		Total Marks <input type="number" name="totalMarks"><br>
		Total Time <input type="number" name="totalTime"><br>
		<input type="submit">
	</form>
</div>
</body>
</html>