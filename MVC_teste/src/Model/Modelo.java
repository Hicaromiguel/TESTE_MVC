package Model;

public class Modelo {
    public String Nome ="";
    public String Senha= "";
    public String Nome2 = "";
    public String Senha2="";
    public void SetCadastro(){
        if (Nome.equals(Nome2)&&Senha.equals(Senha2)){
            System.out.println("feito!");
        }else{
            System.out.println("ERRO.");
        }
    }
}
