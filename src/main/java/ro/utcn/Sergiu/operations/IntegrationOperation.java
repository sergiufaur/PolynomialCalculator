package ro.utcn.Sergiu.operations;

import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.ArrayList;
import java.util.List;

public class IntegrationOperation implements UnaryOperation{
    @Override
    public Polynomial perform(Polynomial a) {
        List<Monomial> newMonomials = new ArrayList<>();
        for (Monomial monomial:a.getMonomials()
        ) {
            newMonomials.add(integrate(monomial));

        }
        return new Polynomial((newMonomials));
    }

    private Monomial integrate (Monomial a)
    {
        float newCoefficient;
        int newExp;
        newExp=a.getExp()+1;
        newCoefficient=a.getCoefficient()/newExp;
        return new Monomial(newCoefficient,newExp);
    }
}
