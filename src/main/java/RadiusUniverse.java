import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RadiusUniverse {
    static long sizeUniverseInLightYears = 46_000_000_000L; // размер вселенной в световых годах
    static Long speedLight = 300_000L; // скорость света
    static long secondsPerYear = 365 * 24 * 3600; // секунд в году
    public static long radiusUniverse() {
        System.out.println("Присутствыет критический BAG. Так как значение превышают long");
        long radiusUniverseInKm = sizeUniverseInLightYears * speedLight * secondsPerYear; // радиус вселенной в км
        long diametUniverseInKm = radiusUniverseInKm *2;
        long longMaxValioAAAAAA = Long.MAX_VALUE;
        System.out.println("radiusUniverseInKm = " + radiusUniverseInKm);
        System.out.println("diametUniverseInKm = " + diametUniverseInKm);
        System.out.println("longMaxValioAAAAAA = " + longMaxValioAAAAAA);
        System.out.println("Теперь исправим и сравним");
        return radiusUniverseInKm;
    }

    public static BigInteger radiusUniverseBigInteger() {
        BigInteger sizeUniverseInLightYearsBig = new BigInteger("46000000000");
        BigInteger speedLightBig = new BigInteger(speedLight.toString());
        BigInteger radiusUniverseInKmBig = sizeUniverseInLightYearsBig
                .multiply(speedLightBig)
                .multiply(BigInteger.valueOf(secondsPerYear));
        System.out.println("radUniverseInKmBig = " + radiusUniverseInKmBig);
        BigInteger diaUniverseInKmBig = radiusUniverseInKmBig.multiply(BigInteger.valueOf(Long.parseLong("2")));
        System.out.println("diaUniverseInKmBig = " + diaUniverseInKmBig);
        System.out.println("longMaxValioAAAAAA = " + Long.MAX_VALUE);
        return radiusUniverseInKmBig;
    }
    public static void main(String[] args) {
        System.out.println("radiusUniverse() =           " + radiusUniverse());
        System.out.println("radiusUniverseBigInteger() = " + radiusUniverseBigInteger());
        System.out.println("Разница составляект в: " + radiusUniverseBigInteger().divide(BigInteger.valueOf(radiusUniverse())) + " раз");
    }
    @Test
    public void radiusUniverseTest() {
        assertNotEquals(radiusUniverse(), radiusUniverseBigInteger());
        assertNotEquals(radiusUniverseBigInteger().divide(BigInteger.valueOf(radiusUniverse())), radiusUniverseBigInteger());

    }
}
