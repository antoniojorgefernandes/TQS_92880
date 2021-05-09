package lab7.student;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
    
    private String university;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    public Student(){
    }
    
    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public long getId() {
        return this.id;
    }

}
