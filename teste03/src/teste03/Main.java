package teste03;

import java.lang.reflect.Array;

public class Main {

	public static void main(String[] args) {
		//Questão 03
		// Alternativa a)
		int n = 1;
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n;
			System.out.print(arr[i] + " ");
			n += 2;
		}
		System.out.println();
		System.out.println("===================");
		
		// Alternativa b)
		int n2 = 2;
		int[] arr2 = new int[7];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = n2;
			System.out.print(arr2[i] + " ");
			n2 *= 2;
		}
		System.out.println();
		System.out.println("===================");
		
		// Alternativa c)
		int[] arr3 = new int[8];
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i * i;
			System.out.print(arr3[i] + " ");
	
		}
		System.out.println();
		System.out.println("===================");
		
		//Alternativa d)
		int[] arr4 = new int[5];
		
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = 4 * ((i+1) * (i+1));
			System.out.print(arr4[i] + " ");

		}
		System.out.println();
		System.out.println("===================");
		
		//Alternativa e)
		int num1 = 0, num2 = 1, num3 = 1;
		
		for (int i = 0; i < 7; i++) {	
			System.out.print(num3 + " ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		System.out.println();
		System.out.println("===================");
		
		//Alternativa f)
		
		

	}

}
