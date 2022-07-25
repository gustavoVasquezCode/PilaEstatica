package Pila;

public class PilaEstatica {
    private static final int TAMPILA = 10;
    private int cima;
    private int pila[];

    public PilaEstatica() {
        this.cima = -1;
        this.pila = new int[TAMPILA];
    }

    public void insertarElemento(int elemento) {
        if(pilaLlena())
            System.out.println("La pila esta llena.");
        else {
            cima++;
            pila[cima] = elemento;
        }
    }

    public void quitarElemento() {
        if(pilaVacia())
            System.out.println("La pila esta vacia.");
        else {
            System.out.println("Elemento extraido: " + pila[cima]);
            cima--;
        }
    }

    public void elementoCima() {
        if(pilaVacia())
            System.out.println("La pila esta vacia, no tiene cima.");
        else
            System.out.println("Cima actual: " + pila[cima]);
    }

    public boolean pilaVacia() {
        if(cima == -1)
            return true;
        else
            return false;
    }

    public boolean pilaLlena() {
        if(cima == TAMPILA)
            return true;
        else 
            return false;
    }
}
