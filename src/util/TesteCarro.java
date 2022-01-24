/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.CarroFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Carro;
import modelo.bean.Cliente;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TesteCarro {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        Carro car = new Carro();
        car.setNome("Palio");
        car.setAno(1998);
        car.setDono(new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
            new Usuario(3, "bruno", "12345", 'C')));
        car.setPlaca("SUL-XLLY");
        car.setCidade("Blumenau");
        car.setUf("SC");
        car.setPais("Brasil");
        car.setMarca("Fiat");
        new CarroFactory().salvar(car);
        
        // Consulta
        System.out.println("Consulta com filtro:\n" + new CarroFactory().consultar(1).toString());
         
        // Alteração
        Carro car2 = new Carro();
        car2.setId(1);
        car2.setNome("C4");
        car2.setAno(2008);
        car2.setDono(new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
            new Usuario(3, "bruno", "12345", 'C')));
        car2.setPlaca("$UL-X11Y");
        car2.setCidade("Joinville");
        car2.setUf("SC");
        car2.setPais("Brasil");
        car2.setMarca("Citroen");
        new CarroFactory().alterar(car2);
        
        // Consulta
        System.out.println("Consulta com filtro:\n" + new CarroFactory().consultar(1).toString());
       
        // Exclusão
        new CarroFactory().excluir(1);
        
        // Consulta
        List<Carro> lstCarro = (List<Carro>) new CarroFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstCarro.forEach((carro) -> {
            System.out.println(carro.toString());
        });
        
        // Cadastro
        Carro car3 = new Carro();
        car3.setNome("Palio");
        car3.setAno(1998);
        car3.setDono(new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
            new Usuario(3, "bruno", "12345", 'C')));
        car3.setPlaca("SUL-XLLY");
        car3.setCidade("Blumenau");
        car3.setUf("SC");
        car3.setPais("Brasil");
        car3.setMarca("Fiat");
        new CarroFactory().salvar(car3);
    }
}