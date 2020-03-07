package de.hwg_lu.bw4s.beans;

public class StartseiteBean {

	public StartseiteBean() {

	}

	public String getHeaderAsHtml() {
		String header = "<header>\n" + "		<img src=\"../img/imgStart/logo.png\" class=\"logo\">\n"
				+ "			<div class=\"header-menu\">\n"
				+ "					<input type=\"submit\" name=\"home\" value=\"Home\"> <input\n"
				+ "						type=\"submit\" name=\"wir\" value=\"Wer wir sind\"><input\n"
				+ "						type=\"submit\" name=\"einloggen\" value=\"Einloggen\"> <input\n"
				+ "						type=\"submit\" name=\"register\" value=\"Registrieren\">\n"
				+ "				</div>\n" + "</header>";
		header += "";

		return header;
	}

	public String getFooterAsHtml() {
		String footer = "";

		footer += "<div class=\"footer\">\n"
				+ "			 <input type=\"submit\" name=\"impressum\" value=\"Impressum\">\n"
				+ "			<input type=\"submit\" name=\"datenschutz\"\n"
				+ "				value=\"Datenschutz\"> <input type=\"submit\"\n"
				+ "				name=\"kontakt\" value=\"Kontakt\"> <input type=\"submit\"\n"
				+ "				name=\"feedback\" value=\"Feedback\"> <br>\n"
				+ "			<h3>Copyright © 2020 lazyNerds</h3>\n" + "		</div>";

		return footer;
	}
}
