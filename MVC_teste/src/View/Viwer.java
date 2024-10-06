package View;
import Model.Modelo;
import java.util.Scanner;

public class Viwer {

    Modelo mymodelo = new Modelo();
    public Integer escolha;
    public Scanner scan = new Scanner(System.in);

    public void MenuInicial() {
        System.out.println("Bem-vindo(a) à Miketeca");
        System.out.println("[1] Cadastre-se");
        System.out.println("[2] Login");
        System.out.println("[3] Sair");
        this.escolha = scan.nextInt();
        scan.nextLine();
    }

    public void MenuDeCadastro() {
        System.out.println("Qual vai ser seu nome de usuario?");
        this.mymodelo.Nome = scan.nextLine();
        System.out.println("Qual vai ser sua senha?");
        this.mymodelo.Senha = scan.nextLine();
        this.escolha = null;
    }

    public void MenuDeLogin() {
        System.out.println("Qual é seu nome de usuario?");
        this.mymodelo.Nome2 = scan.nextLine();
        System.out.println("Qual é sua senha?");
        this.mymodelo.Senha2 = scan.nextLine();
        this.escolha = null;
    }
}
