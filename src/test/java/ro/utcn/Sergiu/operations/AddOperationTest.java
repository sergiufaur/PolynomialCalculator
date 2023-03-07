package ro.utcn.Sergiu.operations;

import org.junit.Test;
import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AddOperationTest {

    @Test
    public void perform() {
        Polynomial a=new Polynomial(Arrays.asList(new Monomial(2,2),new Monomial(2,1)));
        Polynomial b=new Polynomial(Arrays.asList(new Monomial(2,2),new Monomial(3,1)));
        Polynomial expected=new Polynomial(Arrays.asList(new Monomial(5,1),new Monomial(4,2)));

        BinaryOperation add = new AddOperation();
        Polynomial actual= add.perform(a,b);

        assertEquals(expected,actual);
    }
    @Test
    public void add2(){
        Polynomial a=new Polynomial("x");
        Polynomial b=new Polynomial("x");
        Polynomial expected=new Polynomial("2x");

        BinaryOperation add = new AddOperation();
        Polynomial actual= add.perform(a,b);

        assertEquals(expected,actual);



    }
}