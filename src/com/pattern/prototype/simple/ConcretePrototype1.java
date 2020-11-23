package pattern.prototype.simple;

/**
 * @author liupeng
 * @date 2020/11/23
 */
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1(this.getId());
        return prototype;
    }
}
