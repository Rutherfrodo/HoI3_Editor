import java.util.List;

public class GObject {

	private String name;
	private String displayName;
	private List<GProperty<?>> properties;
	
	public GObject(String name, String displayName, List<GProperty<?>> properties) {
		this.name = name;
		this.displayName = displayName;
		this.properties = properties;
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

	public List<GProperty<?>> getProperties() {
		return properties;
	}

	public void setProperties(List<GProperty<?>> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" = {\n");

		for (GProperty<?> gProperty : properties) {
			sb.append(gProperty.toString());
			sb.append("\n");
		}

		sb.append("}");

		return sb.toString();
	}
}
