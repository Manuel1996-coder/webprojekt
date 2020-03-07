package de.hwg_lu.bw.jdbc;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class NoConnectionException extends SQLException {
	
	public NoConnectionException(){
		super("Erzeugung der JDBC-Connection ist fehlgeschlagen");
	}
	public NoConnectionException(String msg){
		super(msg);
	}
	
}
