package in.vishal.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/ajax-form-example")
    public String ajaxFormExamplePage() {
        return "ajax-form-example";
    }

    @PostMapping("/calculate-sum")
    @ResponseBody
    public String calculateSum(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 + num2;
        return "Sum: " + sum;
    }
}
