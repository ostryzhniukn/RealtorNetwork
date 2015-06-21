package ostryzhniukn.realtorNetwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nazar on 6/10/15.
 */
@Controller
public class MyController {

    @RequestMapping("/myController")
    @ResponseBody
    public String myMethod(){
        return "myController";
    }

    @RequestMapping("myJsp")
    public String myJsp(){
        return "myJsp";
    }
}
