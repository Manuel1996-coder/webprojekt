<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="../css/warenkorb.css" />
</head>
<body>
<table summary="Summe der Artikel im Warenkorb">
<caption>Produkte in Ihrem Warenkorb</caption>
<thead>
  <tr>
    <th scope="col">Anzahl</th>
    <th scope="col">Produkt</th>
    <th scope="col">Einzelpreis</th>
    <th scope="col">Gesamt</th>
  </tr>
</thead>
<tfoot>
  <tr>
    <td colspan="3">Summe Warenkorb:</td>
    <td>269,47 EUR</td>
  </tr>
</tfoot>
<tbody>
  <tr>
    <td><input type="text" size="3" value="1"></td>
    <td><a href="#">Digitalkamera: FujiFilm FinePix F100fd</a></td>
    <td>209,19 EUR</td>
    <td>209,19 EUR</td>
  </tr>
  <tr>
    <td><input type="text" size="3" value="2"></td>
    <td><a href="#">Speicherkarte: SanDisk Extreme III SD 4GB</a></td>
    <td>21,75 EUR</td>
    <td>43,50 EUR</td>
  </tr>
  <tr>
    <td><input type="text" size="3" value="1"></td>
    <td><a href="#">Akku: Fuji AccuPower</a></td>
    <td>6,29 EUR</td>
    <td>6,29 EUR</td>
  </tr>
  <tr>
    <td><input type="text" size="3" value="1"></td>
    <td><a href="#">Tasche: Fujifilm Softcase SC-F</a></td>
    <td>10,49 EUR</td>
    <td>10,49 EUR</td>
  </tr>
</tbody>
<colgroup>
  <col width="8%" />
  <col width="56%" />
  <col width="18%" span="2" />
</colgroup>
</table>

<input type="submit" class="btn" name="jetztkaufen" value="Jetzt Kaufen">
<input type="submit" class="btn" name="weitershopen" value="Weiter Shoppen">



</body>
</html>