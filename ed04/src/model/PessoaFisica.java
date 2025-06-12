package model;

/**
  Classe que representa um contato do tipo Pessoa Física.
 */
public class PessoaFisica extends ContatoBase {
    private String cpf;

    /**
      Construtor da classe PessoaFisica.

     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        this.cpf = cpf;
    }

    /**
     * Retorna o CPF da pessoa física.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa física.

     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String exibirInformacoes() {
        return String.format("| %-20s | %-15s | %-25s | CPF: %-14s |", getNome(), getTelefone(), getEmail(), cpf);
    }
}
