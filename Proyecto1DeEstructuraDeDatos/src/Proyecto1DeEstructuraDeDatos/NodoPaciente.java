package Proyecto1DeEstructuraDeDatos;

public class NodoPaciente {
    
    Paciente Paciente_1 = new Paciente();
    NodoPaciente siguiente;

    public Paciente getElPaciente() {
        return Paciente_1;
    }

    public void setElPaciente(Paciente Paciente_1) {
        this.Paciente_1 = Paciente_1;
    }

    public NodoPaciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPaciente siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
    

