package Lab5;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) throws Myexception{
		Scanner sc=new Scanner(System.in);
		String f_name=sc.nextLine();
		String l_name=sc.nextLine();
		String m_name=sc.nextLine();
		sc.close();
		if(f_name=="" || l_name=="") {
			throw new Myexception("please enter last name and first name");
		}
		else {
			System.out.println("Name is valid!!!");
		}

	}

}
