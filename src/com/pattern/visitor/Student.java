package pattern.visitor;

/**
 * @author liupeng
 * @date 2020/11/25
 */
public class Student implements Element {

    /**
     * 姓名
     */
    private String name;
    /**
     * 成绩
     */
    private int grade;
    /**
     * 论文数
     */
    private int paperCount;

    public Student(String name, int grade, int paperCount) {
        this.name = name;
        this.grade = grade;
        this.paperCount = paperCount;
    }

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }
}
