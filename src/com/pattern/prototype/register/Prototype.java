package pattern.prototype.register;

/**
 * @author liupeng
 * @date 2020/11/23
 */
public interface Prototype {

    Prototype clone();

    String getName();

    void setName(String name);
}
