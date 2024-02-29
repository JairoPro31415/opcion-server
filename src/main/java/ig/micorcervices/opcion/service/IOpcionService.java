package ig.micorcervices.opcion.service;

import ig.micorcervices.opcion.model.Opcion;

import java.util.List;

public interface IOpcionService {

    public List<Opcion> listAllMenu();

    public List<Opcion> findByMenu(Long idMenu);

    public List<Opcion> findByAplicacion(Long idAplicacion);
}
