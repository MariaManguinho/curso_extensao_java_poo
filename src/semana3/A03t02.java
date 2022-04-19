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
public class A03t02 {
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog("Digite a altura da parede: ");
        float altura = Float.parseFloat(valor1); 
        String valor2 = JOptionPane.showInputDialog("Digite a largura da parede: ");
        float largura = Float.parseFloat(valor2); 
        
        double tijolos;
        
        tijolos = (altura * largura) * 20;
        
        JOptionPane.showMessageDialog(null,"Serão necessários " + tijolos +" tijolos.", "Maria Letícia", 1);
        
        //Maria Letícia da Silva Manguinho.
    }
}
