package pattern.prototype.simple;

/**
 * @author liupeng
 * @date 2020/11/23
 */
public abstract class Prototype {

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 克隆自身的方法
     * @return一个从自身克隆出来的对象
     */
    @Override
    public abstract Prototype clone();
}
