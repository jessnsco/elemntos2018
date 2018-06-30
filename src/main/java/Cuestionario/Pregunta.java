/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class Pregunta {
    String titulo;
    ArrayList<Opcion> op;

    public Pregunta(String titulo, ArrayList<Opcion> op) {
        this.titulo = titulo;
        this.op = op;
    }

    public Pregunta() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOp() {
        return op;
    }

    public void setOp(ArrayList<Opcion> op) {
        this.op = op;
    }
}
