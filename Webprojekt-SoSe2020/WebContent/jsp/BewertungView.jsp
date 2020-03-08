<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bewertung | LazyNerds </title>
</head>
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />
<link type="text/css" rel="stylesheet" href="../css/warenkorb.css" />
<jsp:useBean id="bb" class="de.hwg_lu.bw4s.beans.BewertungBean"
	scope="session" />
<body>
<form action="./BewertungAppl.jsp" method="get">
<h1> Bewerte LazyNerds </h1>
<p>
<span class="sternebewertung">
 <input type="radio" id="stern5" name="bewertung" value="5"><label for="stern5" title="5 Sterne">5 Sterne</label>
 <input type="radio" id="stern4" name="bewertung" value="4"><label for="stern4" title="4 Sterne">4 Sterne</label>
 <input type="radio" id="stern3" name="bewertung" value="3"><label for="stern3" title="3 Sterne">3 Sterne</label>
 <input type="radio" id="stern2" name="bewertung" value="2"><label for="stern2" title="2 Sterne">2 Sterne</label>
 <input type="radio" id="stern1" name="bewertung" value="1"><label for="stern1" title="1 Stern">1 Stern</label>
 <span id="Bewertung"><label><input type="radio" name="bewertung" value="0" checked="checked"></label></span>
</span>
</p>
<br>
<br>
<br>
<br>

Schreibe dein Kommentar:<br>
<input type="text" name="kommentar" value="" placeholder="Dein Kommentar..." >
<br>
<input type="submit" name="speichern" value="Speichern" >
<input type="submit" name="timeline" value="Zur Timeline" >

</form>
</body>
</html>