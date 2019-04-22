package exercicios;

import listas.FilaEstatica;

public class Ex_21 {

	public static void main(String[] args) {
		 FilaEstatica f = new FilaEstatica(100);        
	        f.adicionar(10);
	        f.adicionar(12);
	        f.adicionar(30);
	        f.mostrar();
	        f.remover();
	        f.mostrar();	
	        
	}

}
