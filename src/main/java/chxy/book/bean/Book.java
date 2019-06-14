package chxy.book.bean;

/**
 * @author hs
 * @date 2019/6/14 - 12:00
 */
public class Book {
    private int id;
    private String name;
    private String classroom;
    private String teacher;
    private String maxnumber;

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

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getMaxnumber() {
        return maxnumber;
    }

    public void setMaxnumber(String maxnumber) {
        this.maxnumber = maxnumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", teacher='" + teacher + '\'' +
                ", maxnumber='" + maxnumber + '\'' +
                '}';
    }
}
