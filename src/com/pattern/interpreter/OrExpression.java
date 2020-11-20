package pattern.interpreter;

/**
 * @author liupeng
 * @date 2020/11/20
 */
public class OrExpression implements Expression {

    private Expression expression;

    private Expression expression2;

    public OrExpression(Expression expression, Expression expression2) {
        this.expression = expression;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression.interpret(context) || expression2.interpret(context);
    }
}
