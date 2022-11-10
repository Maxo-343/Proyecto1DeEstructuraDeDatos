package Proyecto1DeEstructuraDeDatos;

import java.util.Scanner;

public class ListaPacientes {
    
    NodoPaciente primero;
    NodoPaciente ultimo;
    Scanner teclado = new Scanner(System.in);

    public ListaPacientes() {
        primero = null;
        ultimo = null;
    }

    public void InsertarPaciente(Paciente info) {

        NodoPaciente nodoNuevo = new NodoPaciente();
        nodoNuevo.setElPaciente(info);

        if (primero == null) {
            primero = nodoNuevo;
            primero.siguiente = null;
            ultimo = primero;

        } else {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            ultimo = nodoNuevo;

        }

    }

    public void AsignarMedicamento(Medicamento info, String nombre) {

        NodoPaciente nodoActual = primero;

        while (nodoActual != null) {

            if (nodoActual.getElPaciente().getNombre().equals(nombre)) {
                nodoActual.getElPaciente().getLaLista().InsertarMedicamento(info);
                info.setUsuarios(info.getUsuarios() + 1);
            }

            nodoActual = nodoActual.getSiguiente();

        }

    }

    public void ListaVacia() {

        NodoPaciente nodoActual = new NodoPaciente();
        nodoActual = primero;

        while (nodoActual != null) {
            if (nodoActual.Paciente_1.Lista.primero == null) {
                
                System.out.println(nodoActual.Paciente_1.getNombre());
                
            }
            nodoActual = nodoActual.siguiente;
        }

    }
    
    public void Verlista() {

        NodoPaciente nodoActual = new NodoPaciente();
        nodoActual = primero;

        while (nodoActual != null) {
            System.out.println(nodoActual.Paciente_1.getNombre()+": ");
            nodoActual.getElPaciente().Lista.Verlista();
            nodoActual = nodoActual.siguiente;
        }

    }

}

    

