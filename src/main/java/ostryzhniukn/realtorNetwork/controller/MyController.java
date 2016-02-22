package ostryzhniukn.realtorNetwork.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/myController")
    @ResponseBody
    public String myMethod(){
        LOGGER.warn("myMethod()");
        return "myController";
    }

    @RequestMapping("myJsp")
    public String myJsp(){
        LOGGER.warn("myJsp");
        return "myJsp";
    }

}
