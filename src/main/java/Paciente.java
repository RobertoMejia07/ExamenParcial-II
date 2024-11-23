/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rober
 */
public class Paciente extends Persona {
    
    private String numeroHistorial;
    private String Enfermedad;

    public Paciente(String numeroHistorial, String Enfermedad, String nombre, String edad, String direccion) {
        super(nombre, edad, direccion);
        this.numeroHistorial = numeroHistorial;
        this.Enfermedad = Enfermedad;
    }

    public String getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(String numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }
    
    
}
