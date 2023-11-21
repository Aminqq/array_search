package array_search;

import java.util.Scanner;

public class array_search {

	public static void main(String[] args) {

		System.out.println("the array values are : 1, 2, 3, 4, 5");
		System.out.println("please insert the value you want");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int array[] = {1, 2, 3, 4, 5};
		String ergebnis = "the value you have inserted is not matched";
		for (int i= 0; i<array.length; i++) {
			
			if(x == array[i])
				ergebnis = "the value you have inserted is matched";
		}
		
		input.close();
		System.out.println(ergebnis);
	}

}
