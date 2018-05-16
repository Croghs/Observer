import javafx.collections.ListChangeListener;

public class Listener  implements ListChangeListener {

    class Change<E> {

    }

    public abstract void onChanged(ListChangeListener.Change<? extends E> c) {

    }

}
