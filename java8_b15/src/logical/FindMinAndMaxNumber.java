package logical;

public class FindMinAndMaxNumber {
	public static void main(String[] args) {
		int arr[] = { 9, 14, 98, 35, 50, 2, 70, 62, 38, 71, 101 };
		int min = arr[0]; // 9 2
		int max = arr[0]; // 9 98

		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {
// 9>14=false; 9>98=F; 9>35=F; 9>50=F; 9>2=T; 2>70=F; 2>62=F; 2>38=F; 2>71=F; 2>101=F; 			
				min = arr[i];

			} else if (max < arr[i]) {
// 9<14=true; 14<98=T; 98<35=F;	98<50=F; 98<2=F; 98<70=F; 98<62=F; 98<38=F;	98<71=F; 98<101=T; 	
				max = arr[i];

			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
