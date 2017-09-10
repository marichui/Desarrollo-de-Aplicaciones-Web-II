package pe.oyola.tarea.cnx;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.collections.Factory;

public class JPAUtil {
	private static EntityManagerFactory FACTORY =Persistence.createEntityManagerFactory("BD");
	
	//obtiene la conexion a la base de datos dawi2017
	public static EntityManager getEntityManager(){
		return FACTORY.createEntityManager();
	}

}
