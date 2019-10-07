package com.company;

import java.util.Random;

public class Dados {
    int dado;

    void tirarDado(){
        dado = new Random().nextInt(5)+1;
    }
}