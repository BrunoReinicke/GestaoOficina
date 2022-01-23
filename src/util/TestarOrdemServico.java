/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.OrdemServFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.bean.OrdemServico;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TestarOrdemServico {
 
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        OrdemServico os = new OrdemServico();
        os.setDtAbertura(formato.parse("17/12/2021"));
        os.setDtEncerramento(formato.parse("18/12/2021"));
        os.setPrazoEntrega(formato.parse("21/12/2021"));
        os.setIdCarro(1);
       // os.setIdCliente(2);
        os.setIdPeca(4);
        os.setPecaTrocada(false);
  //      os.setUsu(new Usuario(2, "dDSF34$", "1234", 'C'));
        os.setNumero(1);
        
        OrdemServFactory osf = new OrdemServFactory();
        osf.salvar(os);
    }
}