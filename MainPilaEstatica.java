package Pila;

public class MainPilaEstatica {
    public static void main(String[] args) {
        PilaEstatica obj1 = new PilaEstatica();
        System.out.println("");
        obj1.quitarElemento();
        System.out.println("");
        obj1.insertarElemento(15);
        obj1.insertarElemento(6);
        obj1.elementoCima();
        System.out.println("");
        obj1.quitarElemento();
        System.out.println("");
        obj1.elementoCima();
        System.out.println("");
        obj1.quitarElemento();
        System.out.println("");
        obj1.quitarElemento();
        System.out.println("");
    }
}
