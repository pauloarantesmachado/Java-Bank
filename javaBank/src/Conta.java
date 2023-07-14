
public class Conta {
  protected int agencia;
  protected int numero;
  protected double saldo;
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1000;

  public Conta(){ // construtor 
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
  }

  public int getAgencia(){
    return agencia;
  }

  public double getSaldo(){
    return saldo;
  }

  public int getNumero(){
    return numero;
  }

  
  public void sacar(double valor){

    if (valor > this.saldo){
      System.out.println("Saldo inválido");
    } 
    this.saldo = this.saldo - valor;
    System.out.println("Valor de saque" + valor);
  }
  public void depositar(double valor){
      this.saldo = this.saldo + valor;
      System.out.println("Valor de deposito" + valor);
  }
  public void trasnferir(double valor, Conta contaDestino){
    this.sacar(valor);
    contaDestino.depositar(valor);
    System.out.println("Valor de transfrência" + valor);
  }
  protected void imprimirDados(){
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.println(String.format("Agência: %d", this.agencia));
    System.out.println(String.format("Extrato da Conta é: %.2f", this.saldo));
  }
  
}
