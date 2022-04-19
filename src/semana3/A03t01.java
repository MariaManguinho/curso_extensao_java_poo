/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class A03t01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("---------Calcular Tijolos---------");
        
        System.out.print("Digite a altura da parede: ");
        double altura = s.nextDouble();
        System.out.print("Digite a largura da parede: ");
        double largura =s.nextDouble();
        
        double tijolos;
        
        tijolos = (altura * largura) * 20;
        
        System.out.println("Serão necessários " + tijolos +" tijolos.");
        
        //Maria Letícia da Silva Manguinho.
    }
}
