/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class A03t03 {
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog("Digite a altura da parede: ");
        float altura = Float.parseFloat(valor1); 
        String valor2 = JOptionPane.showInputDialog("Digite a largura da parede: ");
        float largura = Float.parseFloat(valor2);
        
        if (altura < 3) {
            JOptionPane.showMessageDialog(null, "Essa parede é baixa!", "Maria Letícia", 1);
        }else if(altura >= 3 && altura <= 3.5){
            JOptionPane.showMessageDialog(null, "Essa parede é média!", "Maria Letícia", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Essa parede é alta!", "Maria Letícia", 1);
        }
        
        double metros = altura * largura;
        double tijolos = metros * 20;
        
        JOptionPane.showMessageDialog(null,"Serão necessários " + tijolos +" tijolos.", "Maria Letícia", 1);
        
        //Maria Letícia da Silva Manguinho.
    }
}
