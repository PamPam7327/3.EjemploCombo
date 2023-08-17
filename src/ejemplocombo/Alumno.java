/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocombo;

/**
 *
 * @author psg_7
 */
public class Alumno {
    private int matricula;
    private String apellido;
    private String nombres;
    private int edad;

    public Alumno(int matricula, String apellido, String nombres, int edad) {
        this.matricula = matricula;
        this.apellido = apellido;
        this.nombres = nombres;
        this.edad = edad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return matricula + " - "+ apellido + ", " + nombres + ", " + edad;
    }
    
    
}
