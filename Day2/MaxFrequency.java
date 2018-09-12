import java.util.*;
class MaxFrequency
{
	static char maxFreq(String str)
	{
		int arr[] = new int[256];
		int max = -1;
		char freq = ' ';
		for(int i=0;i<str.length();i++) 
		{
			arr[str.charAt(i)]++;
			if (max<arr[str.charAt(i)]) 
			{
                max=arr[str.charAt(i)];
                freq=str.charAt(i);
            }
        }
		return freq;
	}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your String");
	String str = sc.next();
	System.out.println("Maximum Frequency Element: "+ maxFreq(str));
}
}