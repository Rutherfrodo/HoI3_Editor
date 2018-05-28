import java.util.ArrayList;
import java.util.List;

public class GMain {

	
	public static void main(String[] args) {
		AppData.loadConfig();
		
		//gui
		
		//wczytaj plik
		//GFile file = new GFile(AppData.APP.DEFAULT_PATH + "\\buildings\\building1.txt"); 
		
		GFile file = testowyPlik();
		System.out.println(file.toString());
		
		//gui operacje na obiektach gry
	}

	private static GFile testowyPlik() {
		List<String> onCompletion = wczytajTestowaListeWyboru();
		List<String> booleans = wczytajBooleanListeWyboru();
		
		List<GObject> objects = new ArrayList<>();
		
		List<GProperty<?>> properties = new ArrayList<>();
		
		properties.add(new GProperty<String>("on_completion", "Practical", "construction_practical", onCompletion));
		properties.add(new GProperty<Double>("completion_size", "Wielkość", 0.13));
		properties.add(new GProperty<Integer>("air_capacity", "Pojemność", 1));
		properties.add(new GProperty<String>("capital", "Stolica", "yes", booleans));
		properties.add(new GProperty<String>("onmap", "Na mapie", "yes", booleans));
		properties.add(new GProperty<Integer>("cost", "Koszt", 4));
		properties.add(new GProperty<Integer>("time", "Czas Budowy", 90));
		properties.add(new GProperty<Integer>("max_level", "Maksymalny poziom", 10));
		properties.add(new GProperty<String>("visibility", "Pojemność", "yes", booleans));
		
		GObject lotnisko = new GObject("air_base", "Lotnisko", properties);
		
		objects.add(lotnisko);
		
		GFile file = new GFile("buildings.txt", objects);
		
		return file;
	}

	private static List<String> wczytajBooleanListeWyboru() {
		List<String> booleans = new ArrayList<>();
		booleans.add("yes");
		booleans.add("no");
		return booleans;
	}

	private static List<String> wczytajTestowaListeWyboru() {
		
		List<String> onCompletion = new ArrayList<>();
		onCompletion.add("Construction practical");
		onCompletion.add("Artillery practical");
		onCompletion.add("Electornicegineering practical");
		onCompletion.add("nuclear_bomb");
		onCompletion.add("rocket practical");
		onCompletion.add("militia_theory");
		return onCompletion;
	}
}
