package sk.it.sovy.Artem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create a new student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent); // fist student - name, second student - the value
        return "student-form";
    }

    /*@RequestMapping(value= "/processFrom")
    public String processForm(@ModelAttribute("student") Student student) {
        // log the input data
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
        return "jsp/view/student-conformation.jsp";
    }*/

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}