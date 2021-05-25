package dominio;

import dominio.Compra;
import dominio.Direccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-25T13:48:22")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ extends EntityBase_ {

    public static volatile ListAttribute<Proveedor, Compra> compras;
    public static volatile SingularAttribute<Proveedor, Direccion> direccion;
    public static volatile SingularAttribute<Proveedor, String> telefono;
    public static volatile SingularAttribute<Proveedor, String> nombre;
    public static volatile SingularAttribute<Proveedor, String> rfc;

}