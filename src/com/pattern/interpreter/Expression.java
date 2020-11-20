package pattern.interpreter;

/**
 * @author liupeng
 * @date 2020/11/20
 */
public interface Expression {

    boolean interpret(String context);
}
