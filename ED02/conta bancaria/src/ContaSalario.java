//** conta criando a conta salario do usuario 
//
public class ContaSalario extends Conta {

    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Salário ===");
        super.imprimirExtrato();
    }
}
