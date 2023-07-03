import java.util.Scanner;
public class Practice 
{
 static	int a1[]= {10,20,50,40,20};
 
 
	public static int test()
	{
		int i;
		int max1=a1[0];
		int max2=a1[1];
		for( i=0; i<a1.length ; i++)
		{
			if(a1[i]>max1) { 
				max1=a1[i];
			}
			else if(a1[i]>max2) {
				max2=a1[i];
			}
		}
		return max2;
	}
	public static void main(String[] args) 
	{
	
		System.out.println(test());

	}
}

