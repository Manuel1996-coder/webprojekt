package de.hwg_lu.bw4s.beans;

public class StartseiteBean {

	public StartseiteBean() {

	}

	public String getHeaderAsHtml() {
		String header = "";

		header += "<header>\n" + "		<a href=\"../jsp/StartseiteView.jsp\"><img src=\"../img/imgStart/logo.png\" class=\"logo\"></a>\n"
				+ "			<div class=\"header-menu\">\n"
				+ "					<input type=\"submit\" name=\"home\" value=\"Home\" class=\"submit\"> <input\n"
				+ "						type=\"submit\" name=\"wir\" value=\"Wer wir sind\" class=\"submit\"> <input\n"
				+ "						type=\"submit\" name=\"einloggen\" value=\"Einloggen\" class=\"submit\"> <input\n"
				+ "						type=\"submit\" name=\"register\" value=\"Registrieren\" class=\"submit\">\n"
				+ "				</div>\n" + "</header>";
		header += "";

		return header;
	}

	public String getContentStartseiteAsHtml() {
		String content = "";

		content += "";

		return content;

	}

	public String getStartFooterAsHtml() {
		String footer = "";

		footer += "<div class=\"footer\">\n"
				+ "			 <input type=\"submit\" name=\"impressum\" value=\"Impressum\" class=\"submit\">\n"
				+ "			<input type=\"submit\" name=\"datenschutz\"\n"
				+ "				value=\"Datenschutz\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"kontakt\" value=\"Kontakt\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"feedback\" value=\"Feedback\" class=\"submit\"><input type=\"submit\"\n"
				+ "				name=\"support\" value=\"Support\" class=\"submit\"><br>\n"
				+ "			<h3>Copyright © 2020 lazyNerds</h3>\n" + "</div>";

		return footer;
	}
	// Fußzeile für logn und reg

	public String getLoginUndRegFooterAsHtml() {
		String footer = "";

		footer += "<div class=\"login-footer\">\n"
				+ "			 <input type=\"submit\" name=\"impressum\" value=\"Impressum\" class=\"submit\">\n"
				+ "			<input type=\"submit\" name=\"datenschutz\"\n"
				+ "				value=\"Datenschutz\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"kontakt\" value=\"Kontakt\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"feedback\" value=\"Feedback\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"support\" value=\"Support\" class=\"submit\"><br>\n"
				+ "			<h3>Copyright © 2020 lazyNerds</h3>\n" + "</div>";

		return footer;
	}

	public String getLoginFooterAsHtml() {
		String footer = "";

		footer += "<div class=\"login-footer\">\n"
				+ "			 <input type=\"submit\" name=\"impressum\" value=\"Impressum\" class=\"submit\">\n"
				+ "			<input type=\"submit\" name=\"datenschutz\"\n"
				+ "				value=\"Datenschutz\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"kontakt\" value=\"Kontakt\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"feedback\" value=\"Feedback\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"support\" value=\"Support\" class=\"submit\"><br>\n"
				+ "			<h3>Copyright © 2020 lazyNerds</h3>\n" + "</div>";

		return footer;

	}
}
