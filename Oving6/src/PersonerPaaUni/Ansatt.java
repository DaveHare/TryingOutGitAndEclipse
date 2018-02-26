package PersonerPaaUni;


//b) Lag klassen «Ansatt» som arver fra Person. En ansatt har et ansattnummer, en stilling (String)
//og en årslønn (int) i tillegg til egenskapene for Person


public class Ansatt extends Person {
	private int ansattnummer; 
	private String stilling; 
	private int aarslonn; 
	
	public Ansatt(int id, String fnavn,String enavn, int faar) {
		super(id, fnavn, enavn, faar); 
	}
	
	public Ansatt() {	
	}
	
	public Ansatt(int ansattnummer, String stilling, int aarslonn, int id, String fnavn,String enavn, int faar) {
		super(); 
	}
	
	
	public int getAnsattnummer() {
		return ansattnummer; 
	}
	public void setAnsattnummer(int nyttAnsattnummer) {
		this.ansattnummer = nyttAnsattnummer; 
	}
	public String getStilling() {
		return stilling; 
	}
	public void setStilling(String nyStilling) {
		this.stilling = nyStilling; 
	}
	public int getAarslonn() {
		return aarslonn; 
	}
	public void setAarslonn(int nyAarslonn) {
		this.aarslonn = nyAarslonn; 
	}
	
	@Override public String toString() {
		return "ID:" + getId() + " , fornavn: " + getFnavn() + " , etternavn: "
				+ getEtternavn() + ", fodselsaar: " + getFaar() + 
				", ansattnummer: " + ansattnummer + ", stilling: "+ stilling
				+ ", aarslonn: " + aarslonn;   
				

}
}
