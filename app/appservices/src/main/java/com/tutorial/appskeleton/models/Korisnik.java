package com.tutorial.appskeleton.models;

/**
 * Klasa korisnik
 * 
 * @author dpondeljak
 *
 */

public class Korisnik {

	private int id;
	private String korisnickoIme;
	private String lozinka;
	private String datumUnosa;
	private String datumPromjene;
	private int status;

	public Korisnik() {

	}

	public Korisnik(String pKorisnickoIme, String pLozinka) {
		this.korisnickoIme = pKorisnickoIme;
		this.lozinka = pLozinka;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String pKorisnickoIme) {
		this.korisnickoIme = pKorisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String pLozinka) {
		this.lozinka = pLozinka;
	}

	public String getDatumUnosa() {
		return datumUnosa;
	}

	public void setDatumUnosa(String pDatumUnosa) {
		this.datumUnosa = pDatumUnosa;
	}

	public String getDatumPromjene() {
		return datumPromjene;
	}

	public void setDatumPromjene(String pDatumPromjene) {
		this.datumPromjene = pDatumPromjene;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Korisnik [id=" + id + ", korisnickoIme=" + korisnickoIme + ", lozinka= " + lozinka + ", datumUnosa="
				+ datumUnosa + ", datumPromjene=" + datumPromjene + ", status=" + status + "]";
	}
	
	

}
