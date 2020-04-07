<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/Startseite.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Datenschutz | lazyNerds</title>
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>
	<form action="../jsp/StartseiteAppl.jsp" method="get">

		<!-- HEADER-->

		<jsp:getProperty property="headerAsHtml2" name="sb" />

		<!-- CONTENT -->

		<div class="background">
			<br>
			<p class="title1">Datenschutzerklärung</p>

			<p class="title2">I. Name des Verantwortlichen</p>
			<div class="kasten">
				<p class="untertext">
					Der Verantwortliche im Sinne der EU-Datenschutz-Grundverordnung,
					des Bundesdatenschutzgesetzes und des rheinland-pfälzischen
					Landesdatenschutzgesetzes sowie sonstiger datenschutzrechtlicher
					Bestimmungen ist die Hochschule für Wirtschaft und Gesellschaft
					Ludwigshafen vertreten durch den Präsidenten <br>E-Mail:
					datenschutz@lazyNerds.de  
				</p>
			</div>
			<p class="title2">II. Kontaktdaten der/des
				Datenschutzbeauftragten</p>
			<div class="kasten">
				<p class="untertext">
					Datenschutzbeauftragte(r) der Hochschule für Wirtschaft und
					Gesellschaft Ludwigshafen <br>Tel.: +49 123 456 - 7 <br>E-Mail:
					datenschutz@lazyNerd.de <br>Website: www.lazyNerds.de
				</p>
			</div>

			<p class="title2">III. Allgemeines zur Datenverarbeitung</p>
			<div class="kasten">
				<p class="untertext">Wir verarbeiten personenbezogene Daten
					unserer Nutzer grundsätzlich nur, soweit dies zur Bereitstellung
					einer funktionsfähigen Website sowie unserer Inhalte und Leistungen
					erforderlich ist. Die Verarbeitung personenbezogener Daten unserer
					Nutzer erfolgt regelmäßig nur nach Einwilligung des Nutzers. Eine
					Ausnahme gilt in solchen Fällen, in denen eine vorherige Einholung
					einer Einwilligung aus tatsächlichen Gründen nicht möglich ist und
					die Verarbeitung der Daten durch gesetzliche Vorschriften gestattet
					ist.</p>
			</div>
			<p class="title2">IV. Bereitstellung der Website und Erstellung
				von Logfiles</p>
			<div class="kasten">
				<p class="untertext">Beim Zugriff auf das Internetangebot der
					Hochschule für Wirtschaft und Gesellschaft Ludwigshafen werden die
					folgenden Daten in einer Protokolldatei gespeichert:</p>

				<ul>
					<li>IP-Adresse</li>
					<li>Datum und Uhrzeit des erfolgten Zugriffs</li>
					<li>aufgerufene Seite bzw. Name der abgerufenen Datei</li>
					<li>Meldung, ob der Zugriff auf die Seite bzw. der Abruf der
						Datei erfolgreich war</li>
					<li>übertragene Datenmenge</li>
					<li>verwendeter Web-Browser und genutztes Betriebssystem</li>
				</ul>

				<p class="untertext">Die Daten werden in den Logfiles unseres
					Systems gespeichert. Nicht hiervon betroffen sind die IP-Adressen
					des Nutzers oder andere Daten, die die Zuordnung der Daten zu einem
					Nutzer ermöglichen. Eine Speicherung dieser Daten zusammen mit
					anderen personenbezogenen Daten des Nutzers findet nicht statt.</p>
			</div>
			<br>
		</div>

		<!-- Icons -->
		<jsp:getProperty property="socialButtons" name="sb" />

		<!-- FOOTER -->
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>