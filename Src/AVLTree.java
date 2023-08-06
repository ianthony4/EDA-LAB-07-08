import org.w3c.dom.Node;

/**
 * Arbol AVL, junto con metodos necesarios para usarse, como insercion y busqueda
 **/

public class AVLTree<T extends Comparable<? super T> {
    private Node<T> root;

    // getters and setters
    public Node<T> getRoot() {
        return this.root;
    }
    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public int height(Node<T> node){
        if(node == null)
            return 0;
        return node.getheight();
    }

    public int max(int n1, int n2) {
		return Math.max(n1, n2);
		// return (n1 > n2) ? n1 : n2;
	}

    public Node<T> insert(Node<T> current, T value) {

		// Inserta el nuevo valor
		if (current == null)
			return (new Node<T>(value));

		if (value.compareTo(current.getValue()) < 0)
			current.setLeft(insert(current.getLeft(), value));
		else if (value.compareTo(current.getValue()) > 0)
			current.setRight(insert(current.getRight(), value));
		else // Salir si el nodo ya existe
			return current;

		// Actualizar altura
		current.setHeight(1 + max(height(current.getLeft()), height(current.getRight())));

		// Verifica el balanceo despues de agregar el nuevo nodo para verificar 
		// si el arbol esta en desequilibrio (menor que -1 o mayor que 1)
		int balance = getBalance(current);

		// Si el balanceo es mayor que 1, entonces procesa la rotacion a la derecha
		if (balance > 1 && value.compareTo(current.getLeft().getValue()) < 0)
			return rightRotate(current);

		// Si el balanceo es menor que -1, entonces procesa la rotacion a la izquierda
		if (balance < -1 && value.compareTo(current.getRight().getValue()) > 0)
			return leftRotate(current);

		// LR rotation
		if (balance > 1 && value.compareTo(current.getLeft().getValue()) > 0) {
			current.setLeft(leftRotate(current.getLeft()));
			return rightRotate(current);
		}

		// RL rotation
		if (balance < -1 && value.compareTo(current.getRight().getValue()) < 0) {
			current.setRight(rightRotate(current.getRight()));
			return leftRotate(current);
		}

		return current;
	}

    // Este metodo devuelve el balanceo del nodo actual
	public int getBalance(Node<T> node) {
		if (node == null)
			return 0;

		return height(node.getLeft()) - height(node.getRight());
	}
	// Este metodo encuentra el nodo en el arbol.
	public Node<T> find(AVLTree<T> tree, T v) {
		Node<T> current = tree.root;
		while (current != null && (current.getValue().compareTo(v) > 0 || current.getValue().compareTo(v) < 0)) {

			if (v.compareTo(current.getValue()) > 0)
				current = current.getRight();
			else
				current = current.getLeft();
		}

		return current;
	}
} 