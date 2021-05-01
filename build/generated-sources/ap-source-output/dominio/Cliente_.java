package dominio;

import dominio.Direccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-26T21:39:35")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Persona_ {

    public static volatile SingularAttribute<Cliente, Direccion> direccion;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;

}