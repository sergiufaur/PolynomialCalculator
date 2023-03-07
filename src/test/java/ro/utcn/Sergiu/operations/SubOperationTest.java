package ro.utcn.Sergiu.operations;

import org.junit.Test;
import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.Arrays;

import static org.junit.Assert.*;
public class SubOperationTest {
    @Test
    public void perform() {
        Polynomial a=new Polynomial(Arrays.asList(new Monomial(2,3),new Monomial(3,2)));
        Polynomial b=new Polynomial(Arrays.asList(new Monomial(7,3),new Monomial(2,2),new Monomial(1,1)));
        Polynomial expected=new Polynomial(Arrays.asList(new Monomial(-1,1),new Monomial(1,2),new Monomial(-5,3)));

        BinaryOperation sub = new SubOperation();
        Polynomial actual= sub.perform(a,b);

        assertEquals(expected,actual);
    }
}
