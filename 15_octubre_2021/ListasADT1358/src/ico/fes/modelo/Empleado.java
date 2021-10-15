/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.modelo;

/**
 *
 * @author Victor
 */
public class Empleado {
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private float sueldoBase;
    private int anioIngreso;
    private int horasExtra;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterno, String materno, float sueldoBase, int anioIngreso, int horasExtra) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + "\n nombre=" + nombre + "\n paterno=" + paterno + "\n materno=" + materno + "\n sueldoBase=" + sueldoBase + "\n anioIngreso=" + anioIngreso + "\n horasExtra=" + horasExtra + "}\n-------------------------\n";
    }
    
    
    
}
