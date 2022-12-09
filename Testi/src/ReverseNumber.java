import java.util.HashMap;
import java.util.Map;

public class ReverseNumber {
	
public static void main(String[] args)
{
	int a[]= {1,2,4444444,4,222,3,0};
	int max=0;
	for(int i=0;i<a.length-1;i++)
	{
		max=a[i];
		if(max>a[i+1])
		{
			max=a[i];
		}
		
	}
	System.err.println(max);
}
}