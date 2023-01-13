package webshop;

import webshop.*;

public class Webshop {
	private String name;
	private boolean isOpen;

	public Klant klant;
	public double time = 0.00;

	int geldendeKortingInProcenten = 0;
	double credietLimietNieuweKlant = 0.0;

	public Webshop(String name, boolean isOpen) {
		this.name = name;
		this.isOpen = isOpen;
	}

	public void setGeldendeKortingInProcenten(int kortingInProcenten) {
		this.geldendeKortingInProcenten = kortingInProcenten;
	}

	public void setCredietLimietNieuweKlant(double credietLimiet) {
		this.credietLimietNieuweKlant = credietLimiet;
	}

	public int getGeldendeKortingInProcenten() {
		return geldendeKortingInProcenten;
	}

	public double getCredietLimietNieuweKlant() {
		return credietLimietNieuweKlant;
	}

}