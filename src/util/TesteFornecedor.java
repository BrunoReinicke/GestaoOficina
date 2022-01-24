/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.FornecFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.bean.Fornecedor;
import java.util.List;
/**
 *
 * @author bruno
 */
public class TesteFornecedor {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        Fornecedor forn = new Fornecedor();
        forn.setNome("Random");
        forn.setIdade(42);
        forn.setSexo('M');
        forn.setCpf("***.***.***-**");
        forn.setRg("*.***.***");
        forn.setDataNasc(formato.parse("14/01/1980"));
        forn.setCidade("Pomerode");
        forn.setUf("SC");
        forn.setPais("Brasil");
        new FornecFactory().salvar(forn);
        
        // Consulta
        System.out.println("Consulta com filtro:\n" + new FornecFactory().consultar(1).toString());
        
        // Alteração
        Fornecedor forn2 = new Fornecedor();
        forn2.setId(1);
        forn2.setNome("aaa");
        forn2.setIdade(29);
        forn2.setSexo('M');
        forn2.setCpf("***.***.***-**");
        forn2.setRg("*.***.***");
        forn2.setDataNasc(formato.parse("13/01/1993"));
        forn2.setCidade("AAA");
        forn2.setUf("bbb");
        forn2.setPais("Brasil");
        new FornecFactory().alterar(forn2);
        
        // Consulta
        List<Fornecedor> lstForn = (List<Fornecedor>) new FornecFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstForn.forEach((fornec) -> {
            System.out.println(fornec.toString());
        });  
        
        // Exclusão
        new FornecFactory().excluir(1);
        
        // Consulta
        List<Fornecedor> lstForn2 = (List<Fornecedor>) new FornecFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstForn2.forEach((fornec2) -> {
            System.out.println(fornec2.toString());
        });
        
        // Cadastro
        Fornecedor forn3 = new Fornecedor();
        forn3.setNome("Random");
        forn3.setIdade(42);
        forn3.setSexo('M');
        forn3.setCpf("***.***.***-**");
        forn3.setRg("*.***.***");
        forn3.setDataNasc(formato.parse("14/01/1980"));
        forn3.setCidade("Pomerode");
        forn3.setUf("SC");
        forn3.setPais("Brasil");
        new FornecFactory().salvar(forn3);
        
        Fornecedor forn4 = new Fornecedor();
        forn4.setNome("aaa");
        forn4.setIdade(29);
        forn4.setSexo('M');
        forn4.setCpf("***.***.***-**");
        forn4.setRg("*.***.***");
        forn4.setDataNasc(formato.parse("13/01/1993"));
        forn4.setCidade("AAA");
        forn4.setUf("bbb");
        forn4.setPais("Brasil");
        new FornecFactory().salvar(forn4);
    }
}