package sk.it.sovy.Artem;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) { // pre-process every string from data - remove white spaces - if string has only white spaces - trim it to null
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true); // StringTrimmerEditor - defined in spring API
        // - removes whitespaces - leading and trailing
        // - true - if it's all whitespace trim it down to null
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor); // register this custom trimmer editor on the data binder
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("customer", new Customer()); // first - name, second - value
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) // tell Spring to validate theCustomer object
    {

        System.out.println("Lastname: |" + theCustomer.getLastName() + " " + "Firstname: |" + theCustomer.getFirstName());
        System.out.println("Binding result: " + theBindingResult);
        System.out.println("\n\n\n\n\n\n");

        if (theBindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
