package org.lessons.java.geometria;

/*
Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da
console, i valori di base e di altezza con cui istanziare un nuovo Rettangolo. Dopo averlo istanziato,
stampate a video il perimetro e l’area.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // chiedo all'utente di inserire i valori base e altezza
        System.out.print("Inserisci il valore della base: ");
        int baseInput = Integer.parseInt(scan.nextLine());
        System.out.print("Inserisci il valore dell'altezza: ");
        int altezzaInput = Integer.parseInt(scan.nextLine());

        // inserisco misure di base e altezza del rettangolo
        Rettangolo rettangolo = new Rettangolo(baseInput, altezzaInput);

        // Stampo a video perimetro ed area
        System.out.println("Il perimetro del rettangolo è " + rettangolo.calcoloPerimetro());
        System.out.println("L'area del rettangolo è " + rettangolo.calcoloArea());

        scan.close();
    }
}
