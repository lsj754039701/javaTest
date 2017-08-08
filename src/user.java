/**
 * Created by lsj on 17/8/1.
 */
public class user {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public user(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public user(){
        id = 10;
        name = "zll, ";
        age = 22;
        num = 1000;
    }

    private int id;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int age;
    private int num;
}
