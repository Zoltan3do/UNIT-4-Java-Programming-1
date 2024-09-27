package main;

import java.util.Scanner;

import aggr.Player;

public class Main {

	public static void main(String[] args) {
		/*
		 * Scrivere il codice Java necessario all'implementazione di un Player multimediale impiegando i principi OOP.
		 * 
		 * Descrizione del sistema:
		 * 
		 * Un Elemento Multimediale è una immagine, un Video o una Registrazione Audio Identificato da un titolo.
		 * Un elemento è riproducibile se ha una durata (un valore positivo di tipo int) e un metodo play();
		 * 
		 * Una registrazione Audio è riproducibile e ha associato anche un volume (un valore positivo di tipo int) e i metodi
		 * abbassaVolume() e alzaVolume() per regolarlo. Se riprodotta, ripete per un numero di volte pari alla durata la
		 * stampa del titolo concatenato a una sequenza di punti esclamativi di lunghezza pari al volume (una stampa per 
		 * riga).
		 * 
		 * 
		 * Un Video è riproducibile e ha associato un volume regolabile analogo a quello delle registrazioni audio e anche
		 * una luminosità (un valore positivo di tipo int) e i metodi aumentaLuminosita() e diminuisciLuminosita() per
		 * regolarla. Se riprodotta, ripete per un numero di volte pari alla durata la stampa del titolo concatenato a una
		 * sequenza di punti escalamativi di lunghezza pari al volume e poi a una sequenza di asterischi di lunghezza pari alla
		 * luminosità (una stampa per riga).
		 * 
		 * Un'immagine non è riproducibile, ma ha una luminosità regolabile analoga a quella dei filmati e un metodo show()
		 * che stampa il titolo concatenato a una sequenza di asterischi di lunghezza pari alla luminosità.
		 * Eseguire un oggetto multimediale significa invocarne il metodo show() se è un'immagine o il metodo play() se è
		 * riproducibile.
		 * 
		 * Organizzare opportunamente con classi astratte, interfacce e classi concrete il codice di un lettore multimediale
		 * che memorizza 5 elementi (creati con valori letti da tastiera) in un array e poi chiede ripetutamente all'utente
		 * quale oggetto eseguire (leggendo un intero da 1 a 5 oppure 0 per finire).
		 * 
		 * */

		Scanner in = new Scanner(System.in);
		Player p = new Player();

		String questions = "1)Aggiungi un immagine al player\n"
				+ "2)Aggiugi un Video al player\n"
				+ "3)Aggiungi un Audio al player\n"
				+ "0)Esci";

		boolean flag = false;
		System.out.println("Dovrai aggiungere 5 elementi all'interno del player prima di poterlo usare!!!\n".toUpperCase());
		
		do {
			System.out.println(questions);
			p.aggiungiElemento(in, Integer.parseInt(in.nextLine()), flag);
		}while(p.getElementi().size() < 5);

		flag = false;

		do {
			System.out.println("Quale elemento vuoi usare ? - [premi 0 se vuoi uscire dal programma]");
			p.printElements();
			switch(Integer.parseInt(in.nextLine())) {
			case 1:
				p.usaElementi(in, flag, 0);
				break;
			case 2: 
				p.usaElementi(in, flag, 1);
				break;
			case 3:
				p.usaElementi(in, flag, 2);
			case 4:
				p.usaElementi(in, flag, 3);
			case 5:
				p.usaElementi(in, flag, 4);
			case 0:
				flag=true;
				break;
			default:
				System.out.println("Opzione non consentita!");
			}
		}while(!flag);

	}

}
