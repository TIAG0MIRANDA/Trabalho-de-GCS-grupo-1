import java.util.ArrayList;
import java.util.Scanner;

public class Proposta {
    private Scanner sc = new Scanner(System.in);
    private Userdata usuarios = new Userdata(); // usuários serão guardados aqui
    private User usuarioAtual = null; // usuário logado no sistema
    private int totalDeclinadas = 0, totalAceitas = 0;

    public void detalharProposta() {
        ArrayList<Trade> propostas = usuarioAtual.getTrocasRecebidas();
        for (int i = 0; i < propostas.size(); i++) {
            System.out.println(i + ". " + propostas.get(i).getSender().getNome());
        }

        if (!propostas.isEmpty()) {
            System.out.println("=== Escolha uma proposta: ===");
            while (true) {
                System.out.println("Digite o número da proposta escolhida: ");
                int number = sc.nextInt();
                if (number < propostas.size() && number >= 0) {
                    Trade propEscolhida = propostas.get(number);
                    System.out.println("Proposta escolhida: ");
                    propEscolhida.verProposta();
                    System.out.println();
                    System.out.println("=== Você aceita a proposta? ===");
                    System.out.println("[1] Sim");
                    System.out.println("[2] Não");
                    number = sc.nextInt();
                    if (number == 1) {
                        propEscolhida.trocar();
                        totalAceitas++;
                    } else if (number == 2) {
                        propEscolhida.declinar();
                        totalDeclinadas++;
                    } else {
                        System.out.println("Número inválido, tente novamente!");
                        continue;
                    }
                    break;
                }
            }
        } else {
            System.out.println("Você não recebeu nenhuma proposta!");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        // Aqui você pode chamar app.detalharProposta() após fazer o login ou
        // configuração necessária.
    }

}