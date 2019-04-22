package listas;

import nodes.DNode;

public class FilaDinamica{
	private DNode tail;
	private DNode head;
	private int size;
	
	FilaDinamica(){
		head = null;
		tail = null;
		size = 0;
		
	}
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enfileirar(DNode n) {
		if (isEmpty()) {
			head = n;
			tail = n;
			n.setNext(n);
			n.setPrevius(n);
		} else {
			tail.setPrevius(n);
			n.setNext(tail);
			n.setPrevius(head);
			tail = n;
		}
		size ++;
	}
	
	public void desenfileirar() {
		if (isEmpty()) {
			System.out.println("A fila esta vazia" );
		} else {
			head = head.getPrevius();
			head.setNext(tail);
		}
		size --;
	}
	
	public int infTamanho() {
		return size;
	}
	public void show() {
		System.out.println(".: Fila :.");
		DNode c = head;
		for (int i = 0; i < size; i++) {
			System.out.println(c.getElement());
			c = c.getPrevius();			
		}
		System.out.println("\n");
	}
}
