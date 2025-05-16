/**
  Classe que representa um personagem em um jogo de RPG.
 */
public abstract class Personagem {
     protected String nome;
     protected int hp;
     protected int ataqueBase;

    /**
      Construtor da classe Personagem
    
     */
    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
      Exibe o status atual do personagem.
     */
    public void status() {
        System.out.println(nome + " - HP: " + hp);
    }

    /**
      Ataca um inimigo, causando dano no ataque base.
     */
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca " + inimigo.nome + " com " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }

    /**
     * Defende um ataque, reduzindo o HP de acordo com o dano recebido
   
     */
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano.");
        if (hp < 0) hp = 0;
    }

    /**
     Usa a habilidade especial unica
     */
    public abstract void usarHabilidadeEspecial();
}
