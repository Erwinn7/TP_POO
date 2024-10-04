package composant;

import java.util.ArrayList;
import java.util.Date;

public class Utilisateur {
	private String nomUsr;
    private String prenomUsr;
    private String emailUsr;
    private String adresseUsr;
    private Date dateNaissanceUsr;
    private int telUsr;
    private String nationaliteUsr;
    private Forfait forfaitSouscrit;
    private ArrayList<Film> historique;
 
    public Utilisateur(String nomUsr,String prenomUsr,String emailUsr,String adresseUsr, Date dateNaissanceUsr,int telUsr,String nationaliteUsr,Forfait forfaitSouscrit){
          this.nomUsr=nomUsr;
          this.prenomUsr=prenomUsr;
          this.emailUsr=emailUsr;
          this.adresseUsr=adresseUsr;
          this.dateNaissanceUsr=dateNaissanceUsr;
          this.telUsr=telUsr;
          this.nationaliteUsr=nationaliteUsr;
          this.forfaitSouscrit=forfaitSouscrit;
    }
     
    
    public void souscrireForfait(Forfait monForfait){
    	this.forfaitSouscrit = monForfait;
 
    }
 
    public void creerPlaylist(String nomPlaylist , ArrayList<Film> lesFilms){
    	 new Playlist(nomPlaylist, this, lesFilms);

    }
 
    public void publierPlaylist(){
 
    }
 
    public void surpprimerPlaylist(){
 
    }
 
    public void modifierPlaylist(){
        
    }
	public void lirePlaylist() {
		
	}
	
	public void sauvgarderPlaylist() {
		
	}
    
 
	public String getNomUsr() {
		return nomUsr;
	}
 
	public void setNomUsr(String nomUsr) {
		this.nomUsr = nomUsr;
	}
 
	public String getPrenomUsr() {
		return prenomUsr;
	}
 
	public void setPrenomUsr(String prenomUsr) {
		this.prenomUsr = prenomUsr;
	}
 
	public String getEmailUsr() {
		return emailUsr;
	}
 
	public void setEmailUsr(String emailUsr) {
		this.emailUsr = emailUsr;
	}
 
	public String getAdresseUsr() {
		return adresseUsr;
	}
 
	public void setAdresseUsr(String adresseUsr) {
		this.adresseUsr = adresseUsr;
	}
 
	public Date getDateNaissanceUsr() {
		return dateNaissanceUsr;
	}
 
	public void setDateNaissanceUsr(Date dateNaissanceUsr) {
		this.dateNaissanceUsr = dateNaissanceUsr;
	}
 
	public int getTelUsr() {
		return telUsr;
	}
 
	public void setTelUsr(int telUsr) {
		this.telUsr = telUsr;
	}
 
	public String getNationaliteUsr() {
		return nationaliteUsr;
	}
 
	public void setNationaliteUsr(String nationaliteUsr) {
		this.nationaliteUsr = nationaliteUsr;
	}
 
	public Forfait getForfaitSouscrit() {
		return forfaitSouscrit;
	}
 
	public void setForfaitSouscrit(Forfait forfaitSouscrit) {
		this.forfaitSouscrit = forfaitSouscrit;
	}
 
	public ArrayList<Film> getHistorique() {
		return historique;
	}
 
	public void setHistorique(ArrayList<Film> historique) {
		this.historique = historique;
	}

	@Override
	public String toString() {
		return "Utilisateur [nomUsr=" + nomUsr + ", prenomUsr=" + prenomUsr + ", emailUsr=" + emailUsr + ", adresseUsr="
				+ adresseUsr + ", dateNaissanceUsr=" + dateNaissanceUsr + ", telUsr=" + telUsr + ", nationaliteUsr="
				+ nationaliteUsr + ", forfaitSouscrit=" + forfaitSouscrit + ", historique=" + historique + "]";
	}
	
}
