/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.humano;

import java.util.Date;

/**
 *
 * @author Rolaescobar
 */
public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private Date fecha_nacimiento;

    public Persona(String nombre, int edad, String sexo, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
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
