package pattern.visitor;

/**
 * @author liupeng
 * @date 2020/11/25
 */
public class VisitorDemo {

    /**
     * 如果教师发表论文数超过8篇或者学生论文超过2篇可以评选科研优秀奖。
     * 如果教师教学反馈分大于等于85分或者学生成绩大于等于90分可以评选成绩优秀奖。
     */
    public static void main(String[] args) {
        Element stu1 = new Student("student Jim", 92, 3);
        Element stu2 = new Student("student Ana", 89, 1);
        Element tea1 = new Teacher("teacher Mike", 83, 10);
        Element tea2 = new Teacher("teacher Lee", 88, 7);

        // 初始化对象结构
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(stu1);
        objectStructure.addElement(stu2);
        objectStructure.addElement(tea1);
        objectStructure.addElement(tea2);

        // 定义具体访问者，选拔成绩优秀者
        Visitor gradeSelection = new GradeSelection();
        // 具体的访问操作，打印输出访问结果
        objectStructure.accept(gradeSelection);

        System.out.println("--------- 结构不变，操作易变 ----------------");

        Visitor researcherVisitor = new ResearcherSelection();
        objectStructure.accept(researcherVisitor);
    }
}
