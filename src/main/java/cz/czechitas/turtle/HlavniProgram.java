package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import javax.swing.*;
import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
    }

    public void nakresliCtverec(double velikostStranyA, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStranyA);
            zofka.turnRight(90);
        }
    }

    public void nakresliObdelnik(double velikostStranyB, double velikostStranyC, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyB);
            zofka.turnRight(90);
            zofka.move(velikostStranyC);
            zofka.turnRight(90);
        }
    }

    public void nakresliKolecko(int prumer, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i <72 ; i++) {
        zofka.move(prumer);
        zofka.turnRight(5);
        }
    }

    public void nakresliRovnoramennyPravouhlyTrojuhelnik(double velikostStranyD, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStranyD);
        zofka.turnRight(90);
        zofka.move(velikostStranyD);
        zofka.turnRight(135);
        var velikostPrepony = Math.sqrt(2*Math.pow(velikostStranyD, 2));
        zofka.move(velikostPrepony);
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.

        //nakresliRovnostrannyTrojuhelnik(50, Color.green);
        //nakresliRovnostrannyTrojuhelnik(100, Color.blue);
        //nakresliCtverec(20, Color.yellow);
        //nakresliCtverec(50, Color.lightGray);
        //nakresliObdelnik(60, 20, Color.black);
        //nakresliObdelnik(40, 80, Color.darkGray);
        //nakresliKolecko(3, Color.red);
        //nakresliKolecko(10, Color.orange);
        //nakresliRovnoramennyPravouhlyTrojuhelnik(100, Color.green);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(280);
        zofka.turnLeft(60);
        zofka.penDown();
        nakresliRovnostrannyTrojuhelnik(100, Color.yellow);
        nakresliKolecko(5, Color.yellow);
        zofka.penUp();
        zofka.turnRight(230);

    }
}
