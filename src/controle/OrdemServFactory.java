/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.OrdemServico;

/**
 *
 * @author bruno
 */
public class OrdemServFactory extends Factory {

    public void salvar(Object obj) {
        super.salvar(obj, "OrdemServicoPU");
    }
    
    public Object consultar(int id) {
        return super.consultar("from OrdemServico where idUsuario = " + id);
    }
    
    /*public void salvar(OrdemServico os) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OrdemServicoPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(os);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    public List<OrdemServico> consultar(int idUsuario) {
        Session session = new HibernateUtil().getSessionFactory().openSession();
        List<OrdemServico> list = 
            session.createQuery("from OrdemServico where idUsuario = " + idUsuario).list();
        session.flush();
        session.close();
        
        return list; 
    }*/
}