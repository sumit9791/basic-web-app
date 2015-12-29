package org.java.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by CygnusX on 26-Dec-15.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        System.out.println("hello");
        return "home";

    }
    @RequestMapping(value = "/admin/private", method = RequestMethod.GET)
public String privatePage(){

    return "private";
}

}
