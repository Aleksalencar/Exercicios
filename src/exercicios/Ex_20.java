package exercicios;

import filaCircularDinamica.DNode;
import listas.FilaDinamica;

public class Ex_20{

	public static void main(String[] args) {
		FilaDinamica f = new FilaDinamica();
		f.enfileirar(new DNode("Jo�o 1"));
		f.enfileirar(new DNode("Jo�o 2"));
		f.enfileirar(new DNode("Jo�o 3"));
		f.enfileirar(new DNode("Jo�o 4"));
		f.enfileirar(new DNode("Jo�o 5"));
		f.enfileirar(new DNode("Jo�o 6"));
		f.enfileirar(new DNode("Jo�o 7"));
		f.enfileirar(new DNode("Jo�o 8"));
		f.show();
		f.desenfileirar();
		f.desenfileirar();
		f.show();
	}

}
