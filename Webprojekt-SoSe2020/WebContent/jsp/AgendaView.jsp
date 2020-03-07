<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda | lazyNerds</title>

<link type="text/css" rel="stylesheet" href="../css/agenda.css" />
</head>


<body>

<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />



<form action="./AgendaAppl.jsp" method="get">

<h1> <%= kb.getModul() %> </h1>


<table class="box">


<tr>
<td> <button class="glow-on-hover" type="submit" name="prof" value="PROF" >PROF</button></td>
<td> <button class="glow-on-hover" type="submit" name="skript" value="SKRIPT" >SKRIPT</button></td>



</tr>
<tr>



<td> <button class="glow-on-hover" type="submit" name="Literatur" value="LITERATUR" >LITERATUR</button></td>
<td> <button class="glow-on-hover" type="submit" name="Altklausuren" value="ALTKLAUSUREN" >ALTKLAUSUREN</button></td>

</tr>


<tr>



<td> <button class="glow-on-hover" type="submit" name="zurueck" value="Zurück" >Zurück</button></td>
<td> <button class="glow-on-hover" type="submit" name="notizen" value="Meine Notizen" >Notizen</button></td>


</tr>







</table>


 



</form>



</body>
</html>