package teste02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int N = sc.nextInt();
		int N1 = 0;
		int N2 = 1;
		ArrayList<Integer> num = new ArrayList<>();
		
		System.out.printf("%d %d", N1, N2);
		for (int i = 2; i < N; i++) {
			int N3 = N1 + N2;
			num.add(N3);
			N1 = N2;
			N2 = N3;
		}
		
		for (int i = 0; i < num.size(); i++) {
			System.out.print(num.get(i) + " ");
		}
				
		System.out.println();
		
		if (num.contains(N)) {
			System.out.printf("O número de entrada %d pertence à sequência Fibonacci", N);
		}
		else {
			System.out.printf("O número de entrada %d não pertence à sequência Fibonacci", N);
		}
		
		sc.close();

	}

}
