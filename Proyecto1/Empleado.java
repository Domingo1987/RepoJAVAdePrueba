package Proyecto1;

public class Empleado {
    private String nombre;
    private int id;
    private float salario;

    public Empleado(String nombre, int id, float salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getId() {
        return this.id;
    }

    public float getSalarioMensual() {
        return this.salario;
    }

}
