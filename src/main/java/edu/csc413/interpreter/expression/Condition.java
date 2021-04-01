package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.statement.Statement;

/** A conditional comparison that can evaluate to true or false. */
public abstract class Condition implements Statement {
    private String operator;
    private String lhsAsString;
    private String rhsAsString;

    // TODO: Implement. You can modify the parameters of this constructor.
    public Condition(String operator, String lhsAsString, String rhsAsString) {
        this.operator = operator;
        this.lhsAsString = lhsAsString;
        this.rhsAsString = rhsAsString;
    }
    @Override
    public void run(ProgramState programState) {

    }


    /** Resolves the comparison to true or false based on the lhs and rhs expressions and the operator. */
    public abstract boolean evaluate(ProgramState programState);


}
