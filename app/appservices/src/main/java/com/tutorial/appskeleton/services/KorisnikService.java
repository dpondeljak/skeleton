package com.tutorial.appskeleton.services;

import java.util.List;

import com.tutorial.appskeleton.models.Korisnik;

/**
 * 
 * @author dpondeljak
 *
 */
public interface KorisnikService{
	/**
	 * spremanje korisnika 
	 * @param pKorisnik - korisnički objekt
	 */
	public void spremiKorisnika(Korisnik pKorisnik);
	
	/**
	 * Traženje korisnika po id-u
	 * @param id
	 * @return objekt pronadjenog korisnika 
	 */
	public Korisnik nadjiKorisnikaById(int id);
	
	/**
	 * Traženje korisnika po korisničkom imenu 
	 * @param pKorisnickoIme
	 * @return Korisnik objekt
	 */
	public Korisnik nadjiKorisnikaByName(String pKorisnickoIme);
	
	/**
	 * Uređivanje korisnika 
	 * @param id - id korisnika 
	 * @param pKorsinik - objekt uređenog korisnika 
	 * @return objekt uređenog korisnika 
	 */
	public Korisnik urediKorisnikaById(int id, Korisnik pKorsinik);
	
	/**
	 * Brisanje korisnika po id-u
	 * @param id
	 */
	public void brisiKorisnikaById(int id);
	
	/**
	 * Lista korisnika - kreiranje liste svih korisnika u bazi
	 * @return lista korisnika 
	 */
	public List<Korisnik> listaKorisnika();

	/**
	 * Promjena statusa korisnika ( 1-Aktivan, 0-Neaktivan )
	 * 
	 */
	public void promjeniStatusKorisinka();
	
	
}
