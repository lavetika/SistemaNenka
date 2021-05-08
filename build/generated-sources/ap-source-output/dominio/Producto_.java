package dominio;

import dominio.Categoria;
import dominio.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-08T12:27:59")
@StaticMetamodel(Producto.class)
public class Producto_ extends EntityBase_ {

    public static volatile SingularAttribute<Producto, Integer> codigo;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile SingularAttribute<Producto, Categoria> categoria;
    public static volatile SingularAttribute<Producto, Proveedor> proveedor;
    public static volatile SingularAttribute<Producto, Double> stock;
    public static volatile SingularAttribute<Producto, String> nombre;

}