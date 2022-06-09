package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EqualsMethodTesting {

	public String readpropFile(String propPath,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	public static void main(String[] args) throws IOException {
		EqualsMethodTesting eq = new EqualsMethodTesting();
		String value = eq.readpropFile("./data/config.properties", "browser");
		if(value.equalsIgnoreCase("chrome"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	}

}
