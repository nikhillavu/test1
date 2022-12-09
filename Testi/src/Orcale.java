import java.util.LinkedHashMap;
import java.util.Map;

public class Orcale {
	public static void main(String[] args) {
	String name="ooooiiii";
	Map <Character,Integer>m=new LinkedHashMap();
	char a[]=name.toCharArray();
	for(char c: a)
	{
		if(m.containsKey(c))
		{
			m.put(c,m.get(c)+1 );
			
		}
		else
		{
			m.put(c, 1);
		}
	}
	for(Map.Entry map:m.entrySet())
	{
		System.err.println(map.getKey()+" "+map.getValue());
	}
	}

}
