package Rush.RushFromOneToTen;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    JRushTwo.Cat cat1 = new JRushTwo.Cat("2", 2, 2, 2);
    JRushTwo.Cat cat2 = new JRushTwo.Cat("3", 3, 3, 3);

    @Test
    public void fight() throws Exception {
        assertTrue("111", cat1.fight(cat2) == false);
        assertTrue("high cat > low cat", cat2.fight(cat1) == true);
    }

}