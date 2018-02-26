package PersonerPaaUni;

//e) Lag klassen «Teknisk Ansatt» som subklasse av ansatt. 
// En teknisk ansatt kan i tillegg ha et
//rom som vedkommende har ansvar for. Klassen Rom er delt ut.

public class TekniskAnsatt extends Ansatt {
	private Rom etRom; 
	
	public TekniskAnsatt(int ansattnummer, String stilling, int aarslonn) {
		
	} 
	
	public Rom getRom() {
		return etRom; 
	}
	public void setRom(Rom etNyttRom) {
		etRom = etNyttRom; 
	}
	
	@Override public String toString() {
		return "ID:" + getId() + " , fornavn: " + getFnavn() + " , etternavn: "
				+ getEtternavn() + ", fodselsaar: " + getFaar() + 
				", ansattnummer: " + getAnsattnummer() + ", stilling: "+ getStilling()
				+ ", aarslonn: " + getAarslonn() + ", Ansvarlig for rom: " + etRom; 
	}
}
