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
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<form action="./AgendaAppl.jsp" method="get">

		<h1>
			<%=kb.getModulValue()%>
		</h1>
		<div class="background">
			<div class="kasten">
				<div style="text-align: center;">
					<div style="display: inline-block; text-align: left;">
						<table>
							<tr>
								<td>
									<button class="glow-on-hover" type="submit" name="prof"
										value="PROF">PROF</button>
								</td>
								<td>
									<button class="glow-on-hover" type="submit" name="skript"
										value="SKRIPT">SKRIPT</button>
								</td>
							</tr>
							<tr>
								<td>
									<button class="glow-on-hover" type="submit" name="Literatur"
										value="LITERATUR">LITERATUR</button>
								</td>
								<td>
									<button class="glow-on-hover" type="submit" name="Altklausuren"
										value="ALTKLAUSUREN">ALTKLAUSUREN</button>
								</td>
							</tr>
							<tr>
								<td>
									<button class="glow-on-hover" type="submit" name="zurueck"
										value="Zurück">Zurück</button>
								</td>
								<td>
									<button class="glow-on-hover" type="submit" name="quiz"
										value="Quiz">Quiz</button>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>
	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>