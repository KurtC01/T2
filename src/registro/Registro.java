/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;


public class Registro {
    String nombreA;
    String turno;
    String curso;

    public Registro() {
    }
    

    public Registro(String nombreA, String turno, String curso) {
        this.nombreA = nombreA;
        this.turno = turno;
        this.curso = curso;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Registro{" + "nombreA=" + nombreA + ","
                + " turno=" + turno + ", "
                + "curso=" + curso + '}';
    }
    
   
}    
    

