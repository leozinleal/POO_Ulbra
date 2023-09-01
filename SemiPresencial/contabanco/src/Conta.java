abstract class Conta {
    float saldo;
    void depositar( float valordeposito){
        saldo += valordeposito;
        System.out.println("Seu deposito no valor de " +valordeposito+ " foi efetuado com sucesso");
    }

    void sacar(float valorsaque){
        if(valorsaque>saldo){
            System.out.println("Valor saque maior que o saldo");
        }
        else{
            saldo -= valorsaque;
            System.out.println("Saque no valor de: " + valorsaque + " efetuado com sucesso");
        }
    }

    void transferir(float valordeposito, Conta destino){
        destino.saldo += valordeposito;
        saldo -= valordeposito;
    }

    void ConsultarSaldo(){
        System.out.println("Seu saldo atual é de: " + saldo);
    };
}
