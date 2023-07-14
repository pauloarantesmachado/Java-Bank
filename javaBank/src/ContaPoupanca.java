
public class ContaPoupanca extends Conta {
  public void extrato(){
    System.out.println("=== Extrato Conta poupança ===");
    super.imprimirDados();
  }
}
