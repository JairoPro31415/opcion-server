package ig.micorcervices.opcion.repository;

import ig.micorcervices.opcion.model.Opcion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OpcionRepository extends CrudRepository<Opcion, Long> {

    public List<Opcion> findByIdAplicacion(Long idAplicacion);

    @Query(value = "SELECT o.* FROM OPCION o " +
            "INNER JOIN MENU_OPCION mo ON o.ID = mo.ID_OPCION " +
            "INNER JOIN MENU m ON mo.ID_MENU = m.ID " +
            "WHERE m.ID = :idMenu",
            nativeQuery = true)
    List<Opcion> findByMenuId(@Param("idMenu") Long idMenu);
}
