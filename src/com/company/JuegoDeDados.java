package com.company;

public class JuegoDeDados {

    int numeroDados[] = new int[3];
    int ganadas;
    int perdidas;

    public void guardarDado1( int dado) {
        numeroDados[0] = dado;
    }
    public void guardarDado2( int dado) {
        numeroDados[1] = dado;
    }
    public void guardarDado3( int dado) {
        numeroDados[2] = dado;
    }

    public void mostrarTiradas() {
        for (int i = 0; i < 3; i++) {
            System.out.print(numeroDados[i]+" ");
        }
        System.out.println();
    }
    public void compararTirada(){
        if(numeroDados[0]==numeroDados[1] && numeroDados[0]==numeroDados[2] && numeroDados[1]==numeroDados[2]){
            System.out.println("HAS GANADO");
            ganadas++;
            System.out.println("Partidas ganadas: "+ganadas);
        }else{
            System.out.println("Has perdido");
            perdidas++;
        }
    }
    public void resultadoPartidas(){
        System.out.println("Partidas ganadas: "+ganadas);
        System.out.println("Partidas perdidas: "+perdidas);
    }
}