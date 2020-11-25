package pattern.visitor;

/**
 * 抽象访问者，为该对象结构中具体元素角色声明一个访问操作接口
 * @author liupeng
 * @date 2020/11/25
 */
public interface Visitor {

    void visit(Student element);

    void visit(Teacher element);
}
