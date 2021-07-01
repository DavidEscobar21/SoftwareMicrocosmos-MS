/*
 * Software de Facturación e Inventario desarrollado por el Grupo#1 
 * para la clase de Ingeniería de Software 1. 
 */
package com.classes;

// IMPORTS
import com.screens.Menú;
//import com.screens.Login;

/**
 * @author Ariel Torres
 * @author David Escobar
 * @author Christian Castro
 */

public class Main
{
    
    public static void main(String [] args)
    {
        System.out.println("Hola Mundo");
        
        Menú Ma = new Menú();
        Ma.setVisible(true);    
        
        //Login Lo = new Login();
        //Lo.setVisible(true);
    }    
}
