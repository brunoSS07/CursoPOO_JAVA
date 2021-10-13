package aula05;

public class AppPessoa {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno("Bruno", 30, "M", 3242354, "TADS");
        Professor p3 = new Professor("Jubileu",45,"M","Matematica",1500);
        Funcionario p4 = new Funcionario("Jose", 55, "M","Metalurgico", true);

        p3.receberAumento(500); //aumenta SALARIO em R$ 500 reais
        p4.mudarTrabalho(); //muda status de trabalhando pra FALSE

        System.out.println(p2); //vai imprimir o metodo toString dessa CLASSE, não precisa chamar o metodo
        System.out.println(p3);
        System.out.println(p4);

    }
}
