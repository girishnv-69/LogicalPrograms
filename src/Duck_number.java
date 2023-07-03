import java.util.Scanner;
public class Duck_number {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		 Scanner ip = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n1 = ip.nextInt();
//		int n1=20102;
		 boolean flag=false;
		 int rem=0;
		 while(n1!=0)
		 {
			 rem=n1%10;
			 if(rem==0) {
				 flag=true;
				 break;
			 }
		 }
		 n1=n1/10;
		 if(flag==false) {
			 System.out.println("not a duck num");
		 }
		 else {
			 System.out.println("duck num");
		 }
	}

}
