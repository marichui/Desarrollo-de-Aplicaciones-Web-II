package pe.oyola.tarea.jpa.test;

import javax.persistence.EntityManager;

import pe.oyola.tarea.cnx.JPAUtil;

public class testUnitario {

	public static void main(String[] args) {
		invocarEntityManager();
	}
	private static void	invocarEntityManager() {
	
EntityManager manager=JPAUtil.getEntityManager();
System.out.println("Listo");
}}
