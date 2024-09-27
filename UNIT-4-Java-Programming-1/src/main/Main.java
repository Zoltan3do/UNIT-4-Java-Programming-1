package main;

import java.util.Scanner;

import aggr.Player;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Player p = new Player();
		String questions = "1)Aggiungi un immagine al player\n"
				+ "2)Aggiugi un Video al player\n"
				+ "3)Aggiungi un Audio al player\n";
		boolean flag = false;
		System.out.println("Dovrai aggiungere 5 elementi all'interno del player prima di poterlo usare!!!\n".toUpperCase());
		do {
			System.out.println(questions);
			p.aggiungiElemento(in, Integer.parseInt(in.nextLine()), flag);

		}while(p.getElementi().size() < 5);
		flag = false;
		do {
			try {
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
					break;
				case 4:
					p.usaElementi(in, flag, 3);
					break;
				case 5:
					p.usaElementi(in, flag, 4);
					break;
				case 0:
					flag = true;
					System.out.println("Arrivederci!");
					break;
				default:
					System.out.println("Opzione non consentita!");
				}
			}catch(Exception e) {
				System.out.println("errore: " + e.getLocalizedMessage());
			}
		}while(!flag);
	}
}
