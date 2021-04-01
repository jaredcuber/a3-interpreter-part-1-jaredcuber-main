package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;

public class assignStatement implements Statement {
    private String variableName;
    private String expressionAsString;
    public assignStatement(String variableName, String expressionAsString) {
    this.variableName = variableName;
    this.expressionAsString = expressionAsString;
    }

    @Override
    public void run(ProgramState programState) {

    }
}
