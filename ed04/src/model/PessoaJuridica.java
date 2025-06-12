package model;

/**
 * Classe que representa um contato do tipo Pessoa Jurídica.
 */
public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    /**
      Construtor da classe PessoaJuridica.
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }

    /**
     Retorna o CNPJ da pessoa jurídica

     */
    public String getCnpj() {
        return cnpj;
    }

    /**
      Define o CNPJ da pessoa jurídica.

     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String exibirInformacoes() {
        return String.format("| %-20s | %-15s | %-25s | CNPJ: %-17s |", getNome(), getTelefone(), getEmail(), cnpj);
    }
}
