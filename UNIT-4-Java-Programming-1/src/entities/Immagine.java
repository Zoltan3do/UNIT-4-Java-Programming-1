package entities;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita{
	

	private int luminosita = 5;
	
	public Immagine() {}
	
	public Immagine(String titolo) {
		super(titolo);
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
	
	public void show() {
		String luminos = " "; 
		for(int i = 0; i < this.luminosita; i++) 
			luminos += "*";
		System.out.println(this.getTitolo() + luminos);
	}

	@Override
	public String toString() {
		return "Titolo=" + getTitolo() + ",\nluminosita=" + luminosita +"\n";
	}
	
	
}
