package pattern.prototype.simple;

/**
 * @author liupeng
 * @date 2020/11/23
 */
public class SimpleDemo {

    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype1("prototype1");
        Prototype clone1 = prototype1.clone();
        Prototype clone2 = prototype1.clone();
        System.out.println(prototype1.getId() + ": " +prototype1);
        System.out.println(clone1);
        System.out.println(clone2);

        System.out.println("----------------------------------------");
        Prototype prototype2 = new ConcretePrototype2("prototype2");
        Prototype clone3 = prototype2.clone();
        Prototype clone4 = prototype2.clone();
        System.out.println(prototype2.getId() + ": " + prototype2);
        System.out.println(clone3);
        System.out.println(clone4);
    }
}
