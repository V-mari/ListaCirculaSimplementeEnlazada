import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ListaLC listita = new ListaLC();
        int opcion = 0, elemento;
        boolean eliminado=false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo a la Lista Circular\n"
                                + "2. Eliminar un nodo de la Lista Circular \n"
                                + "3. Mostrar los datos de la Lista Circular\n"
                                + "4. Salir\n"
                                + "¡Que deseas hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento del Nodo", "Agregando Nodo a la Lista Circular",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(elemento);
                        break;
                    case 2:
                        if (listita.estaVacia()){


                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                              "Ingrese al elemento del nodo a Eliminar", "Eliminando Nodo de la Lista Circular",
                            JOptionPane.INFORMATION_MESSAGE));
                        eliminado=listita.eliminar(elemento);
                        if (eliminado){
                            JOptionPane.showMessageDialog(null, "El Elemento Eliminado es "+ elemento,
                                    "Eliminando Nodos", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El Elemento "+elemento+" No esta en la Lista",
                                    "Elemento no encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        } else{
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                    "lista Vacia", JOptionPane.INFORMATION_MESSAGE);

                        }
                        break;
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                    "lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el mensaje",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 4);
    }
}
