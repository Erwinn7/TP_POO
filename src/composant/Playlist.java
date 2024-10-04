package composant;

import java.util.ArrayList;

public class Playlist {
	
	private String nomPlaylist;
	private Utilisateur createurPlaylist;
	private ArrayList<Film> film;
	
	public Playlist(String nomPlaylist,Utilisateur createurPlaylist,ArrayList<Film> film) {
		this.nomPlaylist=nomPlaylist;
		this.createurPlaylist=createurPlaylist;
		this.film=film;
	}
	

 
	public String getNomPlaylist() {
		return nomPlaylist;
	}
 
	public void setNomPlaylist(String nomPlaylist) {
		this.nomPlaylist = nomPlaylist;
	}
 
	public Utilisateur getCreateurPlaylist() {
		return createurPlaylist;
	}
 
	public void setCreateurPlaylist(Utilisateur createurPlaylist) {
		this.createurPlaylist = createurPlaylist;
	}
 
	public ArrayList<Film> getFilm() {
		return film;
	}
 
	public void setFilm(ArrayList<Film> film) {
		this.film = film;
	}
	

}
