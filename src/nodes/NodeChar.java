package nodes;

public class NodeChar {
	public char element;
	public NodeChar next;
	
	public NodeChar(char s, NodeChar topo){
	element = s;
	next = topo;
	}

	public NodeChar(char element) {
		this(element, null);
	}

	public char getElement(){ return element; }
	public NodeChar getNext(){ return next; }
	public void setElement(char newElem){ element = newElem; }
	public void setNext(NodeChar newNext){ next = newNext; }

}
