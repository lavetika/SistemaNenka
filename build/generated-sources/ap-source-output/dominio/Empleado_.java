package dominio;

import dominio.Compra;
import dominio.Corte;
import dominio.Puesto;
import dominio.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-25T12:58:02")
@StaticMetamodel(Empleado.class)
public class Empleado_ extends Persona_ {

    public static volatile SingularAttribute<Empleado, Puesto> puesto;
    public static volatile ListAttribute<Empleado, Compra> compras;
    public static volatile ListAttribute<Empleado, Venta> ventas;
    public static volatile SingularAttribute<Empleado, String> contrasena;
    public static volatile ListAttribute<Empleado, Corte> cortes;
    public static volatile SingularAttribute<Empleado, String> username;

}