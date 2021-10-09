package club.susa.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: jenkinsdemo
 * @description:
 * @author: susa
 * @create: 2021-10-09 11:26
 */
@RestController
@RequestMapping("/jenkins")
public class jenkinsDemocontroller {

    @GetMapping("/hello")
    public String jenkinsHello(){
        return "第1次提交" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
