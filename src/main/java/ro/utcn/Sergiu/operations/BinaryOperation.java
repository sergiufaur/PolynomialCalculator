package ro.utcn.Sergiu.operations;

import ro.utcn.Sergiu.Model.Polynomial;

public interface BinaryOperation {
    Polynomial perform(Polynomial a, Polynomial b);
}
