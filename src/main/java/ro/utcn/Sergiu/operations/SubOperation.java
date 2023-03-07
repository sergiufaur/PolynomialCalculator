package ro.utcn.Sergiu.operations;

import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;

import java.util.*;

public class SubOperation implements BinaryOperation{
    @Override
    public Polynomial perform(Polynomial a, Polynomial b) {
        Map<Integer, Float> acc = new HashMap<>();
        minuend(acc,a);
        subtrahend(acc,b);
        List<Monomial> monomials =new ArrayList<>();
        acc.forEach((exp,coefficient)->{
            monomials.add(new Monomial(coefficient,exp));
        });
        Collections.sort(monomials);
        return new Polynomial(monomials);
    }
    private void minuend (Map<Integer ,Float> acc , Polynomial a) {
        for (Monomial monomial : a.getMonomials()) {
            acc.put(monomial.getExp(), monomial.getCoefficient());
        }
    }
    private void subtrahend(Map<Integer ,Float> acc , Polynomial a){
        for (Monomial monomial : a.getMonomials()) {
            if (acc.containsKey(monomial.getExp())) {
                acc.put(monomial.getExp(), acc.get(monomial.getExp()) - monomial.getCoefficient());
            } else {
                acc.put(monomial.getExp(), (-1)*monomial.getCoefficient());
            }
        }
    }

    }
