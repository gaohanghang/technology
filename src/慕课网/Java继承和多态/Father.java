package 慕课网.Java继承和多态;

/**
 * @Description 父类
 * @Author Gao Hang Hang
 * @Date 2020-10-02 20:16
 **/
public class Father {

    public Integer refNo;
    public String name;
    public String gender;
    public Integer age;
    public String job;

    public void working() {
        System.out.println(this.name + "在工作中....");
    }

}
