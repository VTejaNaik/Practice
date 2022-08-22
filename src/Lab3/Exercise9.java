package Lab3;
import java.time.LocalDate;
import java.util.Scanner;


public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		getMonthDayYear(str);

	}

	private static void getMonthDayYear(String str) {
		// TODO Auto-generated method stub
		LocalDate curr=LocalDate.parse(str);
		System.out.println("Day: "+curr.getDayOfMonth());
		System.out.println("Month: "+curr.getMonth());
		System.out.println("Year: "+curr.getYear());

	}

}
