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
public class Cuestionario {
     public static void main(String[] args) {
       
        Opcion op1= new Opcion("18",true);
        Opcion op2= new Opcion("16",false);
        
        ArrayList<Opcion> op= new ArrayList<>();
        op.add(op1);
        op.add(op2);
        
      
        Pregunta p1= new Pregunta();
        p1.setTitulo("¿A que edad se considera una persona mayor de edad?");
        p1.setOp(op);
        
        
        ModeloCuestionario modelo= new ModeloCuestionario();
        modelo.agregarPregunta(p1);
        ArrayList<Pregunta> c= modelo.obtenerCuestionario();
        
       
        for(Pregunta p: c){
            System.out.println(p.getTitulo());
            for(Opcion o: p.getOp()){
                System.out.println(o.getTitulo()+ ""+ o.isCorrecta());
            }
        }
    }
}
