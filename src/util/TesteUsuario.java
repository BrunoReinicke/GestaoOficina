/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.UsuaFactory;
import java.util.List;
import modelo.bean.Usuario;
import org.hibernate.StaleStateException;
/**
 *
 * @author bruno
 */
public class TesteUsuario {
    
    public static void main(String[] args) {
        // Cadastro
        Usuario usua1 = new Usuario();
        usua1.setUsuario("admin");
        usua1.setSenha("root");
        usua1.setTipo('C');
        new UsuaFactory().salvar(usua1);
        
        Usuario usua2 = new Usuario();
        usua2.setUsuario("root");
        usua2.setSenha("1234");
        usua2.setTipo('A');
        new UsuaFactory().salvar(usua2);
        
        // Consulta
        List<Usuario> lstUsu = (List<Usuario>) new UsuaFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstUsu.forEach((us) -> {
            System.out.println(us.toString());
        });
        
        // Alteração  
        boolean existe = false;
        int i = 1;
        
        while (!existe) {
            try {
                Usuario usua3 = new Usuario();
                usua3.setId(i);
                usua3.setUsuario("user");
                usua3.setSenha("pass");
                usua3.setTipo('C');
                new UsuaFactory().alterar(usua3);       
                existe = true;
            } catch (StaleStateException ex) {
                i++;
            }
        }
        
        // Consulta
        System.out.println("Consulta com filtro:\n" + new UsuaFactory().consultar(i).toString() + "\n");
        List<Usuario> lstUsu2 = (List<Usuario>) new UsuaFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstUsu2.forEach((us) -> {
            System.out.println(us.toString());
        });      
        
        // Exclusão
        new UsuaFactory().excluir(i);       
              
        // Consulta
        List<Usuario> lstUsu3 = (List<Usuario>) new UsuaFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstUsu3.forEach((us) -> {
            System.out.println(us.toString());
        });
        
        // Está logado
        Usuario usua4 = new Usuario();
        usua4.setUsuario("user");
        usua4.setSenha("pass");
        System.out.println("Logado? " + new UsuaFactory().isLogged(usua4));
        
        
        Usuario usua5 = new Usuario();
        usua5.setUsuario("bruno");
        usua5.setSenha("12345");
        usua5.setTipo('C');
        new UsuaFactory().salvar(usua5);
        
        Usuario usua6 = new Usuario();
        usua6.setUsuario("CXRP$EMAN");
        usua6.setSenha("012345678");
        usua6.setTipo('C');
        new UsuaFactory().salvar(usua6);
    }
}