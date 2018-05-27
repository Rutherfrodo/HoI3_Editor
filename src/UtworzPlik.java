import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class UtworzPlik {
	//public UtworzPlik(String SciezkaDocelowa , String Nazwa, String Rozszrzeszenie, String Tekst)
	public UtworzPlik(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String Tekst) {
		try {
			//Files.createFile(Paths.get(SciezkaDocelowa +Nazwa +Rozszrzeszenie));
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println(Tekst);
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public UtworzPlik(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String name, String path, String user) {
		try {
			//odpowiedzialna za przypisanie parametrow do pliku .MOD
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("name = \""+name+"\"");
			drukarz.println("path = \""+path+"\"");
			drukarz.println("user_dir = \""+user+"\"");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	
	//Tworzy nowy plik z podaną sciężka gdzie ma byc stworzony, nazwa i rozszerzeniem
	void Wiadomosc(String message) {JOptionPane.showMessageDialog(null, message);}  // Message Dialog, przydatne	
	
}
