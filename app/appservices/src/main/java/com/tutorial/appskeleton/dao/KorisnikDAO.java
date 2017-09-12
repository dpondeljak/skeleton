package com.tutorial.appskeleton.dao;

import com.tutorial.appskeleton.models.Korisnik;

public interface KorisnikDAO {

	public void createKorisnik(Korisnik pKorisnik);
	
	public Korisnik findKorisnikaById(int id);
	
	public void updateKorisnik(int id, Korisnik pKorisnik);
	
	public void deleteKorisnik(int id);
	
}
