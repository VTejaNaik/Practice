package Lab1exercise1;
import java.util.Scanner;
public class e4 {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any number");
			int number=scan.nextInt();
			int temp=0;
			
			for (int i=2; i<=number;i++) {
				
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						temp=temp+1;
					}
				}
				if(temp==0) {
					System.out.print(i+" ");
				}
				else {
					temp=0;
				}
				
			}
				
				
			
	}

}
