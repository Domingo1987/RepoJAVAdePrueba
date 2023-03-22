/**
 * @file Empleado.java
 * @brief Clase empleado
 */

package Proyecto1;

 /**
  * @class Clase empleado
  */
public class Empleado {
    private String nombre;
    private int id;
    private float salario;

    public Empleado(String nombr, int id, float salario) {
        this.nombre = nombr;
        this.id = id;
        this.salario = salario;
    }

    /**
     * @brief descripcion que hace
     * @param cada parametro
     * @return lo que sale
     */
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
