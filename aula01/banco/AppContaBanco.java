package aula01.banco;

public class AppContaBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        ContaBanco p2 = new ContaBanco();
        
        p1.setNumconta(111);
        p1.setDono("Bruno");
        p1.abrirConta("cc");
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();

        
        p2.setNumconta(222);
        p2.setDono("Maria");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(400);

        

        p1.estadoAtual();
        System.out.println("------------------");
        p2.estadoAtual();
   
    }
}
