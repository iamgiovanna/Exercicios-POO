import javax.swing.*; //impotação da API swing

public class Caixa {
    //Atributos
    private double saldo;
    
    //Construtores
    //Inicializando o atributo zerado
    public Caixa(){
        this(0);
        }
    //Inicializando o atributo com o parâmetro
    public Caixa(double saldo){
        this.saldo = saldo;
    }
    
    //getter e setter
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
 
    //Métodos específicos da classe

    public void entrar(){

       //Lê um valor, converte de String para double e atribui a variável um valor
       double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entranda: "));

    }
    
    public void retirar(){
        //Lê um valor, converte de String para double e atribui a variável valor
        double valor =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada: "));
        /* Subtrai o conteúdo do atribuito saldo com a variável valor e passa o resultado por parâmetro para 
        o método setSaldo() 
        */
        
      this.setSaldo(this.saldo - valor);
    
    }
}

