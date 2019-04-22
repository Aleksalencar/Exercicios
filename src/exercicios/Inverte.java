package exercicios;

import exceptions.UnderflowException;
import listas.LinkedList;
import nodes.Node;


public class Inverte {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		try {
		l1.insertLast(new Node("A"));
		l1.insertLast(new Node("B"));
		l1.insertLast(new Node("C"));
		l1.insertLast(new Node("D"));
		l1.insertLast(new Node("E"));
		l1.insertLast(new Node("F"));
		System.out.println(l1.getSize());
		l1.show();
		Inverte(l1);
		l1.show();
		}catch(Exception e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();	
		}
	}
	private static void Inverte(LinkedList l1) throws UnderflowException {
		l1.getLast().setNext(l1.getFirst());
		long perc = l1.getSize()-1;
		int cta = 0;
		Node i = l1.getFirst();
		Node j = i;
		for (int x = 0; x < l1.getSize()-1; x++) {
			j = j.getNext();
		}
		
	}

}
