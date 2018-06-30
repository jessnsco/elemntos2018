/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import unitec.elementosmvc.Estatus;


/**
 *
 * @author T-107
 */
public class ControladorCuestionario {
     @Autowired
    RepoCuestionario repoCu;
    
     @GetMapping("/mensaje")

    public List<Pregunta> buscarPregunta() {
        return repoCu.findAll();
    }
    @GetMapping("/mensaje/{Pregunta}")

    public Pregunta bucarPorTitulo(@PathVariable String titulo) {
        Pregunta pre = new Pregunta();
        return repoCu.findById(titulo).get();
    }
    @PostMapping("/mensaje")
    public Pregunta guardar(@RequestBody String json) throws Exception{
        ObjectMapper maper=new ObjectMapper();
        Pregunta pre= maper.readValue(json, Pregunta.class);
        repoCu.save(pre);
        System.out.println("Pregunta guardada"+pre);
        return Pregunta;
     
    }
    @PostMapping("/mensaje")
    public Opcion guardar(@RequestBody boolean ArrayList) throws Exception{
        ObjectMapper maper=new ObjectMapper();
        Opcion opc= maper.readValue(ArrayList, Opcion.class);
        repoCu.save(opc);
        System.out.println("Respuesta guardada"+opc);
        return Opcion;
     
    }
}
