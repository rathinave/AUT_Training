package Utilities;

import java.util.HashMap;
import java.util.Map;

public class Testcontext {
	
	public static Map<String,Object> current;
	public Testcontext()
	{
		current = new HashMap<>();
		
	}
	public void set(String key,Object value)
	{
		current.put(key, value);
	}
//	public Object get(String orderId)
//	{
//		return current.get(orderId);
//	}

}
