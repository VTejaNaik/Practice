package Lab5;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args)throws Myexception {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=15) {
			System.out.println("valid age");
		}
		else {
			throw new Myexception("age should be above 15");
		}

	}

}
