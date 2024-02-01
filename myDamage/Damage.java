package myDamage;

import myHealth.Health;
public class Damage {
    public static int Dam(int x) {
        if (x <= 1000) {
            return Health.HP(x);
        }
        else
            return 0;
    }
}
