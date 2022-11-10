package Proyecto1DeEstructuraDeDatos;

public class Paciente {
    
    String nombre;
    ListaMedicamentos Lista = new ListaMedicamentos();
    
    public Paciente(String nombre){
        this.nombre = nombre;   
    }

    public Paciente() {
        this.nombre = " ";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaMedicamentos getLaLista() {
        return Lista;
    }

    public void setLaLista(ListaMedicamentos LaLista) {
        this.Lista = LaLista;
    }
    
    
}
    

