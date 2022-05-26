public class Main {

    public static void main(String[] args) {
        SuperList numeros = new SuperList();

        numeros.addElement(2);
        numeros.addElement(4);
        numeros.addElement(6);
        numeros.addElement(7);
        System.out.println("listas "+numeros);
        numeros.removeElement(4);
        System.out.println("lista eliminada el ultimo "+ numeros);
        numeros.showReversedElements();
        System.out.println("lista reverse "+numeros);
    }
}
