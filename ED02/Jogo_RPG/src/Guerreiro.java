/**
  Classe que representa um guerreiro
 */
public class Guerreiro extends Personagem {

    /**
     Construtor do Guerreiro
   
     */
    public Guerreiro(String nome) {
        super(nome, 150, 30);
    }

    /**
     * Defesa especial que reduz o dano pela metade. 
     */
  
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        hp -= danoReduzido;
        System.out.println(nome + " defendeu com escudo! Dano reduzido para " + danoReduzido);
        if (hp < 0) hp = 0;
    }

    /**
      Usa a habilidade Golpe Duplo causando o dobro do ataque
     */

    public void usarHabilidadeEspecial() {
        int dano = ataqueBase * 2;
        System.out.println(nome + " usa Golpe Duplo! Dano: " + dano);
    }
}

