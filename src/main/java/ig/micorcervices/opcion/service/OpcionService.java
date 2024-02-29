package ig.micorcervices.opcion.service;

import ig.micorcervices.opcion.model.Opcion;
import ig.micorcervices.opcion.repository.OpcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpcionService implements IOpcionService{

    @Autowired
    private OpcionRepository opcionRepository;

    @Override
    public List<Opcion> listAllMenu() {
        return (List<Opcion>) opcionRepository.findAll();
    }

    @Override
    public List<Opcion> findByMenu(Long idMenu) {
        return opcionRepository.findByMenuId(idMenu);
    }

    @Override
    public List<Opcion> findByAplicacion(Long idAplicacion) {
        return opcionRepository.findByIdAplicacion(idAplicacion);
    }
}
