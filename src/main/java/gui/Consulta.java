
package gui;

import javax.swing.JOptionPane;


public class Consulta {
    
    public void mostraJogadores(Jogadores j){
        
        JOptionPane.showMessageDialog(null,"Cadastro Concluído!","SUCESSO",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Nome: "+ j.getNome() + "\nCpf: " + j.getCpf(),"DADOS PRINCIPAIS", JOptionPane.PLAIN_MESSAGE);
    }
    
}
