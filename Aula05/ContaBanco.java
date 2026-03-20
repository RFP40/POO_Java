package Aula05;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private Boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0.0f;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);

        if ("CC".equals(t)) {
            setSaldo(50);
            System.out.println("Conta CC, criada com sucesso!");
        } else if ("CP".equals(t)) {
            setSaldo(120);
            System.out.println("Conta CP, criada com sucesso");
        }
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro.");
        } else if (getSaldo() < 0) {
            System.out.println("Conta em débito.");
        } else {
            setStatus(false);
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(float v) {
        if (getStatus()) {
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Conta fechada.");
        }
    }

    public void sacar(float v) {
        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    public void pagarMensal() {
        float v = 0;

        if ("CC".equals(getTipo())) {
            v = 12;
        } else if ("CP".equals(getTipo())) {
            v = 20;
        }

        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta fechada.");
        }
    }
    public void status() {
        System.out.println("numConta: " + numConta);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: " + saldo);
        System.out.println("Status: " + status);
        System.out.println("Dono: " + dono);
    }

    //SET and GET 

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean st) {
        this.status = st;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono (String d){
        this.dono = d;
    }
}