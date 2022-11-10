package Proyecto1DeEstructuraDeDatos;

import java.util.Scanner;

public class Proyecto1DeEstructuraDeDatos {

    public static void main(String[] args) {
        
        String nombre;
        String medicina;

        ListaPacientes paciente = new ListaPacientes();
        ListaMedicamentos medicam = new ListaMedicamentos();


        Scanner teclado = new Scanner(System.in);

        byte opcion = 0;

          try {
               do {
         
            System.out.println("\033[31m===============SISTEMA CLÍNICO==============="
                    + "\n\t1.   Agregar Paciente "
                    + "\n\t2.   Agregar Medicamentos "
                    + "\n\t3.   Asignar Medicamentos"
                    + "\n\t4.   Consultar Pacientes "
                    + "\n\t5.   Consultar Medicamentos "
                    + "\n\t6.   Borrar Medicamentos "
                    + "\n\t7.   Reportes de pacientes sin Medicamentos "
                    + "\n\t8.   Salir del sistema");
            System.out.println("\033[31m===============================================\n\t");
                    
            opcion = teclado.nextByte();

            switch (opcion) {

                case 1:
                    System.out.println("\n\033[31m===============AGREGANDO NUEVO PACIENTE===============");
                    System.out.println("Ingrese el nombre del paciente que deseas agregar: ");
                    nombre = teclado.next();
                    System.out.println("\033[31m========================================================\n\t");
                    
                    Paciente persona = new Paciente(nombre);
                    paciente.InsertarPaciente(persona);

                    break;

                case 2:
                    System.out.println("\n\033[31m===============AGREGANDO NUEVO MEDICAMENTO===============");
                    System.out.println("Ingrese el nombre del medicamento que deseas agregar: ");
                    nombre = teclado.next();
                    System.out.println("\033[31m===========================================================\n\t");
                    
                    Medicamento medicamento = new Medicamento(nombre);
                    medicam.InsertarMedicamento(medicamento);

                    break;

                case 3:
                    System.out.println("\n\033[31m===============ASIGNANDO UN MEDICAMENTO===============");
                    System.out.println("Ingrese el nombre del medicamento que deseas asignar: ");
                    medicina = teclado.next();
                    System.out.println(" ");
                    
                    System.out.println("Ingrese el nombre del paciente al que deseas asignarle el medicamento: ");
                    nombre = teclado.next();
                    System.out.println("\033[31m========================================================\n\t");
                    paciente.AsignarMedicamento(medicam.Buscar(medicina), nombre);

                    break;

                case 4:
                    System.out.println("\n\033[31m===============LISTA DE PACIENTES CON SUS MEDICAMENTOS===============");
                    paciente.Verlista();
                    System.out.println("\033[31m=======================================================================\n\t");
                    break;

                case 5:
                    System.out.println("\n\033[31m===============LISTA DE MEDICAMENTOS===============");
                    medicam.Verlista();
                    System.out.println("\033[31m=====================================================\n\t");
                    break;

                case 6:
                    System.out.println("\n\033[31m===============ELIMINAR MEDICAMENTO===============");
                    System.out.println("Ingrese el nombre del medicamento que deseas eliminar: ");
                    medicam.Eliminar(medicina = teclado.next());
                    System.out.println("\033[31m====================================================\n\t");
                    break;

                case 7:
                    System.out.println("\n\033[31m===============PACIENTES SIN MEDICAMENTO===============");
                    paciente.ListaVacia();
                    System.out.println("\033[31m=========================================================\n\t");
                    break;
                    
                case 8:
                    System.out.println("\n\033[31m===========GRACIAS POR UTILIZAR NUESTRO SISTEMA :)===========");
                    
            }
        } while (opcion != 8);
              
                    
            } catch (Exception e) {
                System.out.println("¡NO ME DISTE UN VALOR NUMÉRICO!\n");
            }
       

    }
}

    
    

