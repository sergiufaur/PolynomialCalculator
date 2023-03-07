package ro.utcn.Sergiu.operations;
import org.junit.Test;
import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.Arrays;

import static org.junit.Assert.*;
public class DerivativeOperationTest {
    @Test
    public void perform() {
        Polynomial a=new Polynomial(Arrays.asList(new Monomial(2,2),new Monomial(3,1)));

        Polynomial expected=new Polynomial(Arrays.asList(new Monomial(4,1),new Monomial(3,0)));

        UnaryOperation der = new DerivativeOperation();
        Polynomial actual= der.perform(a);

        assertEquals(expected,actual);
    }
}
