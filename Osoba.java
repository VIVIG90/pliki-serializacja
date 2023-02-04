import java.io.Serializable;
//aby skorzystac z mechanizmu serializacji trzeba dodac interfejs implements Serializable -> metody sa zaimplementowane z tego interfejsu
public class Osoba implements Serializable {

	String imie;
	String nazwisko;
	int rokUrodzenia;
	
	public Osoba(String imie, String nazwisko, int rokUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
	}
	
	public String toString() {
		return imie + " " + nazwisko + " ur. " + rokUrodzenia;
	}
}
