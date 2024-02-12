package myDamage;

import java.util.logging.Logger;
import myHealth.Health;
public class Damage {
    static Logger log = Logger.getLogger(Damage.class.getName());
    public static int Dam(int x) {
        if (x < 0) {
            log.warning("Damage entered incorrectly");
        }
        assert (x > 0) : "Отрицательный урон: " + x;
        if (x <= 1000) {
            return Health.HP(x);
        }
        else
            return 0;
    }
}