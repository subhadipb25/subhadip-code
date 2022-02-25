package com.bl.chemistshop;

import java.util.List;
import java.util.Date;

public class Application {

	
	public static void main(String[] args) {
		Crocine crocine = new Crocine();
		crocine.mfgDate = new Date("09/02/2020");
		crocine.expDate = new Date("12/03/2020");
		GluconD gluconD = new GluconD();
		gluconD.mfgDate = new Date("09/02/2020");
		gluconD.expDate = new Date("12/03/2020");
		PantopD pantopD = new PantopD();
		pantopD.mfgDate = new Date("09/02/2020");
		pantopD.expDate = new Date("12/03/2020");
		Aciloc aciloc = new Aciloc();
		aciloc.mfgDate = new Date("09/02/2020");
		aciloc.expDate = new Date("12/03/2020");
		Disprine disprine = new Disprine();
		disprine.mfgDate = new Date("09/02/2020");
		disprine.expDate = new Date("12/03/2020");
		Natrumur natrumur = new Natrumur();
		natrumur.mfgDate = new Date("09/02/2020");
		natrumur.expDate = new Date("12/03/2020");
		
		Medicinestore medicineStore = new Medicinestore();
		
		medicineStore.add(crocine);
		medicineStore.add(gluconD);
		medicineStore.add(pantopD);
		medicineStore.add(aciloc);
		medicineStore.add(disprine);
		medicineStore.add(natrumur);
		
		UserInterface userInterface = new UserInterface();
		List medicineList = medicineStore.getMedicineList();
		userInterface.print(medicineList);
		
		medicineStore.remove(crocine);
		medicineStore.remove(gluconD);
		
		System.out.println("Printing after removal: ");
		userInterface.print(medicineList);
		System.out.println("printing Homeopathy medicines");
		userInterface.printAllHomeopathy(medicineList);
		System.out.println("printing ayurvedic medicines");
		userInterface.printAllAyurvedic(medicineList);
		System.out.println("printing alleopathy medicines");
		userInterface.printAllAlleopathy(medicineList);
	}

}
