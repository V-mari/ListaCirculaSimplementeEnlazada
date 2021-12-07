import javax.swing.*;

public class Main {
    public static  void main(String[] args){

    ListaDoble listita = new ListaDoble();
    int opcion = 0, elemento;
    do{
        try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar un Nodo al Inicio\n"
            +"2. Agregar uN Nodo al final\n"
            +"3. Mostrar la Lista de Inicio a Fin\n"
            +"4. Mostrar la lista de Fin a Inicio\n"
            +"5. Eliminar un nodo del inicio\n"
            +"6. Eliminar un nodo del final\n"
            +"7. Salir\n"
            +"¡Que deseas hacer?","Menu de opciones",
                    JOptionPane.INFORMATION_MESSAGE));
            switch (opcion){
                case 1 :
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingrese el elemento del Nodo", "Agregando nodo al inicio",
                            JOptionPane.INFORMATION_MESSAGE));
                    listita.agregarAlInicio(elemento);
                    break;
                case 2 :
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingrese al elemento del nodo", "Agregando Nodo al Final",
                            JOptionPane.INFORMATION_MESSAGE));
                    listita.agregarAlFinal(elemento);
                    break;
                case 3 :
                    if (!listita.estaVacia()){
                        listita.mostrarListaInicioFin();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                "lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4 :
                    if (!listita.estaVacia()){
                        listita.mostrarListaFinInicio();
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5 :
                    if (!listita.estaVacia()){
                        elemento = listita.eliminarDelInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento,
                                "Eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "No hay nodos aun",
                                "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 6 :
                    if (!listita.estaVacia()){
                        elemento = listita.eliminarDelFinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento,
                                "Eliminando Nodo del Final", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "No hay Nodos Aun",
                                "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 7 :
                    JOptionPane.showMessageDialog(null, "La opcion no esta en el Menú",
                            "Incorrecto", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
        }
    } while (opcion != 7);
}
