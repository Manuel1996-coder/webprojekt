package de.hwg_lu.bw4s.beans;

public class Bewertung {
	
	String kommentar;
	String sterne;
	String matrikid;
	boolean flux;
	
	
	
	public Bewertung() {
		super();
	}
	
	
	public Bewertung(String kommentar, String sterne, String matrikid) {
		super();
		this.kommentar = kommentar;
		this.sterne = sterne;
		this.matrikid = matrikid;
	}
	
	// Kommentar auf die rechte Seite
	public String bewertung() {
		String html = "";
	
			html += "<div class='container right'>";
			html +=  "<div class='content'>";
			html +=  "<h2>" +this.kommentar +"</h2>";
			html +=  "<p> hat mit " +this.sterne +"/5 Sternen bewertet.</p>";
			html +=  "<p>"+  this.matrikid +  "</p>";
			html +=  "</div>";
			html += "</div>";
		

		return html;
	}
	
	// Kommentar auf die linke Seite
	public String bewertung2() {
		
		String html = "";
		
		html += "<div class='container left'>";
		html +=  "<div class='content'>";
		html +=  "<h2>" +this.kommentar +"</h2>";
		html +=  "<p>"+  this.matrikid +  "</p>";
		html +=  "</div>";
		html += "</div>";
		
		
		return html;
	}
	
	
	
	
	
	
	
	
	public String getKommentar() {
		return kommentar;
	}
	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}
	public String getSterne() {
		return sterne;
	}
	public void setSterne(String sterne) {
		this.sterne = sterne;
	}
	public String getMatrikid() {
		return matrikid;
	}
	public void setMatrikid(String matrikid) {
		this.matrikid = matrikid;
	}


	
	
	

}
