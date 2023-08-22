package demo;


import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // ApplicationContext context =
        //         new ClassPathXmlApplicationContext( "spring.xml");

        ApplicationContext context = 
                new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor =  context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("nivel-medio");

        System.out.println(doctor.toString());
        
        //2
        Doctor doctor1 =  context.getBean(Doctor.class);
        System.out.println(doctor.toString());



    }
}