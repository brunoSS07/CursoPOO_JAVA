package aula01.banco;

/**
 * ContaBanco
 */
public class ContaBanco {
public int numConta;
protected String tipoConta;
private String dono;
private double saldo;
private boolean status;

// metodo cosntrutor --> é aquele metodo que sempre será executado semrpe que uma nova classe for instanciada
public ContaBanco(){
    //sempre que criar uma conta o saldo será inicializado com 0 e status false
    setSaldo(0);
    setStatus(false);
    //saldo = 0;
    //status = false;
}

public int getNumconta() {
    return numConta;
}
public void setNumconta(int numConta) {
    this.numConta = numConta;
}

public String getTipoConta() {
    return tipoConta;
}
public void setTipoConta(String tipoConta) {
    this.tipoConta = tipoConta;
}

public String getDono() {
    return dono;
}
public void setDono(String dono) {
    this.dono = dono;
}

public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public boolean getStatus() {
    return status;
}

public void setStatus(Boolean status) {
    this.status = status;
}


public void abrirConta(String tipoConta){
    setTipoConta(tipoConta);
    setStatus(true); //status muda pra true ao abrir uma conta
    if(tipoConta.equalsIgnoreCase("cc")){
        setSaldo(50);
    } else if(tipoConta.equalsIgnoreCase("cp")){
        setSaldo(150);
    }
    System.out.println("Conta aberta com sucesso!");
} 

public void fecharConta(){
    if(this.getSaldo() > 0){
        System.out.println("Conta com dinheiro");
    }else if(this.getSaldo() < 0 ){
        System.out.println("Conta em débito");
    }else{
        setStatus(false);
    }
}

public void depositar(double valor){
    if(status == true){
        setSaldo(getSaldo() + valor);
        // saldo = saldo + valor;
    }else{
        System.out.println("Impossivel depositar");
    }
}

public void sacar(double valor){
    if(status == true){
        if(saldo > valor){
            setSaldo(getSaldo() - valor);
            // saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }else{
        System.out.println("Impossivel Sacar");
    }
}

public void pagarMensal(){
    double valor = 0;
    if(tipoConta.equalsIgnoreCase("cc")){
        valor = 12;
    }else if(tipoConta.equalsIgnoreCase("cp")){
        valor = 20;
    }
    if(status == true){
        if(saldo > valor){
            setSaldo(getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }else{
        System.out.println("Impossivel pagar");
    }
}
    
}