import java.util.Scanner;
public class Looping1 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter  the number");
		int n= ip.nextInt();
		
		
		int sum=0;
	
		System.out.println(sum);
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
//			System.out.print(sum + "");
		}
		

	}

}
