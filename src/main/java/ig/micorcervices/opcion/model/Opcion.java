package ig.micorcervices.opcion.model;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
@Table(name = "OPCION")
public class Opcion {
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
//    @Lob
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OUTCOME")
    private String outcome;
    @Basic(optional = false)
    @Column(name = "CODOPERACIO")
    private String codoperacio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FAVORITO")
    private boolean favorito;
    @Column(name = "ORDEN")
    private Integer orden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private int estado;

    @Column(name = "ID_APLICACION")
    private Long idAplicacion;

    @Column(name = "TRAZA")
    private Boolean traza;

}
