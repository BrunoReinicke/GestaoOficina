/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class UsuaFactory extends Factory {

    public void salvar(Object obj) {
        super.salvar(obj, "UsuarioPU");
    }
    
    public Object consultar() {
        return super.consultar("from Usuario");
    }
    
    public boolean isLogged(Usuario u) {
        return super.consultar(
            "from Usuario where usuario = '"+u.getUsuario()+"' and senha = '"+u.getSenha()+"'").size() > 0; 
    }
    
    @Override
    public void alterar(Object obj) {
        super.alterar(obj);
    }
    
    public Object consultar(Integer id) {
        return super.consultar("from Usuario where id = " + id);
    }
    
    public void excluir(Integer id) {
        super.excluir("UsuarioPU", id, new Usuario());
    }
}