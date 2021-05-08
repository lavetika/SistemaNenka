package dominio;

import dominio.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-08T12:27:59")
@StaticMetamodel(Categoria.class)
public class Categoria_ extends EntityBase_ {

    public static volatile SingularAttribute<Categoria, String> descripcion;
    public static volatile SingularAttribute<Categoria, String> nombre;
    public static volatile ListAttribute<Categoria, Producto> productos;

}