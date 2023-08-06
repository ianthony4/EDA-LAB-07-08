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
} 