import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GFile {

	private String name;
	private List<GObject> objects = new ArrayList<>();

	public GFile(String name, List<GObject> objects) {
		this.name = name;
		this.objects = objects;
	}
	
	public GFile(String fullPath) {
		File file = new File(fullPath);
		objects = parseFile(file);
	}

	private List<GObject> parseFile(File file) {
//		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//		    String line;
//		    while ((line = br.readLine()) != null) {
//		       // process the line.
//		    }
//		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<GObject> getObjects() {
		return objects;
	}

	public void setObjects(List<GObject> objects) {
		this.objects = objects;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (GObject gObject : objects) {
			sb.append(gObject.toString());
			sb.append("\n\n");
		}

		return sb.toString();
	}
}
