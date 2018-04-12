package com.company;

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class SpringApplet extends JApplet {
        public void init()
        {

            Vector2D wektor1 = new Vector2D(10, 20);   //Utworzenie dwóch różnych obiektów klasy Vector2D
            Vector2D wektor2 = new Vector2D(40, 60);    //za pomocą konstruktora z parametrami

            Vector2D suma12 = wektor1.sumawektorow(wektor2);          //Obliczenie sumy i różnicy utworzonych wektorów
            Vector2D roznica12 = wektor1.roznicawetorow(wektor2);

            Vector2D normwektor1 = wektor1.normalizacja();           //Obliczenie wektorów znormalizownych
            Vector2D normwektor2 = wektor2.normalizacja();

            double dlugosc1 = wektor1.dlugoscwektora();            //Obliczenie długości stworzonych wektorów
            double dlugosc2 = wektor2.dlugoscwektora();

            Vector2D stala1 = wektor1.stalawektor(4);        //Obliczenie wektora pomnożonego przez pewną stałą

            System.out.println("\nPARAMETRY WEKTORA 1: ");  //Wyświetlenie na konsoli parametrów stworzonych wektorów oraz
            System.out.println("Współrzędne:");                                                 // pozostałe wyniki
            System.out.println("x = " + wektor1.x + " " + "y = " + wektor1.y);
            System.out.println("Znormalizowany wektor 1");
            System.out.println("Współrzędne:");
            System.out.println("x = " + normwektor1.x + " " + "y = " + normwektor1.y);
            System.out.println("Długość wektora 1 wynosi = " + dlugosc1);


            System.out.println("\nPARAMETRY WEKTORA 2: ");
            System.out.println("Współrzędne:");
            System.out.println("x = " + wektor2.x + " " + "y = " + wektor2.y);
            System.out.println("Znormalizowany wektor 2");
            System.out.println("Współrzędne:");
            System.out.println("x = " + normwektor2.x + " " + "y = " + normwektor2.y);
            System.out.println("Długość wektora 2 wynosi = " + dlugosc2);

            System.out.println("\nSUMA WEKTORÓW (1 i 2): ");
            System.out.println("Współrzędne:");
            System.out.println("x = " + suma12.x + " " + "y = " + suma12.y);

            System.out.println("\nRÓŻNICA WEKTORÓW (1 i 2): ");
            System.out.println("Współrzędne:");
            System.out.println("x = " + roznica12.x + " " + "y = " + roznica12.y);

            System.out.println("\nILOCZYN WEKTORA I STALEJ: ");
            System.out.println("Współrzędne:");
            System.out.println("x = " + stala1.x + " " + "y = " + stala1.y);

            //Ustawienie rozmiarów appletu
            setSize(600,500);
            //Widoczność appletu
            setVisible(true);
    }
    public void paint(Graphics g)
    {

        //USTAWIENIA LINII
        //Tworzenie obiektu graficznego typu Graphics2D ( rozszerza klasę Graphics)
        Graphics2D g2=(Graphics2D)g;
        //Ustawnienie szerokości linii na 3 punkty
        BasicStroke grubaLinia= new BasicStroke(3.0f);
        g2.setStroke(grubaLinia);

        //USTAWIENIA CZCIONKI
        //Nazwa czcionki,tekst pogrubiony,wielkość
        Font czcionka = new Font( "Arial", Font.BOLD, 12 );
        g.setFont ( czcionka );

        //Utworzenie dwóch wektorów
        Vector2D wektor1=new Vector2D(50,60);
        Vector2D wektor2= new Vector2D(30,20);
        //Utorzenie wektora jako sumę utworzonych wektorów
        Vector2D suma12 = wektor1.sumawektorow(wektor2);
        //Utorzenie wektora jako różnice utworzonych wektorów
        Vector2D roznica12 = wektor1.roznicawetorow(wektor2);
        //Utworzenie wektora jako iloczyn wektora 1 i stałej
        Vector2D stala1 = wektor1.stalawektor(4);


        //Utworzenie układu współrzędnych
        g.drawLine(300,50,300,450);//oś y
        g.drawLine(50,250,550,250);//oś x
        g.drawLine(300,50,293,63);  //grot osi y
        g.drawLine(300,50,307,63);
        g.drawLine(550,250,537,257);//grot osi x
        g.drawLine(550,250,537,243);


        g.drawString("LEGENDA:",400,280);

        //WEKTOR 1

        //Określenie punktów końcowych wektora1 w układzie współrzędnych
        int kwektor1x=300+(int)wektor1.x;
        int kwektor1y=250-(int)wektor1.y;
        //Ustawienie grotu w zależności w której ćwirtce mamy wektor
        int zwroty;
        int zwrotx;
        if (kwektor1y >250) {
            zwroty = kwektor1y-10;
        }
        else
        {
            zwroty=kwektor1y+10;
        }
        if(kwektor1x>300)
        {
            zwrotx=kwektor1x-10;
        }
        else
        {
            zwrotx=kwektor1x+10;
        }
        //Zmiana koloru
        g.setColor(Color.blue);
        //Wyświetlenie współrzędnych oraz długość wektora1
        g.drawString("Wektor 1("+(int)wektor1.x+","+(int)wektor1.y+")",400,300);
        g.drawString("Długość wektora 1 = "+Math.round(wektor1.dlugoscwektora()),400,310);
        //Wyświetlenie wektora1 wraz z grotami
        g.drawLine(300,250,kwektor1x,kwektor1y);
        g.drawLine(kwektor1x,kwektor1y,zwrotx,kwektor1y);
        g.drawLine(kwektor1x,kwektor1y,kwektor1x,zwroty);

        //WEKTOR 2
        int kwektor2x=300+(int)wektor2.x;
        int kwektor2y=250-(int)wektor2.y;
        if (kwektor2y >250) {
            zwroty = kwektor2y-10;
        }
        else
        {
            zwroty=kwektor2y+10;
        }
        if(kwektor2x>300)
        {
            zwrotx=kwektor2x-10;
        }
        else
        {
            zwrotx=kwektor2x+10;
        }
        g.setColor(Color.green);
        g.drawString("Wektor 2("+(int)wektor2.x+","+(int)wektor2.y+")",400,325);
        g.drawString("Długość wektora 2 = "+Math.round(wektor2.dlugoscwektora()),400,335);
        g.drawLine(300,250,kwektor2x,kwektor2y);
        g.drawLine(kwektor2x,kwektor2y,zwrotx,kwektor2y);
        g.drawLine(kwektor2x,kwektor2y,kwektor2x,zwroty);

        //SUMA WEKTORÓW
        int ksuma12x=300+(int)suma12.x;
        int ksuma12y=250-(int)suma12.y;
        if (ksuma12y >250) {
            zwroty = ksuma12y-10;
        }
        else
        {
            zwroty=ksuma12y+10;
        }
        if(ksuma12x>300)
        {
            zwrotx=ksuma12x-10;
        }
        else
        {
            zwrotx=ksuma12x+10;
        }
        g.setColor(Color.red);
        g.drawString("Suma wektorów("+(int)suma12.x+","+(int)suma12.y+")",400,350);
        g.drawString("Długość wektora = "+Math.round(suma12.dlugoscwektora()),400,360);
        g.drawLine(300,250,ksuma12x,ksuma12y);
        g.drawLine(ksuma12x,ksuma12y,zwrotx,ksuma12y);
        g.drawLine(ksuma12x,ksuma12y,ksuma12x,zwroty);

        //RÓŻNICA WEKTORÓW
        int kroznica12x=300+(int)roznica12.x;
        int kroznica12y=250-(int)roznica12.y;
        if (kroznica12y >250) {
            zwroty = kroznica12y-10;
        }
        else
        {
            zwroty=kroznica12y+10;
        }
        if(kroznica12x>300)
        {
            zwrotx=kroznica12x-10;
        }
        else
        {
            zwrotx=kroznica12x+10;
        }
        g.setColor(Color.orange);
        g.drawString("Różnica wektorów("+(int)roznica12.x+","+(int)roznica12.y+")",400,375);
        g.drawString("Długość wektora = "+Math.round(roznica12.dlugoscwektora()),400,385);
        g.drawLine(300,250,kroznica12x,kroznica12y);
        g.drawLine(kroznica12x,kroznica12y,zwrotx,kroznica12y);
        g.drawLine(kroznica12x,kroznica12y,kroznica12x,zwroty);


        //Iloczyn wektora 1 i stałej
        int kstala1x=300+(int)stala1.x;
        int kstala1y=250-(int)stala1.y;
        if (kstala1y >250) {
            zwroty = kstala1y-10;
        }
        else
        {
            zwroty=kstala1y+10;
        }
        if(kstala1x>300)
        {
            zwrotx=kstala1x-10;
        }
        else
        {
            zwrotx=kstala1x+10;
        }
        g.setColor(Color.cyan);
        g.drawString("Iloczyn wektora i stałej("+(int)stala1.x+","+(int)stala1.y+")",400,400);
        g.drawString("Długość wektora = "+Math.round(stala1.dlugoscwektora()),400,410);
        g.drawLine(300,250,kstala1x,kstala1y);
        g.drawLine(kstala1x,kstala1y,zwrotx,kstala1y);
        g.drawLine(kstala1x,kstala1y,kstala1x,zwroty);


    }

}
