package com.company;

import static java.lang.Math.*;

public class Vector2D //Klasa reprezentująca wektor dwuwymiarowy
{
    public double x;  //Publiczne pola współrzędnych (x,y)
    public double y;

    Vector2D()   //Konstruktor domyślny inicjujący pola klasy zerami
    {
        x=0;
        y=0;
    }

    Vector2D(double wspolrzednax,double wspolrzednay) //Konstruktor z parametrem pozwalający na nadanie dowolnych wartości polom klasy
    {
        x=wspolrzednax;
        y=wspolrzednay;
    }
    public Vector2D sumawektorow(Vector2D wektor)     //Metoda z parametrem podanego jako parametr, zwaracająca nowy obiekt
    {                                                 // klasy Vector2D (suma wektorów)
        Vector2D obiektsuma =new Vector2D(this.x + wektor.x, this.y+wektor.y);
        return obiektsuma;
    }
    public Vector2D roznicawetorow(Vector2D wektor)  //Metoda z parametrem podanego jako parametr, zwaracająca nowy obiekt
    {                                                //klasy Vector2D ( różnica wektorów)
        Vector2D obiektroznica =new Vector2D(this.x-wektor.x,this.y-wektor.y);
        return obiektroznica;
    }
    public Vector2D stalawektor(double stala)   //Metoda z parametrem w postaci stałej przez którą mnożymy wspołrzędne wektora
    {
        Vector2D obiektstala=new Vector2D(this.x *stala,this.y*stala);
        return obiektstala;
    }
    public double dlugoscwektora()            //Metoda bez parametru zwracająca długośc wektora
    {
        return Math.sqrt(this.x *this.x + this.y*this.y);

    }
    public Vector2D normalizacja()     //Metoda bez parametru zwracająca znormalizowany wektor
    {
        double dlugosc =dlugoscwektora();
        Vector2D normwektor=new Vector2D(this.x/dlugosc,this.y/dlugosc);
        return normwektor;
    }
}