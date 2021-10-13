package aula03.ultraEmojiCombate;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1,Lutador l2 ){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
           this. desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random(); //gerar um objeto do tipo random, numero aleatório
            int vencedor = aleatorio.nextInt(3); //gerar 0, 1, ou 2
            System.out.println("***** RESULTADO DA LUTA ******");
            switch(vencedor){
                case 0:
                System.out.println("Empatou!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;
                case 1:
                System.out.println("Vitoria do " + desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
                case 2:
                System.out.println("Vitoria do " + desafiado.getNome());
                desafiado.perderLuta();
                desafiante.ganharLuta();
                break;
            }
            System.out.println("=========================");
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }


    public Lutador getDasafiado() {
        return desafiado;
    }
    public void setDasafiado(Lutador dasafiado) {
        this.desafiado = dasafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
