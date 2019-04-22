package funRec;

import java.util.Random;

public class MaiorVetor {		
	
	
	public static void main(String[] args) {
		
		int vt[] = new int [10];
		Random r = new Random();
		for (int i1 = 0; i1 < 10; i1++) {
			vt[i1]=r.nextInt(100);
			System.out.print(vt[i1]+", ");
		}

		int maior = fMaior(vt,10);
		System.out.println("\n "+maior);
		
	}

	private static int fMaior(int[] vt, int n){
		int m;
		if (n==1) {
			return vt[0];
		} else {
			m = fMaior(vt, n-1);
			if (m > vt[n-1]) {
				return m;
			} else {
				return vt[n-1] ;
			}
		}
	}

}
