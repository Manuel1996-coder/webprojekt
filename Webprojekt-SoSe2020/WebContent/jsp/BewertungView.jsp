<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bewertung | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />
<body>
	<jsp:useBean id="bb" class="de.hwg_lu.bw4s.beans.BewertungBean"
		scope="session" />
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<form action="./BewertungAppl.jsp" method="get">
		<div class="background">

	
				<h1>Traue dich! Sei ehrlich! Sei realistisch!
				<br>Erzähle uns, wie gut wir sind...</h1>
				<div class="Rand">
					<div class="Kastenmitte">
						<div style="text-align: center;">
							<div style="display: inline-block; text-align: left;">
								<h2>
									<span class="sternebewertung"> <input type="radio"
										id="stern5" name="bewertung" value="5"><label
										for="stern5" title="5 Sterne">5 Sterne</label> <input
										type="radio" id="stern4" name="bewertung" value="4"><label
										for="stern4" title="4 Sterne">4 Sterne</label> <input
										type="radio" id="stern3" name="bewertung" value="3"><label
										for="stern3" title="3 Sterne">3 Sterne</label> <input
										type="radio" id="stern2" name="bewertung" value="2"><label
										for="stern2" title="2 Sterne">2 Sterne</label> <input
										type="radio" id="stern1" name="bewertung" value="1"><label
										for="stern1" title="1 Stern">1 Stern</label> <span
										id="Bewertung"><label><input type="radio"
												name="bewertung" value="0" checked="checked"></label></span>
									</span>
								</h2>
							</div>
						</div>
					</div>

					<br> <br> <br> <br>
					<h2>Bewerte lazyNerds mit einem Kommentar...</h2>
					
					<div class="Kasten">
						<input type="text" name="kommentar" value=""
							placeholder="Dein Kommentar...">
							</div>
					
						<input type="submit" name="speichern" value="Speichern"
							class="submitBewertung"> <input type="submit"
							name="timeline" value="Zur Timeline" class="submitBewertung">
						
					</div>
					
				</div> 
	</form>

	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>