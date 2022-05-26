public class SuperList extends  ListManager <T>{

private final int TOP= 0;
    @Override
    public void addElement(T element) {

        list.add(TOP, element);
    }

    @Override
    public t removeElement(int position) {
        return null;
    }

    @Override
    public void showElements() {

    }

    @Override
    public void showReversedElements() {

    }
}
