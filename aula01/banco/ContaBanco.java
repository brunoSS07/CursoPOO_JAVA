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

// metodo cosntrutor --> é aquele metodo que sempre será executado sempre que uma nova classe for instanciada
public ContaBanco(){
    //sempre que criar uma conta o saldo será inicializado com 0 e status false
    setSaldo(0);
    setStatus(false);
    //saldo = 0;
    //status = false;
}

public int getNumConta() {
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
    setStatus(true); //status muda pra TRUE ao abrir uma conta
    if(tipoConta.equalsIgnoreCase("cc")){
        setSaldo(50); //caso abra uma CC será adicionado R$ 50 no saldo
    } else if(tipoConta.equalsIgnoreCase("cp")){
        setSaldo(150); //caso abra uma CP será adicionado R$ 150 no saldo
    }
    System.out.println("Conta aberta com sucesso!");
} 

public void fecharConta(){
    if(this.getSaldo() > 0){
        System.out.println("Não pode ser fechada! Conta tem dinheiro");
    }else if(this.getSaldo() < 0 ){
        System.out.println("Conta em débito");
    }else{
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso!");
    }
}

public void depositar(double valor){
    if(this.getStatus()){
        this.setSaldo(this.getSaldo() + valor);
        // saldo = saldo + valor;
    }else{
        System.out.println("Impossivel depositar! Conta não existe.");
    }
}

public void sacar(double valor){
    if(this.getStatus()){ // conta tem que ser TRUE = ativa
        if(this.getSaldo() >= valor){ // SALDO tem que ser >= que o VALOR a ser sacado
            this.setSaldo(this.getSaldo() - valor);
            // saldo = saldo - valor;
            System.out.println("Saque feito com sucesso.");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }else{ // caso status esteja FALSE = não existe
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
    if(this.getStatus()){
        if(saldo > valor){ 
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }else{
        System.out.println("Impossivel pagar!");
    }
}
    
public void estadoAtual(){
   // System.out.println("Número da Conta:" + getNumConta());
    //System.out.println("Tipo Conta:" + getTipoConta());
    //System.out.println("Dono:" + getDono());
    //System.out.println("Saldo Conta:" + getSaldo());
    //System.out.println("Status Conta:" + getStatus());


    System.out.printf("Número da Conta: %d \nTipo da Conta: %s\nDono: %s\nSaldo: %.2f\nStatus: %b\n",getNumConta(),getTipoConta(),getDono(),getSaldo(),getStatus());
}


}