package Package1;
import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.*;

public class gradeBookTest {
    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        gradeBook planilla= new gradeBook();

        planilla.setCourseName(" Matematicas");

        String message = planilla.displayMesage();
        System.out.println(message);
        long flag=0;
        long suma=0;
        int winner=0;
        int loser=0;
        int divisor=0;

        while (flag != -1){
            screen.println("Input de grade or -1 to exit");
            flag=keyboard.nextLong();
            suma = suma + flag;
            divisor=divisor +1;

            if (flag>=6){
                //winner = winner + 1;
            }else{
                loser = loser + 1;
            }
        }
        long prom;
        prom = suma/divisor;
        screen.println("El promedio es: "+prom+"; la ganaron: "+ winner+" estudiantes, y la perdieron: "+ loser+" estudiantes");

        System.out.println("Ingrese una nota");
        planilla.inputGrade();

    }




}
