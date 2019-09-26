package br.edu.iff.teste;

/**
 * Classe para cadastrar Endereços de Entrega.
 * Criada a partir do site da Amazon.
 * @author luizcanf
 */
public class Endereco {

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the nomeCompletoDestinatario
     */
    public String getNomeCompletoDestinatario() {
        return nomeCompletoDestinatario;
    }

    /**
     * @param nomeCompletoDestinatario the nomeCompletoDestinatario to set
     */
    public void setNomeCompletoDestinatario(String nomeCompletoDestinatario) {
        this.nomeCompletoDestinatario = nomeCompletoDestinatario;
    }

    /**
     * @return the cpfDestinatario
     */
    public String getCpfDestinatario() {
        return cpfDestinatario;
    }

    /**
     * @param cpfDestinatario the cpfDestinatario to set
     */
    public void setCpfDestinatario(String cpfDestinatario) {
        this.cpfDestinatario = cpfDestinatario;
    }

    /**
     * @return the telefoneDestinatario
     */
    public String getTelefoneDestinatario() {
        return telefoneDestinatario;
    }

    /**
     * @param telefoneDestinatario the telefoneDestinatario to set
     */
    public void setTelefoneDestinatario(String telefoneDestinatario) {
        this.telefoneDestinatario = telefoneDestinatario;
    }

    /**
     * @return the enderecoLinha1
     */
    public String getEnderecoLinha1() {
        return enderecoLinha1;
    }

    /**
     * @param enderecoLinha1 the enderecoLinha1 to set
     */
    public void setEnderecoLinha1(String enderecoLinha1) {
        this.enderecoLinha1 = enderecoLinha1;
    }

    /**
     * @return the enderecoLinha2
     */
    public String getEnderecoLinha2() {
        return enderecoLinha2;
    }

    /**
     * @param enderecoLinha2 the enderecoLinha2 to set
     */
    public void setEnderecoLinha2(String enderecoLinha2) {
        this.enderecoLinha2 = enderecoLinha2;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    private String pais;
    private String nomeCompletoDestinatario;
    private String cpfDestinatario;
    private String telefoneDestinatario;
    private String enderecoLinha1;
    private String enderecoLinha2;
    private String cidade;
    private String estado;
    private String codigoPostal;
    
}
