package composant;

import java.util.Date;

public class Producteur extends Utilisateur {
	private float recette;
    private float pourcentagePercue;
    private String societeProduction;
 
    public Producteur(String nomUsr,String prenomUsr,String emailUsr,String adresseUsr, Date dateNaissanceUsr,int telUsr,String nationaliteUsr,Forfait forfaitSouscrit,float recette,float pourcentagePercue,String societeProduction){
        super(nomUsr, prenomUsr, emailUsr, adresseUsr, dateNaissanceUsr, telUsr, nationaliteUsr, forfaitSouscrit);
        this.recette=recette;
        this.pourcentagePercue=pourcentagePercue;
        this.societeProduction=societeProduction;
    }
 
    public void creerFilm(){
 
    }
 
    public void surpprimerFilm(){
 
    }
 
    public void modifierFilm(){
        
    }
 
	public float getRecette() {
		return recette;
	}
 
	public void setRecette(float recette) {
		this.recette = recette;
	}
 
	public float getPourcentagePercue() {
		return pourcentagePercue;
	}
 
	public void setPourcentagePercue(float pourcentagePercue) {
		this.pourcentagePercue = pourcentagePercue;
	}
 
	public String getSocieteProduction() {
		return societeProduction;
	}
 
	public void setSocieteProduction(String societeProduction) {
		this.societeProduction = societeProduction;
	}

}
