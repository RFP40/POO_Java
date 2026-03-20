package Aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco cb = new ContaBanco();
        cb.abrirConta("CP");
        cb.depositar(12);
        cb.sacar(132);
        cb.pagarMensal();
        cb.setDono("Rafael");
        cb.fecharConta();
        cb.status();

        ContaBanco cb2 = new ContaBanco();
        cb2.abrirConta("CC");
        cb2.setDono("Douglas");
        cb2.setNumConta(002);
        cb2.depositar(6000);
        cb2.pagarMensal();
        cb2.sacar(700);
        cb2.depositar(90000);
        cb2.sacar(90000);
        cb2.sacar(5338);
        cb2.status();
        cb2.fecharConta();
    }
}