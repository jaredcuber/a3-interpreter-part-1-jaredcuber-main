package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;

public class printStatement implements Statement {

    private String expression;
    public printStatement (String e )
    {
        this.expression = e;
    }
    @Override
    public void run(ProgramState programState) {

    }




}


