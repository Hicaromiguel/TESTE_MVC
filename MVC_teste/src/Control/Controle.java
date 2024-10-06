package Control;

import View.Viwer;
import Model.Modelo;

public class Controle {
    Modelo mymodelo = new Modelo();
    Viwer c1 = new Viwer();
    public void Entrada(){
        c1.MenuInicial();
        if (c1.escolha==1){
            c1.MenuDeCadastro();
            c1.MenuInicial();
        }
        if (c1.escolha==2){
            c1.MenuDeLogin();
            mymodelo.SetCadastro();
        }
    }
}
