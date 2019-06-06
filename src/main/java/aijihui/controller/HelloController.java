package aijihui.controller;

import aijihui.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by maozhijian on 18/5/8.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "say/{id}",method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id, @RequestParam("ii") Integer ii){




        String s1 = "罩杯："+girlProperties.getCupSize();
        String s2 = "年龄："+girlProperties.getAge();

        System.out.println("ii:"+ii);

        return "index";
    }

}
