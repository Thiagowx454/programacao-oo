package model;

/**
 * Classe abstrata que contém os atributos comuns a todos os tipos de contatos
  e implementa a interface Contato
 */
public abstract class ContatoBase implements Contato {
    private String nome;
    private String telefone;
    private String email;

    /**
     * Construtor da classe ContatoBase.
  
     */
    public ContatoBase(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
      metodo abstrato para exibir informações específicas de cada tipo de contato.
  
     */
    public abstract String exibirInformacoes();
}
