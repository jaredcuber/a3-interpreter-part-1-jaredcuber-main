package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.statement.Statement;

public class ArithmeticExpression implements Statement {
    private String operator;
    private String lhsAsString;
    private String rhsAsString;
    public ArithmeticExpression(String operator, String lhsAsString, String rhsAsString) {
      enum operator{ PLUS("+"), MINUS("-"), MULT("*"), DIV("/"), MOD("%");


          operator(String s) {

          }
      }

    }

    @Override
    public void run(ProgramState programState) {

    }
}
