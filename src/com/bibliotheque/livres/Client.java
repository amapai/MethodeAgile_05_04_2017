package com.bibliotheque.livres;

import java.awt.List;
import java.util.ArrayList;

public class Client {

	private ArrayList <Emprunt> emprunts;
	
	public void emprunter (Livre livre) {
		if (livre.estDisponible)  {
			emprunts.add(new Emprunt(livre, this));
		}
	}
	
		public void notifier (Emprunt emprunt) {
			System.out.println("Votre" + emprunts.get(emprunt).getLivre().getNom() + "  emprunt arrive à la date limite !");
	}
}
