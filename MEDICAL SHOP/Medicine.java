package com.bl.chemistshop;

import java.util.Arrays;
import java.util.Date;

public class Medicine {
	
	enum Type {	HOMEPATHY, ALLOPATHY, AYURVEDIC}
	
	Type type;
	String companyName;
	Date mfgDate;
	Date expDate;
	String[] composition;
	
	@Override
	public String toString() {
		return "Medicine [brand=" + companyName + ", mfgDate=" + mfgDate + ", expDate=" + expDate + ", composition="
				+ Arrays.toString(composition) + "," + type + "]";
	}

}
