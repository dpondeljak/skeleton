package com.tutorial.appskeleton.models;

public class PrijavaKorisnika {
	private String korisnickoIme;
	private String lozinka;
	private String datumZadnjePrijave;
	private String ipAdresa;
	
	
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	public String getDatumZadnjePrijave() {
		return datumZadnjePrijave;
	}
	public void setDatumZadnjePrijave(String datumZadnjePrijave) {
		this.datumZadnjePrijave = datumZadnjePrijave;
	}
	public String getIpAdresa() {
		return ipAdresa;
	}
	public void setIpAdresa(String ipAdresa) {
		this.ipAdresa = ipAdresa;
	}
	
}
