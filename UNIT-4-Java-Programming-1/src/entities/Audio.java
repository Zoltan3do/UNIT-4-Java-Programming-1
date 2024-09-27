package entities;

import interfaces.Riproduzione;

public class Audio extends ElementoMultimediale implements Riproduzione{

	private int durata;
	private int volume = 5;


	public Audio() {};
	
	public Audio(String titolo, int durata) {
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

	public void abbassaVolume() {
		if(this.volume >= 0)
			this.volume--;
	};

	public void alzaVolume() {
		if(this.volume < 11)
			this.volume++;
	}


	@Override
	public void play() {
		String volumes = "";
		for(int i = 0; i < this.volume; i++) 
			volumes+="!";
		
		for(int i = 0; i < this.durata; i++) 
			System.out.println(this.getTitolo() + volumes);
	}

	@Override
	public String toString() {
		return "Titolo=" + getTitolo() + ",\ndurata=" + durata + ",\nvolume=" + volume + "\n";
	};


}
