package aula04;

public class AppLivro {
    public static void main(String[] args) {
        Pessoa []p = new Pessoa[2];
        Livro []l = new Livro[3];

        p[0] = new Pessoa("Bruno", 30, "M");
        p[1] = new Pessoa("Maria", 40, "F");

        l[0] = new Livro("Aprendendo Java", "José da silva", 100, p[0]);
        l[1] = new Livro("POO para iniciantes", "Guanabara", 150, p[1]);
        l[2] = new Livro("Java avançado", "Jõao pedro", 200, p[0]);

        l[0].abrir();
        l[0].folhear(55);
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println("-------------");
        System.out.println(l[1].detalhes());
    }
}
