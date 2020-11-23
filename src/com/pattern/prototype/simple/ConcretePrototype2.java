package pattern.prototype.simple;

/**
 * @author liupeng
 * @date 2020/11/23
 */
public class ConcretePrototype2 extends Prototype {

    public ConcretePrototype2(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2(this.getId());
        return prototype;
    }
}
