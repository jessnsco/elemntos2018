/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

import org.springframework.data.mongodb.repository.MongoRepository;
import unitec.elementosmvc.Mensaje;

/**
 *
 * @author T-107
 */
public interface RepoCuestionario extends MongoRepository<Pregunta, String>{
    
}
