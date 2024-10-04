package composant;

import java.util.Date;

public class Film {
	private String nomFilm;
	private int dureeFilm; // durée en minutes pour mieux gérer les calculs plus tards
	private String categorieFilm;
	private String synopsys;
	private String casting;
	private String afficheFilm;
	private Date dateParution;
//	private Producteur auteurFilm;   a definir par zineb 
	
	public Film (String nomFilm, int dureeFilm, String categorieFilm,String synopsys,String casting,String afficheFilm,Date dateParution) {
		
		this.nomFilm = nomFilm;
		this.dureeFilm = dureeFilm;
		this.categorieFilm = categorieFilm;
		this.synopsys =synopsys;
		this.casting = casting;
		this.afficheFilm = afficheFilm;
		this.dateParution = dateParution;
		
	}
	

	public void lireFilm() {
		
	}
	

	public String getNomFilm() {
		return nomFilm;
	}

	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}

	public int getDureeFilm() {
		return dureeFilm;
	}

	public void setDureeFilm(int dureeFilm) {
		this.dureeFilm = dureeFilm;
	}

	public String getCategorieFilm() {
		return categorieFilm;
	}

	public void setCategorieFilm(String categorieFilm) {
		this.categorieFilm = categorieFilm;
	}

	public String getSynopsys() {
		return synopsys;
	}

	public void setSynopsys(String synopsys) {
		this.synopsys = synopsys;
	}

	public String getCasting() {
		return casting;
	}

	public void setCasting(String casting) {
		this.casting = casting;
	}

	public String getAfficheFilm() {
		return afficheFilm;
	}

	public void setAfficheFilm(String afficheFilm) {
		this.afficheFilm = afficheFilm;
	}

	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	@Override
	public String toString() {
		return "Film [nomFilm=" + nomFilm + ", dureeFilm=" + dureeFilm + ", categorieFilm=" + categorieFilm
				+ ", synopsys=" + synopsys + ", casting=" + casting + ", afficheFilm=" + afficheFilm + ", dateParution="
				+ dateParution + "]";
	}
	

}
