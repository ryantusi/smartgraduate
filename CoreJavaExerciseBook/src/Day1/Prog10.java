package Day1;

public class Prog10 {
	public static void main(String[] args) {
		int[][] arr2 = {
				{1,2}, {3,4}, {5,6}, {7,8}, {9,10}, {11,12}, {13,14}, {15,16}
			};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
				if(arr2[i][j]%4==0) {
					System.out.println();
				}
			}

		}
	}
}
