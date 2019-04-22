package exercicios;

import org.w3c.dom.ls.LSInput;

import circularlist.DNode;
import listas.CircularList;

public class Main {

	public static void main(String[] args) {
		CircularList lista = new CircularList();
		try {
			lista.insertLast(new DNode("João"));
			lista.insertLast(new DNode("Pedro"));
			lista.insertLast(new DNode("Bruno"));
			lista.insertLast(new DNode("Lucas"));
			lista.insertLast(new DNode("Breno"));
			lista.insertLast(new DNode("Ana"));
			lista.insertLast(new DNode("Jussara"));
			lista.insertLast(new DNode("Jessica"));
			lista.show(1);
			int k=7;
			josephus(lista,k-1);
			lista.show(1);
		} catch (Exception e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();
			}
		}

	private static void josephus(CircularList l, int k) {
		int cta = 0;
		DNode current = l.head;
		while(l.size !=1) {
				for (int i = 0; i < k; i++) {
				current = current.getNext();
			}
			System.out.println();
			System.out.println(current.getElement().toString()+" saiu");
		
			current.getPrevious().SetNext(current.getNext());
			current.getNext().SetPrevius(current.getPrevious());
			current = current.getNext();
			}
		}
	
		
	}
