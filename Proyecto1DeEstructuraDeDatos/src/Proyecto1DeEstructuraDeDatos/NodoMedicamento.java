package Proyecto1DeEstructuraDeDatos;

public class NodoMedicamento {
    
    Medicamento Medicamento_1 = new Medicamento();
    NodoMedicamento siguiente;

    public Medicamento getElMedicamento() {
        return Medicamento_1;
    }

    public void setElMedicamento(Medicamento Medicamento_1) {
        this.Medicamento_1 = Medicamento_1;
    }

    public NodoMedicamento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMedicamento siguiente) {
        this.siguiente = siguiente;
    }
}
    

    
    

