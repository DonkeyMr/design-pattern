package pattern.prototype.register;

/**
 * @author liupeng
 * @date 2020/11/23
 */
public class ConcretePrototype1 implements Prototype {

    private String name;

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
            "name='" + name + '\'' +
            '}';
    }
}
