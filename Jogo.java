/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo;

/**
 *
 * @author joao lamaison
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Baralho ba = new Baralho();
        ba.geraCartas();
        ba.printaBaralho();
        ba.embaralhar(52);
        ba.printaBaralho();

    }

}
