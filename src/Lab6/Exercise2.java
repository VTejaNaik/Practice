package Lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
		System.out.println(countChars(arr));
	}

	private static Map<Character,Integer> countChars(char[] arr) {
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char ch:arr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		return map;
	}

}
