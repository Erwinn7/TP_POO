package composant;

import java.util.ArrayList;

public class Saison {
	private int numeroSaison;
    private ArrayList<Episode> lesEpisodes;
	
	public Saison (int numSaison, ArrayList<Episode> lesEpisodes) {
		this.numeroSaison = numSaison;
		this.lesEpisodes = lesEpisodes;
		
		
	}

	public int getNumeroSaison() {
		return numeroSaison;
	}

	public void setNumeroSaison(int numeroSaison) {
		this.numeroSaison = numeroSaison;
	}

	public ArrayList<Episode> getLesEpisodes() {
		return lesEpisodes;
	}

	public void setLesEpisodes(ArrayList<Episode> lesEpisodes) {
		this.lesEpisodes = lesEpisodes;
	}
	
    
    
}
