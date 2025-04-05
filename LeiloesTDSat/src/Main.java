public class Main {
    public static void main(String[] args) {
        // Exibe a tela de cadastro como tela principal do sistema
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVIEW().setVisible(true);
            }
        });
    }
}
