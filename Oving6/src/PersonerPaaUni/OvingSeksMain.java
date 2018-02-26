package PersonerPaaUni;

import java.util.ArrayList;

//dette er en endring

public class OvingSeksMain {
//	
//	g) Lag en metode som tar inn en ArrayList<Person> og 
//	som skriver ut alle personene i lista
//	gjennom å bruke toString metodene til personobjektene.
	
	
	
	public String SkrivUtPersoner(ArrayList<Person> personer) {
		String personerIListen = "";
		for(int i = 0; i <= personer.size(); i++) {
			personerIListen += personer.toString() + "\n"; 
		}return personerIListen; 
	}


	public static void main(String[] args) {
//		h) Lag en main metode som lager noen (minst to) 
//		instanser av hver av klassene fra oppgave b-e
//		og lagrer dem i en ArrayList<Person>. 
//		Deretter skal main-metoden bruke metoden fra
//		oppgave g for å skrive ut personene.

		ArrayList<Person> enListeMedFolk; 
		// to Ansatte
		
		
	}

}
