import java.util.*;

public class Main{
	public static void main(String[] args){

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		numbers.add(15);
		numbers.add(4);
		numbers.add(1);
		numbers.add(221);
		numbers.add(94);
		numbers.add(44);
		numbers.add(-5);

		for (int number : numbers){
			System.out.println(number);
		}

		System.out.println();
		Collections.sort(numbers);

		for (int number : numbers){
			System.out.println(number);
		}
	}
}