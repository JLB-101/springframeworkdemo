package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "singleton") //singleton - prototype
public class Doctor implements Staff {
   
    private Integer nextId = 1;

    private Integer id;

    private String qualification;


    
    public void assist() {
        System.out.println("Doctor is Assisting");
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor [qualification : " + qualification + "]";
    }

    



    
}
