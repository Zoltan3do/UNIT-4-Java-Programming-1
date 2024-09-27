package entities;

import interfaces.Luminosita;
import interfaces.Riproduzione;

public class Video extends ElementoMultimediale implements Riproduzione, Luminosita{
	
	private int durata;
	private int volume = 5;
	private int luminosita = 5;
	
	
	public Video() {}
	
	public Video(String titolo, int durata) {
		super(titolo);
		this.durata = durata;
	}
	
	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume >= 0 && volume < 11)
			this.volume = volume;
		else
			System.out.println("Questo valore non va bene!!");
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		if(luminosita >= 0 && luminosita < 11)
			this.luminosita = luminosita;
		else
			System.out.println("Questo valore non va bene!!");
	}
	
	
	public void aumentaLuminosita() {
		if(this.luminosita < 11)
			this.luminosita++;
	}
	
	public void diminuisciLuminosita() {
		if(this.luminosita >= 0)
			this.luminosita--;
	}
	
	public void abbassaVolume() {
		if(this.volume>=0)
			this.volume--;
	};

	public void alzaVolume() {
		if(this.volume<11)
			this.volume++;
	}

	@Override
	public void play() {
		String volumes = " ";
		String luminos = " ";
		for(int i = 0; i < this.volume; i++) 
			volumes += "!";
		
		for(int i = 0; i < this.luminosita; i++) 
			luminos += "*";
		
		for(int i = 0; i < this.durata; i++) 
			System.out.println(this.getTitolo() + volumes + luminos);
	}

	@Override
	public String toString() {
		return "Titolo="
				+ getTitolo() +",\ndurata=" + durata + ",\nvolume=" + volume + ",\nluminosita=" + luminosita + "\n";
	}
	

}
