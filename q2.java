public interface PositionalList<E> {
    Position<E> first(); 
    Position<E> last(); 
    Position<E> before(Position<E> p); 
    Position<E> after(Position<E> p); 
    void addFirst(E e); 
    void addLast(E e); 
    void addBefore(Position<E> p, E e); 
    void addAfter(Position<E> p, E e); 
    E remove(Position<E> p); 
    int size(); 
    boolean isEmpty(); 
}