/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.AdminFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Administrador;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TesteAdministrador {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        Administrador adm = new Administrador();
        adm.setNome("Gerson");
        adm.setIdade(53);
        adm.setSexo('M');
        adm.setCpf("***.***.***-**");
        adm.setRg("*.***.***");
        adm.setDataNasc(formato.parse("25/09/1968"));
        adm.setCidade("Pomerode");
        adm.setUf("SC");
        adm.setPais("Brasil");
        adm.setUsu(new Usuario(2, "root", "1234", 'A'));
        new AdminFactory().salvar(adm);
        
        // Consulta
        System.out.println("Consulta com filtro:\n" + new AdminFactory().consultar(1).toString());
        
        // Alteração
        Administrador adm2 = new Administrador();
        adm2.setId(1);
        adm2.setNome("Bruno");
        adm2.setIdade(25);
        adm2.setSexo('M');
        adm2.setCpf("***.***.***-**");
        adm2.setRg("*.***.***");
        adm2.setDataNasc(formato.parse("14/02/1996"));
        adm2.setCidade("Pomerode");
        adm2.setUf("SC");
        adm2.setPais("Brasil");
        adm2.setUsu(new Usuario(2, "root", "1234", 'A'));
        new AdminFactory().alterar(adm2);
        
        // Consulta
        List<Administrador> lstAdmin = (List<Administrador>) new AdminFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstAdmin.forEach((admin) -> {
            System.out.println(admin.toString());
        });  
        
        // Exclusão
        new AdminFactory().excluir(1);
        
        // Consulta
        List<Administrador> lstAdmin2 = (List<Administrador>) new AdminFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstAdmin2.forEach((admin2) -> {
            System.out.println(admin2.toString());
        });  
    }
}