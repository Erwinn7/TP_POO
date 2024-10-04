package composant;

import java.util.ArrayList;

public class Serie {
	private String nomSerie ;
	private ArrayList<Saison> lesSaisons;

	
	public Serie( String nomSerie, ArrayList<Saison> lesSaisons) {
		this.nomSerie = nomSerie;
		this.lesSaisons = lesSaisons;
	}


	public ArrayList<Saison> getLesSaisons() {
		return lesSaisons;
	}


	public void setLesSaisons(ArrayList<Saison> lesSaisons) {
		this.lesSaisons = lesSaisons;
	}


	public String getNomSerie() {
		return nomSerie;
	}


	public void setNomSerie(String nomSerie) {
		this.nomSerie = nomSerie;
	}


}
