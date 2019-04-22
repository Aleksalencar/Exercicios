package exercicios;

import listas.*;
import nodes.*;
public class PreencheListas {

	@SuppressWarnings("finally")
	public static LinkedList preencheListaSimple(LinkedList l1) {
		try {
		l1.insertLast(new Node("A"));
		l1.insertLast(new Node("B"));
		l1.insertLast(new Node("C"));
		l1.insertLast(new Node("D"));
		l1.insertLast(new Node("F"));
		l1.insertLast(new Node("G"));
		l1.insertLast(new Node("H"));
		l1.insertLast(new Node("I"));
		l1.insertLast(new Node("J"));
		l1.insertLast(new Node("K"));
		l1.insertLast(new Node("L"));
		}catch(Exception e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();	
		}finally {
			return l1;
		}
		
	}
	
	public static JDLinkedList preencheListaDupla(JDLinkedList l1) {
		try {
		l1.insertLast(new DNode("A"));
		l1.insertLast(new DNode("B"));
		l1.insertLast(new DNode("C"));
		l1.insertLast(new DNode("D"));
		l1.insertLast(new DNode("F"));
		l1.insertLast(new DNode("G"));
		l1.insertLast(new DNode("H"));
		l1.insertLast(new DNode("I"));
		l1.insertLast(new DNode("J"));
		l1.insertLast(new DNode("K"));
		l1.insertLast(new DNode("L"));
		}catch(Exception e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();	
		}finally {
			return l1;
		}
		
	}
	
	
}
