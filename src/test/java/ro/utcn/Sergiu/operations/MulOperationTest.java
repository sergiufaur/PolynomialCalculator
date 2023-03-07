package ro.utcn.Sergiu.operations;

import org.junit.Test;
import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MulOperationTest {

    @Test
    public void perform() {
        Polynomial a=new Polynomial(Arrays.asList(new Monomial(2,2),new Monomial(2,1)));
        Polynomial b=new Polynomial(Arrays.asList(new Monomial(2,2),new Monomial(3,1)));
        Polynomial expected=new Polynomial(Arrays.asList(new Monomial(6,2),new Monomial(10,3),new Monomial(4,4)));

        BinaryOperation mul = new MulOperation();
        Polynomial actual= mul.perform(a,b);

        assertEquals(expected,actual);
    }
}