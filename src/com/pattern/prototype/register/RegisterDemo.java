package pattern.prototype.register;

/**
 * @author liupeng
 * @date 2020/11/23
 */
public class RegisterDemo {

    public static void main(String[] args) {
        try {
            // 创建第一个实例
            Prototype p1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("p1", p1);

            Prototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个实例的副本：" + p3);

            // 创建第二个实例
            Prototype p2 = new ConcretePrototype2();
            PrototypeManager.setPrototype("p2", p2);

            Prototype p4 = PrototypeManager.getPrototype("p2").clone();
            p4.setName("李四");
            System.out.println("第二个实例的副本：" + p4);

            // 注销第一个实例
            PrototypeManager.removePrototype("p1");
            // 再次克隆第一个实例的原型
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第一个实例的副本：" + p5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
