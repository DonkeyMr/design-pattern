package pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构，是元素的集合，提供元素的访问入口
 * @author liupeng
 * @date 2020/11/25
 */
public class ObjectStructure {

    /**
     * 使用集合保存Element元素，救命没有考虑多线程的问题
     */
    private List<Element> elements = new ArrayList<>();

    /**
     * 访问者访问元素的入口
     */
    public void accept(Visitor visitor) {
        for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            element.accept(visitor);
        }
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }
}
