package aula05;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        setTrabalhando(this.trabalhando = !this.trabalhando);//Mudar status de TRABALHANDO
    }

    

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }



    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }



    @Override
    public String toString() {
        return super.toString() +", Setor=" + setor + ", Trabalhando=" + trabalhando + "";
    }

    
    
}
