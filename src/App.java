import java.util.Scanner;

public class App {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    Animal teju = new Animal("Teju", "Reptilia", "Teiidae");
    boolean deveContinuar = true;

    while (deveContinuar) {
      System.out.println("Escolha uma das opções:\n 1 - Comer\n  2 - Correr\n 3 - Dormir\n  4 - Sair");

      byte opcao = sc.nextByte();

      switch (opcao) {
        case 1:
          teju.comer(10);
          break;

        case 2:
          teju.correr();
          break;

        case 3:
          teju.dormir();
          break;

        case 4:
          deveContinuar = false;
          break;

        default:
          System.out.println("Oops, repita o processo");
          break;
      }
    }
  }
}
