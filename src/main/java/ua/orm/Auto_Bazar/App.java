package ua.orm.Auto_Bazar;

import javax.persistence.*;

public class App 
{
    public static void main( String[] args )
    {

    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
    	EntityManager em = factory.createEntityManager();
    	
    	
    	
    	
    	
    	em.close();
    	factory.close();
    }
}
