package Lab7;
import java.util.HashMap;

public class Exercise3 {
	public HashMap<Integer, Integer> getSquares(int[] arr){
		HashMap<Integer, Integer> result=new HashMap<Integer, Integer>();
		for(int number: arr) {
			result.put(number,(int)Math.pow(number, 2));
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise3  ex=new Exercise3();
		int[] arr= {1,3,6,2,8,5,9};
		System.out.println(ex.getSquares(arr));

	}

}
