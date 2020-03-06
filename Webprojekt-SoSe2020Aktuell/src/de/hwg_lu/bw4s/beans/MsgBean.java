package de.hwg_lu.bw4s.beans;

public class MsgBean {

	String infoMsg;
	String actionMsg;
	
	public MsgBean() {
		
		this.setDefault();
	}
	public void setDefault(){
		infoMsg   = "Willkommen zum Fanshop";
		actionMsg = "Was darf's denn sein?";
	}
	
	public void setDone(){
		infoMsg   = "Bestellung wurde gespeichert";
		actionMsg = "<marquee>Vielen Dank f�r Ihre Bestellung!</marquee>";
	}
	
	public void setFail(){
		infoMsg   = "Fehler!";
		actionMsg = "Ihre Bestellung wurde aufgrund eines dummen Fehlers nicht gespeichert, bitte nochmal versuchen!";
	}
	
	public String getInfoMsg() {
		return infoMsg;
	}
	public void setInfoMsg(String infoMsg) {
		this.infoMsg = infoMsg;
	}
	public String getActionMsg() {
		return actionMsg;
	}
	public void setActionMsg(String actionMsg) {
		this.actionMsg = actionMsg;
	}
	
	
	
}
