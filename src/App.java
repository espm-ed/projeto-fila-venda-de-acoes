import java.util.LinkedList;
import java.util.Queue;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class App {
    static Queue<Acao> carteira = new LinkedList<>();
    public static void main(String[] args) throws Exception {        
        String menu = "1. Comprar\n2. Vender\n3. Finalizar";
        int opcao;

        while(true) {
            opcao = parseInt(showInputDialog(menu));
            switch(opcao) {
                case 1:
                    comprar();
                    break;
                case 2:
                    vender();
                    break;
                default:
                    showMessageDialog(null, "Opção inválida");
            }
        }

    }
    private static void vender() {
        
    }
    private static void comprar() {
        String nome = showInputDialog("Nome da ação");
        int quantidade = parseInt(showInputDialog("Quantidade comprada"));
        double valor = parseDouble(showInputDialog("Valor da ação"));
        carteira.add(new Acao(nome, quantidade, valor));
    }
}
