/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.humano;

/**
 *
 * @author Rolaescobar
 */
public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private String fecha_nacimiento;

    public Persona(String nombre, int edad, String sexo, String fecha_nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
