package PersonerPaaUni;

import java.util.ArrayList;

//d) Lag klassen «Vitenskapelig Ansatt» som subklasse av Ansatt. En 
//vitenskapelig ansatt har et fagfelt (String) og ei liste med emner
// som vedkommende underviser.

public class VitenskapeligAnsatt extends Ansatt {
	private String fagfelt;
	private ArrayList<Emne> listeMedEmner;
	
	public VitenskapeligAnsatt(int ansattnummer, String stilling, int aarslonn) {
		
	} 
	
	public VitenskapeligAnsatt() {
		
	}
	public String getFagfelt() {
		return fagfelt; 
	}
	public void setFagfelt(String nyttFagfelt) {
		fagfelt = nyttFagfelt; 
	}
	public ArrayList<Emne> getListeMedEmner(){
		return listeMedEmner; 
	}
	public void setListeMedEmner(ArrayList<Emne> nyeEmner) {
		listeMedEmner = nyeEmner; 
	}
	
	@Override public String toString() {
		return "ID:" + getId() + " , fornavn: " + getFnavn() + " , etternavn: "
				+ getEtternavn() + ", fodselsaar: " + getFaar() + 
				", ansattnummer: " + getAnsattnummer() + ", stilling: "+ getStilling()
				+ ", aarslonn: " + getAarslonn() + ", fagfelt: " + fagfelt +
				", emner: " + listeMedEmner.toString();  
	}
	

}
