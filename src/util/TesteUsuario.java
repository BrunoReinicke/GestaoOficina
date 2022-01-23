/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.UsuaFactory;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TesteUsuario {
    
    public static void main(String[] args) {
        /*Usuario usua = new Usuario();
        usua.setUsuario("admin");
        usua.setSenha("root");
        usua.setTipo('A');
        
        UsuaFactory usf = new UsuaFactory();
        usf.salvar(usua);*/
        
        Usuario usua = new Usuario();
        usua.setId(1);
        usua.setUsuario("root");
        usua.setSenha("1234");
        usua.setTipo('C');
        
        UsuaFactory usf = new UsuaFactory();
        usf.alterar(usua);
    }
}