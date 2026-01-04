package utils;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReader {

	public static JSONObject getJsonData(String filepath) {
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(filepath);
			return (JSONObject) parser.parse(reader);
		}
		catch(Exception e ) {
			e.printStackTrace();
			return null;
		}
	}
}
