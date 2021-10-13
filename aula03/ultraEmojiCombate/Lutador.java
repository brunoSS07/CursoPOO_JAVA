package aula03.ultraEmojiCombate;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private double altura, peso;
    private int vitorias, derrota, empates, idade;
    
    //Método construtor de inicialização
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso); // irei analisar em qual CATEGORIA seu PESO se encaixa
        this.vitorias = vitorias;
        this.derrota = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("=============================================");
       System.out.println(String.format("CHEGOU A HORA! Apresentamos o lutador %s\nDiretamente de(a,o) %s\ncom %d anos\npesando %.02f Kg\nPeso: %.02f\n%d vitorias\n%d derrotas\n%d empates", this.getNome(), this.getNacionalidade(), this.getIdade(), this.getAltura(), this.getPeso(), this.getVitorias(), this.getDerrota(),this.getEmpates()));
    }
    public void status(){
        System.out.println("=============================================");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias()+ " vezes");
        System.out.println("Perdeu " + this.getDerrota() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getDerrota() + 1);
    }


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120 ){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrota() {
        return derrota;
    }
    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

    




