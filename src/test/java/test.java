import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void TestV()throws Exception{
        Validator v = new Validator();
        String s1 = "(){}[]([]){({})}";
        boolean actual1 = v.validate(s1);
        boolean expected1 = true;
        Assert.assertEquals(expected1, actual1);
        String s2 = "([)]";
        boolean actual2 = v.validate(s2);
        boolean expected2 = false;
        Assert.assertEquals(expected2, actual2);

    }
}


