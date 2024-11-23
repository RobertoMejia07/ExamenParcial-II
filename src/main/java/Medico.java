/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rober
 */
public class Medico extends Persona{
    
    private String AniosExperiencia;
    private String Especialidad;

    public Medico(String AniosExperiencia, String Especialidad, String nombre, String edad, String direccion) {
        super(nombre, edad, direccion);
        this.AniosExperiencia = AniosExperiencia;
        this.Especialidad = Especialidad;
    }

    public String getAniosExperiencia() {
        return AniosExperiencia;
    }

    public void setAniosExperiencia(String AniosExperiencia) {
        this.AniosExperiencia = AniosExperiencia;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    
}
