package PersonerPaaUni;

import java.util.ArrayList;

//c) Lag klassen «Student» som arver fra Person. En student skal ha et studieprogram (String), et
//årskurs (int) og ei liste med emner som vedkommende er oppmeldt i. Emne klassen er lagt
//ved.

public class Student extends Person {
	private String studieprogram;
	private int aarskurs; 
	private ArrayList<Emne> emner; 
	
	
	public Student(int id, String fnavn,String enavn, int faar) {
		super(id,fnavn, enavn, faar); 
	}
	
	public Student() {
		
	}
	
	public String getStudieprogram() {
		return studieprogram;
	}
	public void setStudieprogram(String nyttStudieprogram) {
		this.studieprogram = nyttStudieprogram;
	}
	
	public int getAarskurs() {
		return aarskurs; 
	}
	public void setAarskurs(int nyttAarskurs) {
		this.aarskurs = nyttAarskurs; 
	}
	public ArrayList<Emne> getEmner(){
		return emner; 
	}
	public void setEmner(ArrayList<Emne> nyeEmner) {
		this.emner = nyeEmner; 
	}
	@Override public String toString() {
		return "ID:" + getId() + " , fornavn: " + getFnavn() + " , etternavn: "
				+ getEtternavn() + ", fodselsaar: " + getFaar() + ", studieprogram: "+ 
				studieprogram + ", aarskurs: " + aarskurs + ", emner: " + emner; 
	}
}
