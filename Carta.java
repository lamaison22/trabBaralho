/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

/**
 *
 * @author aluno
 */
public class Carta {
    private int numero;
    private String naipe;
    private String nome;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
          if(numero==1){
            this.nome="as";
        }
        if(numero==11){
            this.nome="valete";
        }
         if(numero==12){
            this.nome="dama";
        }
          if(numero==13){
            this.nome="rei";
        }
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    
    
}
