package pattern.visitor;

/**
 * 抽象元素角色，定义了一个accept操作，以visitor作为参数
 * @author liupeng
 * @date 2020/11/25
 */
public interface Element {

    /**
     * 接受一个抽象访问者访问
     */
    void accept(Visitor visitor);
}
