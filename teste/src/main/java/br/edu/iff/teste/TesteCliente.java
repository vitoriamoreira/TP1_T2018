/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.teste;

import java.util.Iterator;

/**
 *
 * @author samsung
 */
public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        
        cli1.setNome("Cleber Moreira");
        String masc = "Masculino", fem = "Feminino"; 
        cli1.setSexo(masc);
        Endereco end = new Endereco();
        end.setCodigoPostal("27.000-956");
        cli1.setEndResidencial(end);
        cli1.getEndResidencial().setCidade("Quissamã");
        
        System.out.println("Cidade: "+ end.getCidade());
        
        Cliente cli2 = new Cliente();
        cli2.setNome("Joana de Arc");
        cli2.setCpf("123546987");
        cli2.setEmail("vivalarevolucion@arc.fr");
        cli2.setSexo(fem);
        Endereco end2 = new Endereco();
        end2.setCidade("Arc");
        end2.setPais("France");
        end2.setCodigoPostal("12366");
        cli2.setEndResidencial(end2);
        
        /*
        Endereco end2 = new Endereco();
        //end2.pais = "Brasil";
        end2.setPais("Brasil");
        
        cli1.setNome("Zé das Couves");
        cli1.enderecos.add(end2);
        
        Endereco end1 = new Endereco();
        end1.descricao = "comercial";
        end1.rua = "Av. Amilcar Pereira";
        end1.numero = "727";
        cli1.enderecos.add(end1);
        
        int i = 1;
        for (Iterator it = cli1.enderecos.iterator();it.hasNext();) {
            Endereco end = (Endereco) it.next();
            System.out.println("Endereço " + i++ + ":");
            System.out.println(end.descricao);
            System.out.println(end.rua);
            System.out.println(end.numero);
            System.out.println(end.cep);
        }
*/
    }
    
}
