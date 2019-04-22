package exercicios;

public class ExExtra {
	public static void main(String[]args) {
		   int x=5;
		   int y=10;
		   int n;
		if (x <y){ 
		        n = calcula (x,y,y);
		    }else{
		        n = calcula (y,x,x);
		    }
		    System.out.println(n);
	}
	
	private static int calcula(int x, int y,int lim) {
		if(x==lim) {
			return y;
		}else {
			x = next(x);
			y = next(y);
			return calcula(x,y,lim);
		}
		
	}
	private static int next(int n) {
		n++;
		return n;
	}
	private static int previus(int n) {
		return n--;
	}
	
}

