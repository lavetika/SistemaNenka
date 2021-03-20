
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dianacastro
 */

@Entity
@Table(name = "direcciones")
public class Direccion extends EntityBase {

    private static final long serialVersionUID = -2811665551116745747L;
    
    @Column(name = "calle", length = 50, nullable = false)
    private String calle;
    
    @Column(name = "numero", nullable = false)
    private int numero;
    
    @Column(name = "colonia", length = 20, nullable = false)
    private String colonia;

    public Direccion() {
    }

    public Direccion(String calle, int numero, String colonia) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + '}';
    }
    
    
    
}
