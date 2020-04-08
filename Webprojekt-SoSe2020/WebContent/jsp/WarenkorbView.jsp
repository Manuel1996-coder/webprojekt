
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Warenkorb | lazyNerds</title>
<link type="text/css" rel="stylesheet" href="../css/warenkorb.css" />

</head>

<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />

<body>
<form action="./WarenkorbAppl.jsp" method="get">

	<h1>Dein Warenkorb</h1>
	<table border="1">

		<tr>
			<th>Anzahl </th>
			<th>Produkt</th>
			<th>Modul</th>
			<th>Preis</th>
			<th>Gesamt</th>
		</tr>
		<tr>
		<%=kb.getHTMLFromAusgewaehlteWarenkorbProdukte()%>
		</tr>
		<tr>
            <td> </td>
			<td> </td>
			<td> </td>
			<td>Summe Warenkorb:</td>
			<td> <%= kb.getSumme()%> EUR </td>
		</tr>

	</table>

	<br>
	<input type="submit" name="jetztkaufen"
		value="Jetzt Kaufen">
	<input type="submit" name="weitereinkaufen"
		value="Weiter Einkaufen">
	
	<input type="submit" name="zurueckzp"
		value="Zum Portal">
		
		<input type="submit" name="warenkorb"
		value="Warenkorb Loeschen" >


</form>
</body>
</html>