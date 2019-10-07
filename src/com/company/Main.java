package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Dados dado1 = new Dados();
        Dados dado2 = new Dados();
        Dados dado3 = new Dados();
        JuegoDeDados juegoDeDados =  new JuegoDeDados();
        Scanner sc = new Scanner(System.in);

        int partidas;
        int seguir=1;

        while(seguir==1){
            System.out.println("Numero de tiradas? ");
            partidas=sc.nextInt();
            for (int i = 0; i < partidas ; i++) {
                dado1.tirarDado();
                juegoDeDados.guardarDado1(dado1.dado);
                dado2.tirarDado();
                juegoDeDados.guardarDado2(dado2.dado);
                dado3.tirarDado();
                juegoDeDados.guardarDado3(dado3.dado);

                juegoDeDados.mostrarTiradas();
                juegoDeDados.compararTirada();
                System.out.println("----------------------------");
            }

            System.out.println("DESEA SEGUIR JUGANDO? 1:si , 2:no");
            seguir=sc.nextInt();
        }
        juegoDeDados.resultadoPartidas();
    }
}