/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author matte
 */
public class CriticoMetodi 
{
    public static boolean checkCritical(int dado1, int dado2)
    {
        if(dado1 == dado2)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
    
    public static int damage(int dado1, int dado2, int max)
    {
        int damage = 0;
        if(checkCritical(dado1, dado2) == true)
        {
            if (dado1 == max)
            {
                damage = dado1*2*2;
            }
            if (dado1 == 1)
            {
                damage = 0;
            }
        }
        else
        {
            damage = dado1+dado2;
        }
        return damage;
    }
}
