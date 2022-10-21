package JavaBasicsExercises;
import java.util.Scanner;

public class ArrayToStringMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter number of items in array: ");
			num = scan.nextInt();
		}while(num<0);
		
		if(num==0) {
			System.out.println("Null");
		}else {
			System.out.println("Enter elements: ");
		}
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(arrayToString(arr));
	}
	
	public static String arrayToString(int[] array) {
		String str = "[";
		
		for(int i=0; i<array.length; i++) {
			if(i==array.length-1) {
				str += String.valueOf(array[i]);
			}else {
				str += String.valueOf(array[i]) + ", ";
			}
		}
		
		str += "]";
		return str;
	}
}
