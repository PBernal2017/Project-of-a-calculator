<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<form:form modelAttribute="R">
		<form:label path="input1">
			<spring:message code="input1" />
		</form:label>
		<form:input path="input1" />
		
		<form:label path="input2">
			<spring:message code="input2" />
		</form:label>
		<form:input path="input2" />
		
		<button type="submit" name= save">Resultado</button>
		

	</form:form>
	<form:form modelAttribute="M">
		<form:label path="input1">
			<spring:message code="input1" />
		</form:label>
		<form:input path="input1" />
		
		<form:label path="input2">
			<spring:message code="input2" />
		</form:label>
		<form:input path="input2" />
		
		<button type="submit" name= save">Resultado</button>
		

	</form:form>
	




</body>
</html>
