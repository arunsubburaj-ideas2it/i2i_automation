package iomd_util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoad {

	public static Properties propLoad() throws IOException {
		FileInputStream fis = new FileInputStream("Input/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;

	}

}
