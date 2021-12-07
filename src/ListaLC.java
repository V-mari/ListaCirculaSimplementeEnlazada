import javax.swing.*;

public class ListaLC {
    NodoLC ultimo;
    public ListaLC(){
       ultimo = null;


    }
    public boolean estaVacia(){
        return ultimo == null;
    }
    public ListaLC insertar(int elemento){
        NodoLC nuevo= new NodoLC(elemento);
        if (ultimo!= null){
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo = nuevo;
        return this;
    }
    // Metodo para mostrar la lista
    public void mostrarLista(){
        NodoLC auxiliar = ultimo.siguiente;
        String cadena="";
        do{
cadena=cadena + "[" + auxiliar.dato+"]->";
        }while(auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena,
                "Mostrando La Lista Circular", JOptionPane.INFORMATION_MESSAGE);

    }
}
