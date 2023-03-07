

package ro.utcn.Sergiu.operations;
import org.junit.Test;
import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.Arrays;

import static org.junit.Assert.*;
public class IntegrationOperationTest {
    @Test
    public void perform() {
        Polynomial a=new Polynomial(Arrays.asList(new Monomial(2,2),new Monomial(3,1)));

        Polynomial expected=new Polynomial(Arrays.asList(new Monomial(2/3F,3),new Monomial(3/2F,2)));

        UnaryOperation in = new IntegrationOperation();
        Polynomial actual= in.perform(a);

        assertEquals(expected,actual);
    }
}
