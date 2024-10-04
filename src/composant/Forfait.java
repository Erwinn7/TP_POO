package composant;

public class Forfait {
	private String nomForfait;
	private float tarifForfait;
	private String qualiteImage;
	private String qualiteSon;
	
	public Forfait(String nomForfait,float tarifForfait,String qualiteImage,String qualiteSon) {
		this.nomForfait=nomForfait;
		this.tarifForfait=tarifForfait;
		this.qualiteImage=qualiteImage;
		this.qualiteSon=qualiteSon;
	}
 
	public String getNomForfait() {
		return nomForfait;
	}
 
	public void setNomForfait(String nomForfait) {
		this.nomForfait = nomForfait;
	}
 
	public float getTarifForfait() {
		return tarifForfait;
	}
 
	public void setTarifForfait(float tarifForfait) {
		this.tarifForfait = tarifForfait;
	}
 
	public String getQualiteImage() {
		return qualiteImage;
	}
 
	public void setQualiteImage(String qualiteImage) {
		this.qualiteImage = qualiteImage;
	}
 
	public String getQualiteSon() {
		return qualiteSon;
	}
 
	public void setQualiteSon(String qualiteSon) {
		this.qualiteSon = qualiteSon;
	}
}
