package funRec;

import java.util.Random;

public class SomaVetor {

	public static void main(String[] args) {
		
		int vt[] = new int [10];
		Random r = new Random();
		int soma = 0;
		for (int i1 = 0; i1 < 10; i1++) {
			vt[i1]=r.nextInt(100);
			soma +=vt[i1]; 
			System.out.print(vt[i1]+" ");
		}
		System.out.println(soma);

		int maior = fSoma(vt,0);
		System.out.println("\n "+maior);
	
	}

	private static int fSoma(int[] vt, int i) {
		if (i <vt.length ) {
			return vt[i]+fSoma(vt, i+1);
		} else {
			return 0;			
		}
	}

}
