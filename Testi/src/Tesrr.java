import java.util.Map;
import java.util.TreeMap;

public class Tesrr {
public static void main(String[] args)
{
	Map<Character,Integer>kk=new TreeMap();
//	
//	String name="ooooppp";
//	char a[]=name.toCharArray();
//	
//	for(char c:a)
//	{
//		if(kk.containsKey(c))
//		{
//			kk.put(c, kk.get(c)+1);
//		}
//		else
//		{
//			kk.put(c, 1);
//		}
//	}
//	for(Map.Entry m :kk.entrySet())
//	{
//		System.err.println(m.getKey()+" "+m.getValue());
//	}
String nsme="qqqqqaaaa";
char a[]=nsme.toCharArray();

for(char s:a)
{
	if(kk.containsKey(s))
	{
		kk.put(s,kk.get(s)+1);
	}
	else
	{
		kk.put(s, 1);
	}
	
}
for(Map.Entry M:kk.entrySet())
{
	System.err.println(M.getKey()+" "+M.getValue());
}
}
}
