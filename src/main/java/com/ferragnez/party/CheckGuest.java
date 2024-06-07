package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		//inizializzazione array con la lista di invitati
		String [] guests = {"Dua Lipa", 
		                    "Paris Hilton", 
		                    "Manuel Agnelli", 
		                    "J-Ax", 
		                    "Francesco Totti",
		                    "Ilary Blasi",
		                    "Bebe Vio",
		                    "Luis",
		                    "Pardis Zarei",
		                    "Martina Maccherone",
		                    "Rachel Zeilic"};
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Il suo nome prego?");
		//inizializzazione variabile con il nome utente da input
		String name = input.nextLine();
		
		//inizializzazione di un booleano relativo alla presenza o meno dell'utente nella lista
		boolean invited = false;

		//ciclo per determinare se l'utente è nella lista o meno
		
		/* ciclo for
        for (int i = 0; i < guests.length; i++) {
        	if (name.toLowerCase().equals(guests[i].toLowerCase())) {
        		invited = true;
        		break;
        	}
        }   
        */
		
        //ciclo while
		int i = 0;
		while (!invited && i < guests.length) {
			if (name.toLowerCase().equals(guests[i].toLowerCase())) {
        		invited = true;
        	}
			i++;
		}
		
		//controllo del risultato
		if (!invited) {
	      System.out.println("Non sei nella lista, vai a casa brutto poveraccio!");
	    } else {
	      System.out.printf("Benvenuto eccelso commendatore cavalier %s!", name);
	    }
				
        input.close();
    }	
}

