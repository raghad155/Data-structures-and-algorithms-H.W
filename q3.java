import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int numChildren(Position<E> p) {
        int count = 0;
        for (Position<E> c : children(p)) {
            count++;
        }
        return count;
    }

    @Override
    public Iterable<Position<E>> children(Position<E> p) {
        List<Position<E>> children = new ArrayList<>();
        for (Position<E> child : children(p)) {
            children.add(child);
        }
        return children;
    }
}