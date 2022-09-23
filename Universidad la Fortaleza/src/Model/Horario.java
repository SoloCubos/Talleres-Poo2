/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author solan
 */
public class Horario {
    private String horaInicio;
    private String horaFinal;
    private String salon;

    public Horario() {
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Horario{" + "horaInicio=" + horaInicio + ", horaFinal=" + horaFinal + ", salon=" + salon + '}';
    }
    
    
}
