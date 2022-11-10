package Proyecto1DeEstructuraDeDatos;

import java.util.Scanner;

public class ListaMedicamentos {
    
    NodoMedicamento primero;
    NodoMedicamento ultimo;
    
    Scanner teclado = new Scanner(System.in);

    public ListaMedicamentos(){
        primero = null;
        ultimo = null;
        
    }
    
    public void InsertarMedicamento(Medicamento info) {
        NodoMedicamento nodoNuevo = new NodoMedicamento();

        nodoNuevo.setElMedicamento(info);

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
    
    public Medicamento Buscar(String info) {
        NodoMedicamento nodoActual = new NodoMedicamento();
        nodoActual = primero;
        while (nodoActual != null) {

            if (nodoActual.Medicamento_1.getNombre().equals(info)) {

                return nodoActual.Medicamento_1;
            }

            nodoActual = nodoActual.siguiente;

        }
        return null;
    }
    
    public void Eliminar(String info) {
        NodoMedicamento nodoActual = new NodoMedicamento();
        NodoMedicamento nodoAnterior = new NodoMedicamento();
        nodoActual = primero;
        nodoAnterior = null;
        
        while (nodoActual != null) {

            if (nodoActual.Medicamento_1.getNombre().equals(info) && nodoActual.getElMedicamento().usuarios == 0) {
                
                if(nodoActual == primero){
                    primero = primero.siguiente;  
                    
                }else{
                    nodoAnterior.siguiente = nodoActual.siguiente;
                    
                }
            }
            
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;

        }
    }
    
     public void Verlista() {
        NodoMedicamento nodoActual = new NodoMedicamento();
        nodoActual = primero;

        while (nodoActual != null) {
            System.out.println("\t"+nodoActual.Medicamento_1.getNombre());
            nodoActual = nodoActual.siguiente;
        }

    }
    
    
    
}
