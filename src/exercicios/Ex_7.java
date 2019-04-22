package exercicios;

import listas.LinkedList;
import nodes.Node;

public class Ex_7 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1 =PreencheListas.preencheListaSimple(l1);
		l2 =PreencheListas.preencheListaSimple(l2);
		try {
		Node currentL1 = l1.getFirst();
		Node currentL2 = l2.getFirst();
		int cta= 0;
		
		if (l1.getSize() == l2.getSize()) {
			for (int i = 0; i < l1.getSize(); i++) {
				if (currentL1.element == currentL2.element ) {
					cta++;
				}
				currentL1 = currentL1.getNext();
				currentL2 = currentL2.getNext();
			}
			if (cta==l1.getSize()) {
				System.out.println("São iguais");
			}else {
				System.out.println("Diferentes (tamanho)");
			}
		}
	}catch (Exception e) {
		System.out.println("ERRO: Impossível remover!");
		e.printStackTrace();	// TODO: handle exception
	}

	}
}