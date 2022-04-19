/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**
 *
 * @author maria
 */
public class A02t03 {
    public static void main(String[] args) {
        
        double resto = Double.parseDouble(args[0]) % Double.parseDouble(args[1]);
	int produto = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
	double media = (Double.parseDouble(args[0]) + Double.parseDouble(args[1])) / 2;
	double potencia = Math.pow(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		
	System.out.println("Resto = "+resto);
	System.out.println("Produto = "+produto);
	System.out.println("Média = "+media);
	System.out.println("Potência = "+potencia);
		
	//Maria Letícia da Silva Manguinho
    }
}
