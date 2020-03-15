<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/warenkorb.css" />
<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />
<body>
	<form action="./WarenkorbAppl.jsp" method="get">
		<h1>Vielen Dank für Deine Bestellung.</h1>
		<h2>Die Rechnung</h2>
		<table border="1">

			<tr>
				<th>Anzahl</th>
				<th>Produkt</th>
				<th>Modul</th>
				<th>Preis</th>
				<th>Gesamt</th>
				<th>Löschen</th>
			</tr>


			<%=kb.getHTMLFromAusgewaehlteWarenkorbProdukte()%>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>Summe Rechnung:</td>
				<td><%=kb.getSumme()%></td>
			</tr>

		</table>

		<br> <input type="submit" name="weitereinkaufen"
			value="Weiter Einkaufen"> <input type="submit"
			name="zurueckzp" value="Zum Portal">


	</form>
</body>
</html>