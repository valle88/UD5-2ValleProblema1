import java.util.List;

public class SuperList extends  ListManager <T>{

private final int TOP= 0;
    @Override
    public void addElement(T element) {

        list.add(TOP, element);
    }

    @Override
    public T removeElement(int position) {
        return list.remove(TOP);
    }

    @Override
    public void showElements() {

    }

    @Override
    public void showReversedElements() {

    }

    @Override
    public String toString() {
        String out = " TOP -> ";

        for (T element: list) {
            out += element.toString() + " |";
        }
        return out;
    }
}


