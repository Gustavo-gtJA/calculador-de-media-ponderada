import java.util.Scanner;

public class Media {
    String nomeAluno;


    double nota1;
    double nota2;
    double nota3;

    double pesoNota1;
    double pesoNota2;
    double pesoNota3;

    double mediaPonderada;

    public void obterdados(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Indique o nome do aluno ");
        nomeAluno = leitor.nextLine();




        System.out.println("solicite a nota 1 do aluno ");
        nota1 = leitor.nextDouble();


        System.out.println("solicite a nota do 2 aluno ");
        nota2 = leitor.nextDouble();

        System.out.println("solicite a nota do 3 aluno ");
        nota3 = leitor.nextDouble();

        System.out.println("Indique o peso da nota 1");
        pesoNota1 = leitor.nextDouble();

        System.out.println("Indique o peso da nota 2");
        pesoNota2 = leitor.nextDouble();
        System.out.println("Indique o peso da nota 3");
        pesoNota3 = leitor.nextDouble();

        exibirResultado();

    }
    public void calcularMedia(){
     double mediaPesoVersusNota =
              (nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3);
     double somaPesos = pesoNota1 + pesoNota2 + pesoNota3;
      mediaPonderada= mediaPesoVersusNota / somaPesos;

    }

    public void exibirResultado(){
        calcularMedia();
        System.out.println("---------RESULTADO--------");
        System.out.println("Nome: "+ nomeAluno);
        System.out.println("Media: "+ mediaPonderada);
        System.out.println("---------FIM--------");



    }

}
