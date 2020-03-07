package de.hwg_lu.bw4s.beans;

public class StartseiteBean {

	public StartseiteBean() {

	}

	
	
	
	
	
	public String getFooterAsHtml() {
		String footer = "";

		footer += "<div class=\"footer\">\n"
				+ "			<input type=\"submit\" id=\"submit\" name=\"home\" value=\"Home\"> <input\n"
				+ "				type=\"submit\" id=\"submit\" name=\"impressum\" value=\"Impressum\">\n"
				+ "			<input type=\"submit\" id=\"submit\" name=\"datenschutz\"\n"
				+ "				value=\"Datenschutz\"> <input type=\"submit\" id=\"submit\"\n"
				+ "				name=\"kontakt\" value=\"Kontakt\"> <input type=\"submit\"\n"
				+ "				id=\"submit\" name=\"feedback\" value=\"Feedback\"> <br>\n"
				+ "			<h3>Copyright © 2020 lazyNerds</h3>\n" + "		</div>";

		return footer;
	}
}
