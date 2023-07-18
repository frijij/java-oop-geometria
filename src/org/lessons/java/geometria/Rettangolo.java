package org.lessons.java.geometria;

/*
 inserire le classi:
una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno costruttore
con parametri. Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono,
rispettivamente, l’area e il perimetro del rettangolo.
 */
public class Rettangolo {

    //1. campi: interi base e altezza
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

}
