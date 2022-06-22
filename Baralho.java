/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Baralho extends Carta {

    private Carta[] cartas = new Carta[52];

    int cont = 0;

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public void geraCartas() {
        while (cont != 1) {
            //ouro bastos pau espada
            for (int i = 0; i < 13; i++) {
                Carta carta = new Carta();
                carta.setNumero(i + 1);
                carta.setNaipe("ouro");

                this.cartas[i] = carta;
//                System.out.println("" + cartas[i].getNumero());
//                System.out.println("" + cartas[i].getNaipe());

            }
            for (int i = 0; i < 13; i++) {
                Carta carta = new Carta();
                carta.setNumero(i + 1);
                carta.setNaipe("bastos");

                this.cartas[13 + i] = carta;
//                System.out.println("" + cartas[13 + i].getNumero());
//                System.out.println("" + cartas[13 + i].getNaipe());

            }
            for (int i = 0; i < 13; i++) {
                Carta carta = new Carta();
                carta.setNumero(i + 1);
                carta.setNaipe("paus");

                this.cartas[26 + i] = carta;
//                System.out.println("" + cartas[26 + i].getNumero());
//                System.out.println("" + cartas[26 + i].getNaipe());
//                System.out.printf("%d\n", 26 + i);

            }
            for (int i = 0; i < 13; i++) {
                Carta carta = new Carta();
                carta.setNumero(i + 1);
                carta.setNaipe("copas");

                this.cartas[39 + i] = carta;
//                System.out.println("" + cartas[39 + i].getNumero());
//                System.out.println("" + cartas[39 + i].getNaipe());
//                System.out.printf("%d\n", 39 + i);

            }

            cont++;
        }
 
    }

    public void printaBaralho() {
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i].getNumero() < 11 && cartas[i].getNumero()!=1 ) {
                System.out.println("" + cartas[i].getNumero());
                System.out.println("" + cartas[i].getNaipe());
            } else if(cartas[i].getNumero() > 11|| cartas[i].getNumero()==1){
                System.out.println("" + cartas[i].getNome());
                System.out.println("" + cartas[i].getNumero());

                System.out.println("" + cartas[i].getNaipe());
            }

        }
    }

    public void embaralhar(int n) {

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            
            int r = i + rand.nextInt(52 - i);
            Carta temp = new Carta();

           
            temp = cartas[r];
            cartas[r] = cartas[i];
            cartas[i] = temp;

        }
    }

}
