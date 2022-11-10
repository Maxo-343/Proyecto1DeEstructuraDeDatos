package Proyecto1DeEstructuraDeDatos;

public class Medicamento {
    
    String nombre;
    int usuarios;

    public Medicamento() {
        this.nombre = " ";
        this.usuarios = 0;
    }

    public Medicamento(String nombre) {
        this.nombre = nombre;
        this.usuarios = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }
    
    
}


