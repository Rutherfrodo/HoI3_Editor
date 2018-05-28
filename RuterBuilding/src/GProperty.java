import java.io.Serializable;
import java.util.List;

public class GProperty<T> implements Serializable {

	private static final long serialVersionUID = 8892143599610310253L;

	private String name;
	private String displayName;
	private T value;
	private List<T> values;

	public GProperty(String name, String displayName, T value) {
		this(name, displayName, value, null);
	}

	public GProperty(String name, String displayName, T value, List<T> values) {
		this.name = name;
		this.displayName = displayName;
		this.value = value;
		if (values != null) {
			this.values = values;
//			System.out.println("Pole wyboru");
		} else {
//			System.out.println("Pole tekstowe do wpisania");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public List<T> getValues() {
		return values;
	}

	public void setValues(List<T> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "\t" + name + " = " + value;
	}
}
