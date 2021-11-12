/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.bean.Usuario;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import visao.ConsUsuario;
/**
 *
 * @author bruno
 */
public class Teste {
    
    /*public static void main(String[] args) {
        /*Usuario u = new Usuario();
        u.setUsuario("Bruno");
        u.setSenha("xSASDA");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        emf.close();

        Session session = new HibernateUtil().getSessionFactory().openSession();
        List<Usuario> list = session.createQuery("from Usuario").list();
        session.flush();
        session.close();
        
        System.out.println(list.toString());
    }*/
}