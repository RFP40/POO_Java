package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco cb = new ContaBanco();
        cb.abrirConta("CP");
        cb.status();
        cb.depositar(300);
        cb.sacar(250);
        cb.pagarMensal();
        cb.setDono("Rafael");
        cb.status();
    }
    
}
