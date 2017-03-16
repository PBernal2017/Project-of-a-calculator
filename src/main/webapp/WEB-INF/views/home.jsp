<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<form:form modelAttribute="resta">
		<form:label path="Num1">
			<spring:message code="num1" />
		</form:label>
		<form:input path="num1" />
		
		<form:label path="Num2">
			<spring:message code="num2" />
		</form:label>
		<form:input path="num2" />
		
		<button type="submit" name= save">Resultado</button>
		



	</form:form>




</body>
</html>
