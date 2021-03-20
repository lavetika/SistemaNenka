
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
@Table(name = "provedores")
public class Proveedor implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "RFC", nullable = false)
    private int rfc;
    
    @Column(name = "nombre_provedor", length = 50, nullable = false)
    private String nombre;
    
    @Column(name = "nombre", length = 12, nullable = false)
    private String telefono;
    
    @OneToOne
    @JoinColumn(name="id_direccion")
    private Direccion direccion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provedor")
    private ArrayList<Producto> productos;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provedor")
    private List<Compra> compras;

    public Proveedor() {
    }

    public Proveedor(int rfc, String nombre, String telefono, Direccion direccion, ArrayList<Producto> productos) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.productos = productos;
    }

    public int getRfc() {
        return rfc;
    }

    public void setRfc(int rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "rfc=" + rfc + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", productos=" + productos + '}';
    }
    
    
    
}
