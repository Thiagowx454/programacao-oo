package model;

/**
  Interface que define os métodos públicos obrigatórios para um contato.
 */
public interface Contato {
    /**
     Retorna o nome do contato.
     return O nome do contato.
     */
    String getNome();

    /**
     * Retorna o telefone do contato.
 
     */
    String getTelefone();

    /**
      Retorna o email do contato.
 
     */
    String getEmail();

    /**
     Define o nome do contato.

     */
    void setNome(String nome);

    /**
      Define o telefone do contato.
     
     */
    void setTelefone(String telefone);

    /**
     Define o email do contato.
 
     */
    void setEmail(String email);

    /**
      Retorna uma representação formatada das informações do contato.
     
     */
    String exibirInformacoes();
}
