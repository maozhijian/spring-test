package aijihui.controller;

import aijihui.repository.GirlRepository;
import aijihui.Girl;
import aijihui.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by maozhijian on 18/5/16.
 */
@RestController
public class GirlsController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private  GirlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> getGirls(){
        return  girlRepository.findAll();
    }


    @PostMapping(value = "/girl",produces = MediaType.APPLICATION_JSON_VALUE)
    public Girl createGirl(@RequestBody String cupSize){
        JacksonJsonParser jacksonJsonParser = new JacksonJsonParser();
        Map<String,Object> map = jacksonJsonParser.parseMap(cupSize);

        Girl girl = new Girl();
        Set<Map.Entry<String,Object>> set= map.entrySet();

        girl.setAge((int)map.get("age"));
        girl.setCupSize(map.get("cupSize").toString());
        return girlRepository.save(girl);
    }


    @GetMapping(value = "/getByAge")
    public List<Girl> getByAge(@RequestParam("age") Integer age){
        return  girlRepository.findByAge(age);
    }

    @PostMapping(value = "insert-two")
    public List<Girl> insertTwo(@RequestBody String string){
        return  girlService.insertTwoGirls();
    }

}
