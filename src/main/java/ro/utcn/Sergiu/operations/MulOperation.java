package ro.utcn.Sergiu.operations;

import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.*;

public class MulOperation implements BinaryOperation {
    @Override
    public Polynomial perform(Polynomial a, Polynomial b) {
        Map<Integer, Float> acc = new HashMap<>();
        List<Monomial> monomials = new ArrayList<>();
        for (Monomial monomialA:a.getMonomials()
             ) {
            for (Monomial monomialB:b.getMonomials()
                 ) {
                if(acc.containsKey(monomialA.getExp()+monomialB.getExp()))
                {
                    acc.put(monomialA.getExp()+monomialB.getExp(), acc.get(monomialA.getExp()+monomialB.getExp()) + (monomialA.getCoefficient()*monomialB.getCoefficient()));
                }
                else
                    acc.put(monomialA.getExp()+monomialB.getExp(),monomialA.getCoefficient()*monomialB.getCoefficient());
            }
        }
        acc.forEach((exp,coefficient)->{
            monomials.add(new Monomial(coefficient,exp));
        });
        Collections.sort(monomials);
        return new Polynomial(monomials);
    }



}
