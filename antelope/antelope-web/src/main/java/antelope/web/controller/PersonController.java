package antelope.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.antelope.model.PersonInfo;
import com.antelope.service.PersonInfoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-04-30
 */
@RestController
public class PersonController {
    @Reference(url = "dubbo://127.0.0.1:20880")
    public PersonInfoService personInfoService;


    @RequestMapping("/")
    public void Index()
    {
        PersonInfo person=personInfoService.getPersonInfo("");
        System.out.println(personInfoService.getPersonInfo("").getPersonName());
    }
}
