package ua.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

    @Test
    public void test0 () {
        Equation e = new Equation (1, 1, 1);
        Assert.assertEquals(e.rootNumber(), 0); // нема рішення у цього рівняння
    }
    @Test
    public void test1 () {
        Equation e = new Equation (1, 2, 1);
        Assert.assertEquals(e.rootNumber(), 1); // одне рішення у цього рівняння
    }

    @Test
    public void test2 () {
        Equation e = new Equation (1, 5, 6);
        Assert.assertEquals(e.rootNumber(), 2); // два рішення у цього рівняння
    }

    @Test
    public void testLinear () { //для лінійного рівняння
        Equation e = new Equation (0, 1, 1);
        Assert.assertEquals(e.rootNumber(), 1); // рішення у цього рівняння
    }

    @Test
    public void testConstant() { //константа
        Equation e = new Equation (0, 0, 1);
        Assert.assertEquals(e.rootNumber(), 0); // рішення у цього рівняння
    }

    @Test
    public void testZero () { //для 0 = 0
        Equation e = new Equation (0, 0, 0);
        Assert.assertEquals(e.rootNumber(), -1); // n-1 коренів у цього рівняння - безкінечно багато
    }
}
