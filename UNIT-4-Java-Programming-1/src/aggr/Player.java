package aggr;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

public class Player {

	private ArrayList<ElementoMultimediale> elementi = new ArrayList<>();

	public Player() {}

	public void aggiungiElemento(Scanner in, int scelta, boolean flag) {

		String titolo;
		int durata;

		switch(scelta) {
		case 1: 
			System.out.println("Inserisci il titolo della Immagine");
			this.elementi.add(new Immagine(in.nextLine()));
			break;
		case 2:
			System.out.println("Inserisci il titolo del Video");
			titolo = in.nextLine();
			System.out.println("Inserisci la durata del video");
			durata = Integer.parseInt(in.nextLine());
			this.elementi.add(new Video(titolo, durata));
			break;
		case 3: 
			System.out.println("Inserisci il titolo dell'Audio");
			titolo = in.nextLine();
			System.out.println("Inserisci la durata dell'Audio");
			durata = Integer.parseInt(in.nextLine());
			this.elementi.add(new Audio(titolo, durata));
			break;
		case 0: 
			flag = true;
			break;
		default:
			System.out.println("Opzione non disponibile");
		}
	}


	public ArrayList<ElementoMultimediale> getElementi() {
		return elementi;
	}

	public void printElements() {
		int i = 1;
		for(ElementoMultimediale em: this.elementi) {
			System.out.println(i + ") " + em.toString() + "\n");
			i++;
		}
	}



	public void usaElementi(Scanner in, boolean flag, int i) {
		if(this.getElementi().get(i) instanceof Immagine) {
			do {
				System.out.println("1)Per aumentare la luminosità\n"
						+ "2)Per abbassare la luminosità\n"
						+ "3)Per guardare l'immagine\n"
						+ "0)Per uscire\n");
				switch(Integer.parseInt(in.nextLine())) {
				case 1:
					((Immagine) this.getElementi().get(i)).aumentaLuminosita();
					break;
				case 2:
					((Immagine) this.getElementi().get(i)).diminuisciLuminosita();
					break;
				case 3:
					((Immagine) this.getElementi().get(i)).show();
					break;
				case 0:
					flag = true;
					break;
				default:
					System.out.println("Scelta invalida!");
				}
			}while(!flag);

			flag=false;
		}else if(this.getElementi().get(i) instanceof Video) {
			do {
				System.out.println("1)Per aumentare la luminosità\n"
						+ "2)Per abbassare la luminosità\n"
						+ "3)Per abbassare il volume\n"
						+ "4)Per alzare il volume\n"
						+ "5)Per avviare il video\n"
						+ "0)Per uscire\n");
				switch(Integer.parseInt(in.nextLine())) {
				case 1:
					((Video) this.getElementi().get(i)).aumentaLuminosita();
					break;
				case 2:
					((Video) this.getElementi().get(i)).diminuisciLuminosita();
					break;
				case 3:
					((Video) this.getElementi().get(i)).abbassaVolume();
					break;
				case 4:
					((Video) this.getElementi().get(i)).alzaVolume();
					break;
				case 5:
					((Video) this.getElementi().get(i)).play();
					break;
				case 0:
					flag = true;
					break;
				default:
					System.out.println("Scelta invalida!");
				}
			}while(!flag);

			flag = false;
		}else if(this.getElementi().get(i) instanceof Audio) {
			do {
				System.out.println(
						"1)Per abbassare il volume\n"
								+ "2)Per alzare il volume\n"
								+ "3)Per avviare l'audio\n"
								+ "0)Per uscire\n");
				switch(Integer.parseInt(in.nextLine())) {
				case 1:
					((Audio) this.getElementi().get(i)).alzaVolume();
					break;
				case 2:
					((Audio) this.getElementi().get(i)).abbassaVolume();
					break;
				case 3:
					((Audio) this.getElementi().get(i)).play();
					break;
				case 0:
					flag = true;
					break;
				default:
					System.out.println("Scelta invalida!");
				}
			}while(!flag);
			flag= false;
		}

	}

}
