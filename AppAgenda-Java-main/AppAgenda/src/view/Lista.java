package view;
import java.util.Scanner;
import model.ListaDAO;

public class Lista {
    public static void main(String[] args) {
        inputLista();
    }

    static Scanner sc = new Scanner(System.in);
    static  ListaDAO listaDAO = new ListaDAO();

    private static void inputLista() {
        System.out.println("------ NOVA LISTA ------");
        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("Inserir algo");
        }else{
            controller.Lista lista = new controller.Lista(nome);
            boolean sucesso = listaDAO.inserirLista(lista);

            if (sucesso) {
                lista.cadastroSucesso();
            } else {
                lista.cadastroErro();
            }
        }
    }

    private static void updateLista() {
        System.out.println("------ ATUALIZAR LISTA ------");
        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        if (nome.isEmpty()) {
            System.out.println("Campo obrigatório");
        }
        else{
            listaDAO.atualizarLista(id, nome);
        }
    }
}