package ig.micorcervices.opcion.controller;

import ig.micorcervices.opcion.model.Opcion;
import ig.micorcervices.opcion.service.OpcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/opcion")
public class OpcionController {

    @Autowired
    private OpcionService opcionService;

    @GetMapping("/menu/{idMenu}")
    public ResponseEntity<List<Opcion>> findByMenu(@PathVariable("idMenu") Long idMenu){

        List<Opcion> opciones=opcionService.findByMenu(idMenu);

        if(opciones.isEmpty()){
            return  ResponseEntity.noContent().build();
        }
        return  ResponseEntity.ok(opciones);
    }

}
