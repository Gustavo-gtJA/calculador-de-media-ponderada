import java.util.Scanner;

public class Media {
    String nome;


    double nota1;
    double nota2;
    double nota3;

    int peso1;
    int peso2;
    int peso3;

    double mediaPonderada;

    public void obterdados(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Indique o nome do aluno ");
        nome = leitor.nextLine();




        System.out.println("solicite a nota 1 do aluno ");
        nota1 = leitor.nextDouble();


        System.out.println("solicite a nota do 2 aluno ");
        nota2 = leitor.nextDouble();

        System.out.println("solicite a nota do 3 aluno ");
        nota3 = leitor.nextDouble();

        System.out.println("Indique o peso da nota 1");
        peso1 = leitor.nextInt();

        System.out.println("Indique o peso da nota 2");
        peso2 = leitor.nextInt();
        System.out.println("Indique o peso da nota 3");
        peso3 = leitor.nextInt();

        exibirResultado();

    }
    public void calcularMedia(){
      mediaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / peso1 + peso2 + peso3;

    }

    public void exibirResultado(){
        calcularMedia();
        System.out.println("---------RESULTADO--------");
        System.out.println("Nome: "+ nome);
        System.out.println("Media: "+ mediaPonderada);
        System.out.println("---------FIM--------");



    }

}
