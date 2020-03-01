package de.hwg_lu.bw4s.beans;

public class SkriptBean {
	
	
	public String pdf(String modul){
		String html = "";
        switch(modul){
        case "ABWLBUCHF":
        	
    		html +="<table>\n";
    		html +="<tr>\n";
    		html +="	<td>\n";
    		html +="		<h4>Wirtschaftsinformatik-Portal</h4>\n";
    		html +="	</td>\n";
    		html +="	<td>\n";
    		html +="		<img src='../img/HWGLU_logo.png' width='150' />\n";	
    		html +="	</td>\n";
    		html +="</tr>\n";
    		html +="</table>\n";
        	
            break;
        case "WM":
            System.out.println("i ist eins");
            break;
        case "SK":
            System.out.println("i ist zwei");
            break;
        case "WI":
            System.out.println("i ist drei");
            break;
        case "prog1":
            System.out.println("i ist drei");
            break;
        default:
            System.out.println("i liegt nicht zwischen null und drei");
        }
        
        return html;
    }

}
