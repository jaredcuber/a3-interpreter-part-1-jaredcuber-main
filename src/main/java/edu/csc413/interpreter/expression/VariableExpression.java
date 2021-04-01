package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.statement.Statement;

public class VariableExpression implements Statement {
    private String variableName;
    public VariableExpression(String variableName) {
    this.variableName = variableName;
        System.out.println(variableName);
    }

    @Override
    public void run(ProgramState programState) {

    }
}
