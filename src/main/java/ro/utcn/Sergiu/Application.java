package ro.utcn.Sergiu;

import ro.utcn.Sergiu.Model.Monomial;
import ro.utcn.Sergiu.Model.Polynomial;
import ro.utcn.Sergiu.operations.AddOperation;
import ro.utcn.Sergiu.operations.BinaryOperation;
import ro.utcn.Sergiu.ui.UI;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

            UI ui = new UI();
            Controller controller=new Controller(ui);
            ui.show();

       }


    }

