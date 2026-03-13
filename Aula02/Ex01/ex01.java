package Aula02.Ex01;

public class ex01 {

    public static void main(String[] args) {
        Caneca c1 = new Caneca();
            c1.cor = "Preta";
            c1.alca = true;
            c1.cheia = false;
            c1.status();  

        Estojo e1 = new Estojo();
            e1.cor = "Azul";
            e1.qtd_itens = 10;
            e1.ziper = true;
            e1.status();
    }

}