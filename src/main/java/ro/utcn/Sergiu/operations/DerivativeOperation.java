package ro.utcn.Sergiu.operations;

import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.ArrayList;
import java.util.List;

public class DerivativeOperation implements UnaryOperation{
    @Override
    public Polynomial perform(Polynomial a) {
       List<Monomial> newMonomials = new ArrayList<>();
        for (Monomial monomial:a.getMonomials()
             ) {
            newMonomials.add(deriv(monomial));

        }
       return new Polynomial((newMonomials));
    }
    private Monomial deriv(Monomial a)
    {
        float newCoefficient;
        int newExp;
        if(a.getExp()==0)
        {
            newCoefficient=0;
            newExp=0;
        }
        else {
            newCoefficient=a.getCoefficient()*a.getExp();
            newExp=a.getExp()-1;
        }

        return new Monomial(newCoefficient,newExp);
    }
}
