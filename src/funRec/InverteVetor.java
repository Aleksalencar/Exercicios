package funRec;

import java.util.Random;

public class InverteVetor {

	public static void main(String[] args) {
		
		int vt[] = new int [10];
		int vt2[] = new int [10];
		Random r = new Random();
		for (int i1 = 0; i1 < 10; i1++) {
			vt[i1]=r.nextInt(100);
			System.out.print("|"+vt[i1]+"| ");
		}

		vt = fInverte(vt,vt2,9,0);
		System.out.println(" ");
		for (int i = 0; i < vt2.length; i++) {
			System.out.print("|"+vt2[i]+"| ");			
		}
	}

	private static int[] fInverte(int[] vt, int[] vt2, int n, int i) {
		
		if (n==-1) {
			return vt2;
		} else {
			vt2 [n]= vt [i];
			n --;
			i ++;
			return fInverte(vt, vt2, n, i); 
			
		}
	}	
	}
