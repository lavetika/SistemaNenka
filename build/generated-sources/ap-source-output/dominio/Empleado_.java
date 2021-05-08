package dominio;

import dominio.Compra;
import dominio.Corte;
import dominio.Puesto;
import dominio.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-08T12:27:59")
@StaticMetamodel(Empleado.class)
public class Empleado_ extends Persona_ {

    public static volatile SingularAttribute<Empleado, Puesto> puesto;
    public static volatile ListAttribute<Empleado, Compra> compras;
    public static volatile ListAttribute<Empleado, Venta> ventas;
    public static volatile SingularAttribute<Empleado, String> contrasena;
    public static volatile ListAttribute<Empleado, Corte> cortes;
    public static volatile SingularAttribute<Empleado, String> username;

}