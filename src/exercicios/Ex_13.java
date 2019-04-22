package exercicios;

public class Ex_13 {
	private static boolean contains(int[] vetor, int valor){
		for (int i : vetor) {
			if(i == valor)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3, 5, 5};
		int[] b = {2,3,4, 5, 5};
		int[] c = new int[6];
		int contC = 0;
		for (int valor : a) {
			if( !contains(b, valor) && !contains(c, valor) )
				c[contC++] = valor;
		}
		for (int valor : b) {
			if( !contains(a, valor) && !contains(c, valor) )
				c[contC++] = valor;
		}
		//exibe os valores
		for (int valor : c) {
			System.out.println(valor);
		}
		contains()
	}
}
