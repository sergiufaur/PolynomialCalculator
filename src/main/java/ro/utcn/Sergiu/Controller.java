package ro.utcn.Sergiu;

import ro.utcn.Sergiu.Model.Polynomial;
import ro.utcn.Sergiu.operations.*;
import ro.utcn.Sergiu.ui.UI;

public class Controller {

    public Controller(UI ui){
        ui.addComputeActionListener(e -> {
            BinaryOperation add = new AddOperation();
            Polynomial result = add.perform(new Polynomial(ui.getField1Value()),new Polynomial(ui.getField2Value()));
            ui.setResult(result.toString());

        });
        ui.subComputeActionListener(e ->{
            BinaryOperation sub=new SubOperation();
            Polynomial result = sub.perform(new Polynomial(ui.getField1Value()),new Polynomial(ui.getField2Value()));
            ui.setResult(result.toString());
        });
        ui.mulComputeActionListener(e ->{
            BinaryOperation mul=new MulOperation();
            Polynomial result = mul.perform(new Polynomial(ui.getField1Value()),new Polynomial(ui.getField2Value()));
            ui.setResult(result.toString());
        });
        ui.derivComputeActionListener(e ->{
            UnaryOperation der =new DerivativeOperation();
            Polynomial result = der.perform(new Polynomial(ui.getField1Value()));
            ui.setResult(result.toString());
            ui.setSecondField("");
        });
        ui.intComputeActionListener(e ->{
            UnaryOperation integrate =new IntegrationOperation();
            Polynomial result = integrate.perform(new Polynomial(ui.getField1Value()));
            ui.setResult(result.toString());
            ui.setSecondField("");
        });
    }
}
