package com.tutorial.appskeleton.utility;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Lozinka {

	public static final String SALT = "APP-SkElEtOn123!";

	int iDuzinaLozinke;
	String iZacinjenaLozinka;

	public Lozinka() {
	}
	
	public Lozinka(String password) {
		iDuzinaLozinke = password.length();
		iZacinjenaLozinka = kreirajZacinjenuLozinku(password);
	}



	public static String MD5(String pLozinka) {
		String tMd5Hash = "";

		if (null == pLozinka) {
			return null;
		}

		try {
			// Create MD object
			MessageDigest tDigest = MessageDigest.getInstance("MD5");

			// Update input string in message digest object
			tDigest.update(pLozinka.getBytes(), 0, pLozinka.length());

			// Convert message digest object value in base 16 (hex)
			tMd5Hash = new BigInteger(1, tDigest.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return tMd5Hash;
	}

	/**
	 * Kreiranje zacinjena lozinke
	 * @param pLozinka
	 * @return String zacinjena lozinka
	 */
	public static String kreirajZacinjenuLozinku(String pLozinka) {
		String tZacinjenaLozinka = "";
		tZacinjenaLozinka = MD5(pLozinka + SALT);
		return tZacinjenaLozinka;
	}

	public static String kreirajZacinjenuLozinku(String pLozinka, String pZacin) {
		String tZacinjenaLozinka = "";
		tZacinjenaLozinka = MD5(pLozinka + pZacin);
		return tZacinjenaLozinka;
	}

	public int getDuzinuLozinke() {
		return iDuzinaLozinke;
	}

	public String getZacinjenuLozinku() {
		return iZacinjenaLozinka;
	}

	public void setSaltedPassword(String pLozinka) {
		this.iZacinjenaLozinka = kreirajZacinjenuLozinku(pLozinka);
	}

}
