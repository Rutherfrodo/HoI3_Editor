import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Budynki {
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie) {
		try {
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie));
			drukarz.println("");
		} catch (IOException e) {
			Wiadomosc("Nie dziala!!!!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String practical, String completion_size, String air_capacity,String czy_na_mapie, String koszt, String czas,String maksymalny_poziom,String czy_widoczny) {
		try {
			//Lotnisko
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("air_base = {");
			drukarz.println("	on_completion = "+practical);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	air_capacity = "+air_capacity);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = "+czy_na_mapie);
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+maksymalny_poziom);
			drukarz.println("	visibility = "+czy_widoczny);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String practical, double completion_size, int naval_capacity,String czy_na_mapie, int koszt, int czas,int maksymalny_poziom, String czy_widoczny,String capital) {
		try {
			//Port
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("naval_base = {");
			drukarz.println("	on_completion = "+practical);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	naval_capacity = "+ naval_capacity);
			drukarz.println("	capital = "+capital);
			drukarz.println("	onmap = "+czy_na_mapie);
			drukarz.println("	port = yes");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+maksymalny_poziom);
			drukarz.println("	visibility = "+czy_widoczny);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String practical ,double completion_size, int coastal_fort_level,String czy_na_mapie ,int koszt, int czas,int maksymalny_poziom) {
		try {
			//Fort Morski
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("coastal_fort = {");
			drukarz.println("	on_completion = "+practical);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	coastal_fort_level = "+ coastal_fort_level);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = "+czy_na_mapie);
			drukarz.println("	port = yes");
			drukarz.println("	orientation = yes");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+maksymalny_poziom);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String practical ,double completion_size, int fort_level,int koszt, int czas,int maksymalny_poziom) {
		try {
			//Land Fort 
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("land_fort = {");
			drukarz.println("	on_completion = "+practical);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	fort_level = "+ fort_level);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = yes");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+maksymalny_poziom);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String practical ,double completion_size, int local_anti_air,int koszt, int czas,int maksymalny_poziom,double dmg_factor) {
		try {
			//Anti air
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("anti_air = {");
			drukarz.println("	on_completion = "+practical);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	local_anti_air = "+ local_anti_air);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = yes");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+maksymalny_poziom);
			drukarz.println("	damage_factor = "+dmg_factor);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String practical ,double completion_size, int radar_level,int koszt, int czas) {
		try {
			//Radar station
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("radar_station = {");
			drukarz.println("	on_completion = "+practical);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	radar_level = "+ radar_level);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = yes");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = 10");
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie, String practical ,double local_underground,int koszt, int czas, int max_level,String repair) {
		try {
			//undergrounds resistance
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("underground = {");
			drukarz.println("	on_completion = "+practical);
			drukarz.println("	local_underground = "+local_underground);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = yes");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+max_level);
			drukarz.println("	show_for_province = no");
			drukarz.println("	repair = "+repair);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie ,int completion_size,int koszt, int czas, int max_level) {
		try {
			//Nuclear Reaktor
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("nucler_reactor = {");
			drukarz.println("	on_completion = nuclear_bomb");
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = yes");
			drukarz.println("	visibility = yes");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+max_level);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie ,int completion_size,String on_completion,int koszt, int czas, int max_level) {
		try {
			//Rocket test
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("rocket_test = {");
			drukarz.println("	on_completion = "+on_completion);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = yes");
			drukarz.println("	visibility = yes");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+max_level);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie ,int completion_size,String on_completion,int IC,int koszt, int czas, int max_level) {
		try {
			//Industry
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("industry = {");
			drukarz.println("	on_completion = "+on_completion);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	ic = "+IC);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = no");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+max_level);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	public Budynki(String SciezkaDocelowa, String Nazwa, String Rozszrzeszenie ,int completion_size,String on_completion,int infrastrukture,int koszt, int czas, int max_level,double dmg_factor) {
		try {
			//Infra
			PrintWriter drukarz = new PrintWriter(new FileWriter(SciezkaDocelowa+Nazwa+Rozszrzeszenie,true)); //Parametr True odpowiada za dopisywanie do pliku, bez tego plik bylby nadpisywany
			drukarz.println("industry = {");
			drukarz.println("	on_completion = "+on_completion);
			drukarz.println("	completion_size = "+completion_size);
			drukarz.println("	infrastrukture = "+infrastrukture);
			drukarz.println("	capital = yes");
			drukarz.println("	onmap = no");
			drukarz.println("	cost = "+koszt);
			drukarz.println("	time = "+czas);
			drukarz.println("	max_level = "+max_level);
			drukarz.println("	damage_factor = "+dmg_factor);
			drukarz.println("}");
			drukarz.close();
		} catch (IOException e) {
			Wiadomosc("Nie udalo sie stworzyc pliku!");
		}
	}
	void Wiadomosc(String message) {JOptionPane.showMessageDialog(null, message);}  // Message Dialog, przydatne
}
