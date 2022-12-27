import java.util.*;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutu (n)= ");
		int n = input.nextInt();
		int numArr[] = new int[n];
		
		for(int i = 0; i < numArr.length; i++) {
			Scanner input2 = new Scanner(System.in);
			System.out.print("\nDizinin " + (i+1) + ". elemanı = ");
			int e = input.nextInt();
			numArr[i] = e;
		}
		
		
		Arrays.sort(numArr);
		System.out.print("\nSıralama= "); 
		for(int i = 0; i < numArr.length; i++) {
		System.out.print(numArr[i] + " ");
		}
		
	}
}
