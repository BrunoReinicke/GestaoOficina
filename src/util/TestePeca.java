/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.PecaFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Fornecedor;
import modelo.bean.Peca;

/**
 *
 * @author bruno
 */
public class TestePeca {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        Peca pe = new Peca();
        pe.setNome("Radiador");
        pe.setAno(2021);
        pe.setPreco(1000);
        pe.setMarca("random");
        pe.setForn(new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
            formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"));
        pe.setCategoria("Média");
        new PecaFactory().salvar(pe);
        
        // Consulta
        System.out.println("Consulta com filtro:\n" + new PecaFactory().consultar(1).toString());
       
        // Alteração 
        Peca pe2 = new Peca();
        pe2.setId(1);
        pe2.setNome("Radiador");
        pe2.setAno(2022);
        pe2.setPreco(1500);
        pe2.setMarca("BBBAAA");
        pe2.setForn(new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
            formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"));
        pe2.setCategoria("Média");
        new PecaFactory().alterar(pe2);
        
        // Consulta
        System.out.println("Consulta com filtro:\n" + new PecaFactory().consultar(1).toString());
       
        // Exclusão
        new PecaFactory().excluir(1);
        
        // Consulta
        List<Peca> lstPeca = (List<Peca>) new PecaFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstPeca.forEach((peca) -> {
            System.out.println(peca.toString());
        });
        
        // Cadastro
        Peca pe3 = new Peca();
        pe3.setNome("Radiador");
        pe3.setAno(2021);
        pe3.setPreco(1000);
        pe3.setMarca("random");
        pe3.setForn(new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
            formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"));
        pe3.setCategoria("Média");
        new PecaFactory().salvar(pe3);
        
        Peca pe4 = new Peca();
        pe4.setNome("Carburador");
        pe4.setAno(2022);
        pe4.setPreco(1500);
        pe4.setMarca("X");
        pe4.setForn(new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
            formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"));
        pe4.setCategoria("Média");
        new PecaFactory().salvar(pe4);
        
        Peca pe5 = new Peca();
        pe5.setNome("Amortecedor");
        pe5.setAno(2022);
        pe5.setPreco(500);
        pe5.setMarca("X");
        pe5.setForn(new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
            formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"));
        pe5.setCategoria("Pequena");
        new PecaFactory().salvar(pe5);
    }
}