package org.lessons.java.geometria;

/*
 inserire le classi:
una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno costruttore
con parametri. Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono,
rispettivamente, l’area e il perimetro del rettangolo.
 */
public class Rettangolo {

    //1. campi
int base;
int altezza;

    //2. costruttori
    Rettangolo (int base, int altezza){
        this.base=base;
        this.altezza=altezza;
    }

    //3. metodi
    int calcoloArea(){
int areaRettangolo = base * altezza;
return areaRettangolo;
    }

    int calcoloPerimetro (){
        int perimetroRettangolo = (base + altezza) * 2;
        return perimetroRettangolo;
    }

    // BONUS: Aggiungere alla classe Rettangolo un metodo disegna() che
    // stampa in console il rettangolo con le sue dimensioni
void disegna(char marker){
        // stampa orizzontale base volte marker
    for (int i=0; i<base; i++){
        System.out.print(marker);
    }
    //vado a capo
    System.out.println();
    // height volte - 2 stampa 1 marker-spazi-marker
    for (int i=0; i<altezza-2; i++){
        System.out.print(marker);
        for (int j=0; j<base-2;j++){
            System.out.print(" ");
        }
        System.out.print(marker);
    }
    //vado a capo
    System.out.println();
    // stampa orizzontale base volte marker
    for (int i=0; i<base; i++){
        System.out.print(marker);
    }

}

}
