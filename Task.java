import java.util.Random;
import java.util.Scanner;
import myDamage.Damage;
public class Task {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

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
