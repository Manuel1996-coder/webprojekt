package de.hwg_lu.bw4s.beans;

public class StartseiteBean {

	public StartseiteBean() {
	}

	// kopfzeile als Html
	public String getHeaderAsHtml() {
		String header = "";

		header += "<header>\n"
				+ "		<a href=\"../jsp/PortalView.jsp\"><img src=\"../img/imgStart/logo.png\" class=\"logo\" title=\"lazyNerds\"/></a>\n"
				+ "					<div class=\"header-menu\">\n"
				+ "									<input type=\"submit\" name=\"home\" value=\"Home\" class=\"submit\"> <input \n"
				+ "									type=\"submit\" name=\"wir\" value=\"Wer wir sind\" class=\"submit\"> <input\n"
				+ "								type=\"submit\" name=\"einloggen\" value=\"Einloggen\" class=\"submit\"> <input\n"
				+ "									type=\"submit\" name=\"register\" value=\"Registrieren\" class=\"submit\">\n"
				+ "								</div> </header>";

		return header;
	}

	// Fußzeile für StartseiteView als Html
	public String getStartFooterAsHtml() {
		String footer = "";

		footer += "<div class=\"start-footer\">\n"
				+ "			 <input type=\"submit\" name=\"impressum\" value=\"Impressum\" class=\"submit\">\n"
				+ "			<input type=\"submit\" name=\"datenschutz\"\n"
				+ "				value=\"Datenschutz\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"feedback\" value=\"Feedback\" class=\"submit\"><input type=\"submit\"\n"
				+ "				name=\"support\" value=\"Support\" class=\"submit\"><br>\n"
				+ "			<h3>Copyright © 2020 lazyNerds</h3>\n" + "</div>";

		return footer;
	}

	// Fußzeile für login und reg -- ausnahme
	public String getLoginUndRegFooterAsHtml() {
		String footer = "";

		footer += "<div class=\"login-footer\">\n"
				+ "			 <input type=\"submit\" name=\"impressum\" value=\"Impressum\" class=\"submit\">\n"
				+ "			<input type=\"submit\" name=\"datenschutz\"\n"
				+ "				value=\"Datenschutz\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"feedback\" value=\"Feedback\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"support\" value=\"Support\" class=\"submit\"><br>\n"
				+ "			<h3>Copyright © 2020 lazyNerds</h3>\n" + "</div>";

		return footer;
	}

	// Fußzeile für andere Views als Html
	public String getLoginFooterAsHtml() {
		String footer = "";

		footer += "<div class=\"login-footer\">\n"
				+ "			 <input type=\"submit\" name=\"impressum\" value=\"Impressum\" class=\"submit\">\n"
				+ "			<input type=\"submit\" name=\"datenschutz\"\n"
				+ "				value=\"Datenschutz\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"feedback\" value=\"Feedback\" class=\"submit\"> <input type=\"submit\"\n"
				+ "				name=\"support\" value=\"Support\" class=\"submit\"><br>\n"
				+ "			<h3>Copyright © 2020 lazyNerds</h3>\n" + "</div>";

		return footer;

	}

	// icons als HTMl
	public String getSocialButtons() {
		String icon = "";
		icon += "<div id=\"social-platforms\">\n" + "\n" + "			<h6>follow me</h6>\n" + "			<div>\n"
				+ "				<a class=\"tooltip\" href=\"https://www.facebook.com/NerdsLazy\"\n"
				+ "					data-title=\"Facebook\"><i class=\"fa fa-facebook\"></i><span>Facebook</span></a>\n"
				+ "\n" + "				<a class=\"tooltip\" href=\"https://twitter.com/NerdsLazy\"\n"
				+ "					data-title=\"Twitter\"><i class=\"fa fa-twitter\"></i><span>Twitter</span></a>\n"
				+ "\n" + "				<a class=\"tooltip\" href=\"https://www.instagram.com/lazy.nerds/\"\n"
				+ "					data-title=\"Instagram\"><i class=\"fa fa-instagram\"></i><span>Instagram</span></a>\n"
				+ "\n" + "				<a class=\"tooltip\"\n"
				+ "					href=\"https://de.linkedin.com/in/lazy-nerds-30a0b01a4/en\"\n"
				+ "					data-title=\"LinkedIn\"><i class=\"fa fa-linkedin\"></i><span>LinkedIn</span></a>\n"
				+ "			</div>	</div>";
		return icon;
	}
}
