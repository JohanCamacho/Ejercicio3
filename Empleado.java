package com.company;

public class Empleado {

    private int id ;
    private String Nombre;
    private String Apellido;
    private int Salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    public Empleado(int id, String nombre, String apellido, int salario) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Salario = salario;

    }

    public String toString (){
        return "Id: "+getId()+" - Nombre: "+getNombre()+" - Apellido: "+getApellido()+ " - Salario: "+getSalario();
    }
}

