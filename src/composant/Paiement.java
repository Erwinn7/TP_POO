package composant;

public class Paiement {
	private Utilisateur currentUser;
	private Film currentFilm;
	
	
	
	public Paiement (Utilisateur currentUser, Film currentFilm) {
		this.currentFilm = currentFilm;
		this.currentUser = currentUser;
		
	}
	
	public float montant_a_payer() {
		float tempsVisionnage = currentFilm.getDureeFilm()/60; 
		return currentUser.getForfaitSouscrit().getTarifForfait() * tempsVisionnage;
		
	}
	
	public float montant_a_retribuer() {
		return (montant_a_payer()* 66)/100 ;
		
	}
	
	
	public Utilisateur getCurrentUser() {
		return currentUser;
	}



	public void setCurrentUser(Utilisateur currentUser) {
		this.currentUser = currentUser;
	}



	public Film getCurrentFilm() {
		return currentFilm;
	}



	public void setCurrentFilm(Film currentFilm) {
		this.currentFilm = currentFilm;
	}

}
