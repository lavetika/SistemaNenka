
package dominio;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author dianacastro
 */
@MappedSuperclass
public abstract class Persona extends EntityBase{

    private static final long serialVersionUID = -6241062770652129331L;
    
    @Column(name="nombre")
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    
}
