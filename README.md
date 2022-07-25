# PilaEstatica
Se desarrollo en java una práctica de estructuras de datos usando la pila que es de tipo LIFO (Last In Firt Out) con ayuda de un array.

## PilaEstatica.java
La clase PilaEstatica pertenece al paquete Pila, aquí tenemos todo el código en el cual se va a comportar nuestro programa.
La clase usara como atributos TAMPILA que es una constante con un valor de 10, "cima" es de tipo entero y servira para indicar el ultimo elemento de la pila y asi incrementar o decrementar dicha estructura y por ultimo un array de tipo entero que se llamara "pila".

``` Java
package Pila;

public class PilaEstatica {
    private static final int TAMPILA = 10;
    private int cima;
    private int pila[];
```

La clase cuenta con varios métodos para poder ejecutar la pila, el cual son los siguientes:

**Constructor PilaEstatica()**: Inicializamos los atributos cima y pila, el cual cima inicia con un valor de -1 porque sera como nuestro "nodo", ya que se usara arreglo, el primer elemento que se ingrese debe de estar en la pocisión 0, y el arreglo de pila de instancia con el tamaño de la constante TAMPILA que es de 10 elementos.
```java
    public PilaEstatica() {
        this.cima = -1;
        this.pila = new int[TAMPILA];
    }
```

**pilaVacia():** Vamos a validar si la pila esta vacía, el cual por medio de la condicional si nuestro "nodo" cima tiene un valor de -1 (no esta incrementado) pues retorna un true que efectivamente esta vacia, caso contrario manda un false de que la pila tiene al menos 1 elemento agregado.
```java
    public boolean pilaVacia() {
        if(cima == -1)
            return true;
        else
            return false;
    }
```

**pilaLlena():** Vamos a validar si la pila esta llena, usaremos una condicional donde validamos que si la pila tiene el mismo valor que TAMPILA (a causa del incremento al agregar elementos), retornara un true indicando que esta llena y no se podra agregar elementos, caso contrario, retorna un false indicando que la pila no esta llena y puedes agregar más elementos.
```java
    public boolean pilaLlena() {
        if(cima == TAMPILA)
            return true;
        else 
            return false;
    }
```

**insertarElemento(int elemento):** Con este método se va a agregar elementos a la pila, para ello debe tener un parámetro de valor entero para que se agregue valores en el método main, para ello, primero debemos de hacer una condicional, donde vamos a evaluar el retorno del método estaLlena() y si es verdadero, pues nos mandara un error con un mensaje de que la pila llego a tope, pero si es falso, pues primero incrementamos el atributo "cima" (ni modo que el primer valor se guarde en -1 si no existe en el array XD) en 1 para así agregar el valor en el arreglo, indicando como indice dicho atributo.
```java
    public void insertarElemento(int elemento) {
        if(pilaLlena())
            System.out.println("La pila esta llena.");
        else {
            cima++;
            pila[cima] = elemento;
        }
    }
```

**quitarElemento():** Con este método, nos ayudara a quitar elementos de la pila de uno en uno, primero debemos de tener una condicional, donde vamos a evaluar el retorno del método pilaVacia(), y si manda verdadero, mandara un mensaje que indica que la pila esta vacia y no se puede quitar elementos que no existen, y si manda falso, imprimira el elemento de la pila con su valor de "cima" actual y despues decrementara.
``` java

    public void quitarElemento() {
        if(pilaVacia())
            System.out.println("La pila esta vacia.");
        else {
            System.out.println("Elemento extraido: " + pila[cima]);
            cima--;
        }
    }
```
