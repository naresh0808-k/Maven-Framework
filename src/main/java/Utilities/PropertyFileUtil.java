package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	public static String getValueForKey(String key) throws Throwable
	{
		
		Properties configProperties=new Properties();
		FileInputStream fi=new FileInputStream("D:\\ERP_Stock\\ERP_Maven\\PropertyFile\\Environment.properties");
		configProperties.load(fi);
		
		return configProperties.getProperty(key);                                                                                                        
	}

}
