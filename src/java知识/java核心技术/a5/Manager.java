package java知识.java核心技术.a5;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/15 19:58
 */
public class Manager extends Employee {
    private double bonus; // 奖金

    /**
     * @param name   the employee's name
     * @param salary salary the salary
     * @param year   year the hire salary
     * @param month  month the hire month
     * @param day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
