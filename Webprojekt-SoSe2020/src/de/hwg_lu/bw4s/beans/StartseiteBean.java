package de.hwg_lu.bw4s.beans;

public class StartseiteBean {

	public StartseiteBean() {

	}

	public String getHeaderAsHtml() {
		String header = "";

		header += "<header>\n" + "		<img src=\"../img/imgStart/logo.png\" class=\"logo\">\n"
				+ "			<div class=\"header-menu\">\n"
				+ "					<input type=\"submit\" name=\"home\" value=\"Home\"> <input\n"
				+ "						type=\"submit\" name=\"wir\" value=\"Wer wir sind\"><input\n"
				+ "						type=\"submit\" name=\"einloggen\" value=\"Einloggen\"> <input\n"
				+ "						type=\"submit\" name=\"register\" value=\"Registrieren\">\n"
				+ "				</div>\n" + "</header>";
		header += "";

		return header;
	}

	public String getContentStartseiteAsHtml() {
		String content = "";

		content += "<div class=\"background\">\n" + "\n" + "			<br>\n" + "\n"
				+ "			<p class=\"title1\">Albert Einstein</p>\n" + "\n"
				+ "			<p class=\"title2\">Man muss die Welt nicht verstehen, man muss\n"
				+ "				sich nur darin zurechtfinden.\n"
				+ "			<p class=\"zitat2\">- Albert Einstein</p>\n" + "\n"
				+ "			<div class=\"Porschediv\">\n"
				+ "				<img src=\"../img/imgStart/Albert-Einstein.jpg\" class=\"Porsche\">\n"
				+ "			</div>\n" + "			<br>\n" + "		</div>\n" + "\n"
				+ "		<div id=\"social-platforms\">\n" + "			<h6>follow me</h6>\n" + "			<div>\n"
				+ "				<a class=\"tooltip\" href=\"https://www.facebook.com/NerdsLazy\"\n"
				+ "					data-title=\"Facebook\"><i class=\"fa fa-facebook\"></i><span>Facebook</span></a>\n"
				+ "\n" + "				<a class=\"tooltip\" href=\"https://twitter.com/NerdsLazy\"\n"
				+ "					data-title=\"Twitter\"><i class=\"fa fa-twitter\"></i><span>Twitter</span></a>\n"
				+ "\n" + "				<a class=\"tooltip\" href=\"https://www.instagram.com/lazy.nerds/\"\n"
				+ "					data-title=\"Instagram\"><i class=\"fa fa-instagram\"></i><span>Instagram</span></a>\n"
				+ "\n" + "				<a class=\"tooltip\"\n"
				+ "					href=\"https://de.linkedin.com/in/lazy-nerds-30a0b01a4/en\"\n"
				+ "					data-title=\"LinkedIn\"><i class=\"fa fa-linkedin\"></i><span>LinkedIn</span></a>\n"
				+ "			</div>\n" + "		</div>";

		return content;

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
