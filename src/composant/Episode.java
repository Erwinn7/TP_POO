package composant;

import java.util.Date;

public class Episode extends Film{
	private int numEpisode;
	

	public Episode(String nomFilm, int dureeFilm, String categorieFilm, String synopsys, String casting,String afficheFilm, Date dateParution, int numEpisode) {
		super(nomFilm, dureeFilm, categorieFilm, synopsys, casting, afficheFilm, dateParution);
		this.setNumEpisode(numEpisode);
	}
	
	


	public int getNumEpisode() {
		return numEpisode;
	}


	public void setNumEpisode(int numEpisode) {
		this.numEpisode = numEpisode;
	}
	
	
	
	

	
}
