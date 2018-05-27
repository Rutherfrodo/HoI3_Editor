import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Foldery {
	//Klasa odpowiadajaca za tworzenie folderow z odpowiednia nazwa i w odpowiednim miejscu
	public Foldery(String SciezkaDocelowa, String Nazwa) {
		// tworzaca folder glowny
		File tworzymy = new File(SciezkaDocelowa+Nazwa);
		boolean dziala = tworzymy.mkdirs();
		if(dziala) {
			if(!tworzymy.exists()) {
				try {
					tworzymy.createNewFile();
					Wiadomosc("Katalog wewnetrzny stworzony");
				} catch (IOException e) {
					Wiadomosc("Ooops, cos poszlo nie tak");
				}
			}
		}else {
			Wiadomosc("Ooops, cos poszlo nie tak");
		}
		
	}
	public Foldery(String SciezkaDocelowa, String Katalog ,String Nazwa) {
		// tworzaca glowne katalogi MODa
		File tworzymy = new File(SciezkaDocelowa+Katalog+Nazwa);
		boolean dziala = tworzymy.mkdirs();
		if(dziala) {
			if(!tworzymy.exists()) {
				try {
					tworzymy.createNewFile();
					Wiadomosc("Katalog wewnetrzny stworzony");
				} catch (IOException e) {
					Wiadomosc("Ooops, cos poszlo nie tak");
				}
			}
		}else {
			Wiadomosc("Ooops, cos poszlo nie tak");
		}
		
	}
	void Wiadomosc(String message) {JOptionPane.showMessageDialog(null, message); } // Message Dialog, przydatne
		
	
}
