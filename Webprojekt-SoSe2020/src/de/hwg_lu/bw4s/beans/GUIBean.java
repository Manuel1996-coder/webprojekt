package de.hwg_lu.bw4s.beans;

public class GUIBean {
	public GUIBean() {
	}

	public String getHtmlHeadline(){
		String html = "";
		html +="<table>\n";
		html +="<tr>\n";
		html +="	<td>\n";
		html +="		<h4>BW4S-Portal</h4>\n";
		html +="	</td>\n";
		html +="	<td>\n";
		html +="		<img src='../img/HWGLU_logo.png' width='150' />\n";	
		html +="	</td>\n";
		html +="</tr>\n";
		html +="</table>\n";
		return html;
	}
	
}
