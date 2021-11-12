/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.bean.Usuario;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author bruno
 */
public class UsuaFactory {

    public void salvar(Usuario u) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsuarioPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    public List<Usuario> consultar() {
        Session session = new HibernateUtil().getSessionFactory().openSession();
        List<Usuario> list = session.createQuery("from Usuario").list();
        session.flush();
        session.close();
        
        return list; 
    }
}