<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ABWLVIEW</title>
<link type="text/css" rel="stylesheet" href="../css/AlleModule.css" />
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />
</head>
<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />

<body>


	<h1><jsp:getProperty property="prof" name="kb" /></h1>





	<jsp:getProperty property="titel" name="kb" />

	<jsp:getProperty property="sprechstunde" name="kb" />



	<jsp:getProperty property="lehrgebiete" name="kb" />




	<jsp:getProperty property="forschungsschwerpunkte" name="kb" />
	<jsp:getProperty property="publikationen" name="kb" />










</body>
</html>