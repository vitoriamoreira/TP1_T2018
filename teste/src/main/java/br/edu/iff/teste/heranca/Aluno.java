package br.edu.iff.teste.heranca;

import br.edu.iff.teste.Endereco;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author luizcanf
 */
public class Aluno {

    String nome;
    Date dtNascimento;
    long matricula, rendaFamiliar;
    Endereco endResidencial;
    boolean apresentoudocumentos;
    boolean concluiudisciplinas;

    public int idade() {
        Date hoje = new Date();
        int anos = hoje.getYear() - dtNascimento.getYear();
        // falta descobrir se o Aluno já fez aniversário ou não
        if (hoje.getMonth() < dtNascimento.getMonth()) {
            return anos - 1;
        } else if (hoje.getMonth() == dtNascimento.getMonth()) {
            if (hoje.getDay() >= dtNascimento.getDay()) {
                return anos;
            } else {
                return anos - 1;
            }
        } else {
            return anos;
        }

    }

    public boolean podeSolicitarDiploma() {
        if (apresentoudocumentos) {
            if (concluiudisciplinas) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
