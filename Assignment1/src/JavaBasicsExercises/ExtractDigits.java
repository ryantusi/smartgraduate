package JavaBasicsExercises;

public class ExtractDigits {
	public static void main(String[] args) {
		int n = 15423;
		while(n>0) {
			System.out.print(n%10 + " ");
			n = n/10;
		}
	}
}
