import javax.swing.*;
public class Principal {
    public static void main(String[]args){
        Caixa cx1 = new Caixa(); //Instanciação do objeto cx1
        int op; //declaração da variável de opções 
        do { //Início do looping do-while
            
            //Apresentação e leitura do menu opções
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Entrada " + "\n2 - Retirada \n3 - Consultar saldo \n0 - Sair "));
            
            switch (op){
                case 1: 
                    cx1.entrar(); //chamada ao método entrar do objeto cx1
                    break;
                case 2:
                    cx1.retirar(); //chamada ao método retirar do objeto cx1
                    break;
                case 3:
                    //apresentação do conteúdo do atributo saldo
                    JOptionPane.showMessageDialog(null, "Saldo atual: " + cx1.getSaldo());
                    break;
                case 0:
                 JOptionPane.showMessageDialog(null, "Finalizando programa!");
                 break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }   
            
        }while(op !=0); //repetirá as operações enquanto a opção for diferente de zero
    }

}
