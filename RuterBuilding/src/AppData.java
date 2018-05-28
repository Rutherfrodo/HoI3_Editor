
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppData {
		
	public static class APP {
		public static String DEFAULT_PATH;
	}

	public static void loadConfig() {
		
		String configFile = "config.properties";
        Properties p = new Properties();
		try(FileInputStream fis = new FileInputStream(configFile)) {
			p.load(fis);
		} catch (IOException e) {
			throw new IllegalStateException("Coudnt find config file [" + configFile + "]", e);
		}
		
		APP.DEFAULT_PATH = p.getProperty("app.default.path");
		//APP.FILE_PART_SIZE = Integer.parseInt(p.getProperty("app.file.part.size"));
	}
}
