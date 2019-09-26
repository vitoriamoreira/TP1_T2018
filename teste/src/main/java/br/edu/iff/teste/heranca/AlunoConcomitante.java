package br.edu.iff.teste.heranca;

/**
 *
 * @author luizcanf
 */
public class AlunoConcomitante extends Aluno {
    
    long matriculaEM;
    String escolaEM;
    boolean apresentouCertificadoEM;
    boolean concluiudisciplinas;
    
    public boolean podeSolicitarDiploma() {
        if (apresentouCertificadoEM) {
            if (concluiudisciplinas) {
            return true;
        } else {
            return false;
        }
    }
    
