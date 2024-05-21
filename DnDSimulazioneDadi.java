/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author matte
 */
public class DnDSimulazioneDadi 
{
    public static void main(String[] args) 
    {
        Scanner tastiera = new Scanner(System.in);
        int dado1, dado2, danno, maxfaccia;
        System.out.printf("Scegli il dado da lanciare\n");
        System.out.printf("Per scegliere il dado digita il valore massimo del dado: ");
        maxfaccia = tastiera.nextInt();
        System.out.printf("Lancia 2 dadi così capiamo quanti danni farai\n");
        Random random = new Random();
        dado1 = random.nextInt(maxfaccia) + 1;
        dado2 = random.nextInt(maxfaccia) + 1;
        danno = CriticoMetodi.damage(dado1, dado2, maxfaccia);
        System.out.printf("Hai inflitto %d danni", danno);
    }
}
