package practices.files;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import practices.MissingPropertyException;

public interface PropertiesReader extends ResourcePathGetter {
	public String getProperty(Properties props, String fieldName) throws NullPointerException, MissingPropertyException;

	public String getProperty(String resourceFilename, String fieldName)
			throws NullPointerException, IOException, MissingPropertyException;

	public Map<String, String> getProperties(Properties props, List<String> propsFieldsName)
			throws NullPointerException, MissingPropertyException;

	public Map<String, String> getProperties(String resourceFilename, List<String> propsName)
			throws NullPointerException, IOException, MissingPropertyException;

	public default Map<String, String> getProperties(Properties props, String... propsName)
			throws NullPointerException, MissingPropertyException {
		return getProperties(props, Arrays.asList(propsName));
	}

	public default Map<String, String> getProperties(String resourceFilename, String... propsName)
			throws NullPointerException, IOException, MissingPropertyException {
		return getProperties(resourceFilename, Arrays.asList(propsName));
	}
}