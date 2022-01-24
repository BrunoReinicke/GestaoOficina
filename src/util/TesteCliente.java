/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.ClienteFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Cliente;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TesteCliente {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        Cliente cli = new Cliente();
        cli.setNome("Bruno");
        cli.setIdade(25);
        cli.setSexo('M');
        cli.setCpf("***.***.***-**");
        cli.setRg("*.***.***");
        cli.setDataNasc(formato.parse("14/02/1996"));
        cli.setCidade("Pomerode");
        cli.setUf("SC");
        cli.setPais("Brasil");
        cli.setUsu(new Usuario(3, "bruno", "12345", 'C'));
        new ClienteFactory().salvar(cli);
        
        // Consulta
        System.out.println("Consulta com filtro:\n" + new ClienteFactory().consultar(1).toString());
        
        // Alteração
        Cliente cli2 = new Cliente();
        cli2.setId(1);
        cli2.setNome("aaa");
        cli2.setIdade(29);
        cli2.setSexo('M');
        cli2.setCpf("***.***.***-**");
        cli2.setRg("*.***.***");
        cli2.setDataNasc(formato.parse("13/01/1993"));
        cli2.setCidade("AAA");
        cli2.setUf("bbb");
        cli2.setPais("Brasil");
        cli2.setUsu(new Usuario(3, "bruno", "12345", 'C'));
        new ClienteFactory().alterar(cli2);
        
        // Consulta
        List<Cliente> lstClie = (List<Cliente>) new ClienteFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstClie.forEach((clie) -> {
            System.out.println(clie.toString());
        });  
        
        // Exclusão
        new ClienteFactory().excluir(1);
        
        // Consulta
        List<Cliente> lstClie2 = (List<Cliente>) new ClienteFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstClie2.forEach((clie2) -> {
            System.out.println(clie2.toString());
        });
        
        Cliente cli3 = new Cliente();
        cli3.setNome("Bruno");
        cli3.setIdade(25);
        cli3.setSexo('M');
        cli3.setCpf("***.***.***-**");
        cli3.setRg("*.***.***");
        cli3.setDataNasc(formato.parse("14/02/1996"));
        cli3.setCidade("Pomerode");
        cli3.setUf("SC");
        cli3.setPais("Brasil");
        cli3.setUsu(new Usuario(3, "bruno", "12345", 'C'));
        new ClienteFactory().salvar(cli3);
    }
}