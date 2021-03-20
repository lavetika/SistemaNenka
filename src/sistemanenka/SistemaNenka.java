
package sistemanenka;

import dominio.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dianacastro
 */
public class SistemaNenka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaNenkaPU");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        
        Categoria categoria = new Categoria("Sodas", "que rika soda");
        
        entityManager.persist(categoria);
         entityManager.getTransaction().commit();
         System.out.println("La categoria se ha insertado");
    }
    
}
