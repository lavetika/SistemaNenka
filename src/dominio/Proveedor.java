
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dianacastro
 */

@Entity
@Table(name = "proveedores")
public class Proveedor extends EntityBase {

    private static final long serialVersionUID = 175810479874098146L;
    
    @Column(name = "rfc", nullable = false)
    private String rfc;
    
    @Column(name = "nombre_proveedor", length = 50, nullable = false)
    private String nombre;
    
    @Column(name = "telefono", length = 12, nullable = false)
    private String telefono;
    
    @OneToOne
    @JoinColumn(name="id_direccion")
    private Direccion direccion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor")
    private List<Compra> compras;

    public Proveedor() {
    }

    public Proveedor(String rfc, String nombre, String telefono, Direccion direccion) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "rfc=" + rfc + '}';
    }
    
    
    
}
