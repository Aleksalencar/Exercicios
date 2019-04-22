package exercicios;

import filaCircularDinamica.DNode;
import listas.FilaDinamica;

public class Ex_20{

	public static void main(String[] args) {
		FilaDinamica f = new FilaDinamica();
		f.enfileirar(new DNode("João 1"));
		f.enfileirar(new DNode("João 2"));
		f.enfileirar(new DNode("João 3"));
		f.enfileirar(new DNode("João 4"));
		f.enfileirar(new DNode("João 5"));
		f.enfileirar(new DNode("João 6"));
		f.enfileirar(new DNode("João 7"));
		f.enfileirar(new DNode("João 8"));
		f.show();
		f.desenfileirar();
		f.desenfileirar();
		f.show();
	}

}
