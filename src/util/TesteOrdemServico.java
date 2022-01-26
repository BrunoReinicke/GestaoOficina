/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.OrdemServFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Carro;
import modelo.bean.Cliente;
import modelo.bean.Fornecedor;
import modelo.bean.OrdemServico;
import modelo.bean.Peca;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TesteOrdemServico {
 
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        OrdemServico os = new OrdemServico();
        os.setCarro(new Carro(2, "Palio", 1998, 
            new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
                formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
                new Usuario(3, "bruno", "12345", 'C')),
            "SUL-XLLY", "Blumenau", "SC", "Brasil", "Fiat"));
        os.setPeca(new Peca(2, "Radiador", 2021, 1000, "random", 
            new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
                formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"),
            "Média"));
        os.setStatus(0);
        os.setDtAbertura(formato.parse("24/01/2022"));
        os.setPrazoEntrega(formato.parse("28/01/2022"));
        os.setPecaTrocada(false);
        os.setCliente(new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", new Usuario(3, "bruno", "12345", 'C')));
        new OrdemServFactory().salvar(os);
        
        OrdemServico os2 = new OrdemServico();
        os2.setCarro(new Carro(2, "Palio", 1998, 
            new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
                formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
                new Usuario(3, "bruno", "12345", 'C')),
            "SUL-XLLY", "Blumenau", "SC", "Brasil", "Fiat"));
        os2.setPeca(new Peca(3, "Carburador", 2022, 1500, "X",
            new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
                formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"),
            "Média"));
        os2.setStatus(0);
        os2.setDtAbertura(formato.parse("24/01/2022"));
        os2.setPrazoEntrega(formato.parse("28/01/2022"));
        os2.setPecaTrocada(false);
        os2.setCliente(new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", new Usuario(3, "bruno", "12345", 'C')));
        new OrdemServFactory().salvar(os2);
        
        OrdemServico os3 = new OrdemServico();
        os3.setCarro(new Carro(2, "Palio", 1998, 
            new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
                formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
                new Usuario(3, "bruno", "12345", 'C')),
            "SUL-XLLY", "Blumenau", "SC", "Brasil", "Fiat"));
        os3.setPeca(new Peca(3, "Carburador", 2022, 1500, "X",
            new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
                formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"),
            "Média"));
        os3.setStatus(0);
        os3.setDtAbertura(formato.parse("24/01/2022"));
        os3.setPrazoEntrega(formato.parse("28/01/2022"));
        os3.setPecaTrocada(false);
        os3.setCliente(new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", new Usuario(3, "bruno", "12345", 'C')));
        new OrdemServFactory().salvar(os3);
        
        OrdemServico os4 = new OrdemServico();
        os4.setCarro(new Carro(3, "C4", 2008, 
            new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
                formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
                new Usuario(3, "bruno", "12345", 'C')),
            "$UL-X11Y", "Joinville", "SC", "Brasil", "Citroen"));
        os4.setPeca(new Peca(3, "Carburador", 2022, 1500, "X",
            new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
                formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"),
            "Média"));
        os4.setStatus(0);
        os4.setDtAbertura(formato.parse("24/01/2022"));
        os4.setPrazoEntrega(formato.parse("28/01/2022"));
        os4.setPecaTrocada(false);
        os4.setCliente(new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", new Usuario(3, "bruno", "12345", 'C')));
        new OrdemServFactory().salvar(os4);
        
        OrdemServico os5 = new OrdemServico();
        os5.setCarro(new Carro(4, "Sportage", 2010, 
            new Cliente(3, "CXRP$EMAN", 25, 'M', "***.***.***-**", "*.***.***", 
                formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
                new Usuario(4, "CXRP$EMAN", "012345678", 'C')),
            "SUL-FFDP", "Joinville", "SC", "Brasil", "Citroen"));
        os5.setPeca(new Peca(3, "Carburador", 2022, 1500, "X",
            new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
                formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"),
            "Média"));
        os5.setStatus(0);
        os5.setDtAbertura(formato.parse("24/01/2022"));
        os5.setPrazoEntrega(formato.parse("28/01/2022"));
        os5.setPecaTrocada(false);
        os5.setCliente(new Cliente(3, "CXRP$EMAN", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
            new Usuario(4, "CXRP$EMAN", "012345678", 'C')));
        new OrdemServFactory().salvar(os5);
        
        // Consulta
        List<OrdemServico> lstOS = (List<OrdemServico>) new OrdemServFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstOS.forEach((ordServ) -> {
            System.out.println(ordServ.toString());
        });
        
        // Alteração
        OrdemServico os6 = new OrdemServico();
        os6.setId(5);
        os6.setCarro(new Carro(4, "Sportage", 2010, 
            new Cliente(3, "CXRP$EMAN", 25, 'M', "***.***.***-**", "*.***.***", 
                formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
                new Usuario(4, "CXRP$EMAN", "012345678", 'C')),
            "SUL-FFDP", "Joinville", "SC", "Brasil", "Citroen"));
        os6.setPeca(new Peca(3, "Carburador", 2022, 1500, "X",
            new Fornecedor(2, "Random", 42, 'M', "***.***.***-**", "*.***.***",
                formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"),
            "Média"));
        os6.setNumero(4);
        os6.setStatus(0);
        os6.setDtAbertura(formato.parse("25/01/2022"));
        os6.setPrazoEntrega(formato.parse("02/02/2022"));
        os6.setPecaTrocada(true);
        os6.setCliente(new Cliente(3, "CXRP$EMAN", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
            new Usuario(4, "CXRP$EMAN", "012345678", 'C')));
        new OrdemServFactory().alterar(os6);
        
        // Consulta 
        System.out.println("Consulta com filtro:\n" + new OrdemServFactory().consultar(2));
        
        // Exclusão
        new OrdemServFactory().excluir(1);
        
        // Consulta
        List<OrdemServico> lstOS2 = (List<OrdemServico>) new OrdemServFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstOS2.forEach((ordServ) -> {
            System.out.println(ordServ.toString());
        });
    }
}