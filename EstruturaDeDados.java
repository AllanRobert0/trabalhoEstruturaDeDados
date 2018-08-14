/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaspilhas;

/**
 *
 * @author Owner
 */
public class EstruturaDeDados {
    
    public static void main(String[] args) {
        
        String expressao;
        
        expressao = LE.readString("Digite a Expressao: ");
        
        char vetExpressao[] = expressao.toCharArray();
        
        for (char c : vetExpressao) {
            
            System.out.println(c);
        }
    }
    
}
