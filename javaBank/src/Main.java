public class Main {
  public static void main(String [] args){
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    ContaCorrente contaCorrente = new ContaCorrente();

    Cliente pessoa = new Cliente("Clebinho", "000000000");
    System.out.println(pessoa.getNome());
    
  }
}
