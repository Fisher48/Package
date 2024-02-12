import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import myDamage.Damage;

public class Task {
    static Logger log = Logger.getLogger(Task.class.getName());
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        log.info("Program started and constructed.");

        System.out.println("Киньте кубик:"); // шанс успешной атаки
        int r = rand.nextInt(10)+1;
        if (r >= 5) {
            System.out.println(r);
            System.out.println("Введите урон:");
            int d = in.nextInt();
            System.out.println("Осталось здоровья: " + Damage.Dam(d));
        }
        else {
            System.out.println("Критическая неудача, кубик равен " + r);
        }
    }
}