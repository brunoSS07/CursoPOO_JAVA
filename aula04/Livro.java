package aula04;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; //leitor vai ser do tipo PESSOA = CLASSE PESSOA

    public String detalhes() {
        return "Livro [aberto=" + aberto + "\n, autor=" + autor + "\n, leitor=" + leitor.getNome()+", Idade: " + leitor.getIdade()+ ", Sexo: "+ leitor.getSexo() + "\n, pagAtual=" + pagAtual+ "\n, titulo=" + titulo + "\n, totalPag=" + totalPag + "]";
    }

    //metodo CONSTRUTOR
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.leitor = leitor;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }
    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void avancarPag() {
       this.setPagAtual(this.pagAtual + 1);  
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void voltarPag() {
        setPagAtual(this.pagAtual - 1);
    }

    @Override
    public void folhear(int p) {
        if(p > getTotalPag()){
            this.setPagAtual(0);
        }else{
            setPagAtual(pagAtual = p);
        }
    }

    
    

    
}
