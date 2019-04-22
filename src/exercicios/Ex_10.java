package exercicios;

import exceptions.UnderflowException;
import listas.JDLinkedList;
import nodes.DNode;

public class Ex_10 {

	public static void main(String[] args) {
		JDLinkedList l = new JDLinkedList();
		PreencheListas.preencheListaDupla(l);
		int ant = 0;
		l.show();
		try {
			l.insertBefore(new DNode("X"), ant);
		} catch (UnderflowException e) {
			e.printStackTrace();
		}
		l.show();
	}

}
