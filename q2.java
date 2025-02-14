public interface Tree<E> {
    Position<E> root(); 
    int numChildren(Position<E> p); 
    Iterable<Position<E>> children(Position<E> p); 
    boolean isEmpty(); 
    int size();
}