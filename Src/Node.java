
public class Node<T extends Comparable<? super T>> {
	// Cada nodo tiene una altura, datos y un hijo izquierdo y derecho
	//Atributos
	private int height;
	private Node<T> left, right;
	private T value;
	
	//Getters y Setters  
	public Node(T value) {
		this.value = value;
		height = 1;
	}

	

}