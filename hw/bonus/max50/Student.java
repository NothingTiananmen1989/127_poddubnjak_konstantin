public class Student {
    private String name;
    private int age;
    private String group;
    private float mean_score;
    public Student (String name, int age, String group, float mean_score) {
        this.name=name;
        this.age=age;
        this.group=group;
        this.mean_score=mean_score;
    }
    public void install_name (String name) {
        this.name=name;
    }
    public String return_name() {
        return this.name;
    }

    public void install_age (int age) {
        this.age=age;
    }
    public int return_age() {
        return this.age;
    }

    public void install_mean_score (float mean_score) {
        this.mean_score=mean_score;
    }
    public float return_mean_group() {
        return this.mean_score;
    }

    public void install_group (String group) {
        this.group=group;
    }
    public String return_group() {
        return this.group;
    }
}