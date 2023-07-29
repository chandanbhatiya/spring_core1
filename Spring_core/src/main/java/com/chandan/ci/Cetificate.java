package com.chandan.ci;

public class Cetificate {
	
	private int id;
	private String certificatename;
	public Cetificate(int id, String certificatename) {
		super();
		this.id = id;
		this.certificatename = certificatename;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", certificatename=" + certificatename + "]";
	}
	
	

}
