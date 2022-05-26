
import java.util.List;


public class SuperList extends  ListManager <Integer>{
    private final int TOP= 0;



    @Override
    public void addElement(Integer element) {
        list.add(TOP, element);

    }

    @Override

    public Integer removeElement(int position) {
        return list.remove(TOP);

    }

    @Override
    public void showElements() {
        for (int i = 0; i < list.size(); i++) {
            int valor = list.get(i );
            System.out.println("elemento  " +(i+1 ) +" : " + valor);

        }
    }

    @Override
    public void showReversedElements() {
        for (int i = list.size(); i < 0; i--) {
            int valor = list.get(i);
            System.out.println("element " +(i)+ ": " +valor);
        }
    }

    @Override
    public String toString() {
        String out = "Indice ->" ;

        for (Integer element: list) {
            out += element.toString() + " " ;
        }
        return out;
    }
}


