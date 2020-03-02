package de.hwg_lu.bw4s.beans;

public class Artikel {
	int anr;
	String aname;
	double preis;
		
	public Artikel(int anr, String aname, double preis) {
		super();
		this.anr = anr;
		this.aname = aname;
		this.preis = preis;
	}
	public String toKaestchen(){
		String html = "";
				
		html += "<input type='checkbox' name='artikel' value='" + this.anr +"' />";
		html += this.aname + ", EUR " + this.preis;
		html += "<img src='../img/" + this.anr +".jpg' />";
				
		return html;
	}
	
	public int getAnr() {
		return anr;
	}
	public void setAnr(int anr) {
		this.anr = anr;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
}
