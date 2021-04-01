package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.statement.Statement;

public class ConstantExpression implements Statement {
    private int value;
    public ConstantExpression(int value) {
        this.value = value;
    }

    @Override
    public void run(ProgramState programState) {

    }

}
