package pattern.visitor;

/**
 * @author liupeng
 * @date 2020/11/25
 */
public class Teacher implements Element {

    /**
     * 姓名
     */
    private String name;
    /**
     * 评价分数
     */
    private int score;
    /**
     * 论文数
     */
    private int paperCount;


    public Teacher(String name, int score, int paperCount) {
        this.name = name;
        this.score = score;
        this.paperCount = paperCount;
    }

    /**
     * visitor访问本对象的数据结构
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }
}
