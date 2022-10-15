package com.example.genhtmldemo;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

@RestController
@RequestMapping("/freemarker")
public class FreeMarkerController {

    /**
     *   动态展示
     * @param map
     * @return
     * @throws IOException
     * @throws TemplateException
     */
    @GetMapping("/test1")
    public String test1(Map map) throws IOException, TemplateException {
        // 向数据模型放数据
        map.put("name", "程序员");
        Student stu1 = new Student();
        stu1.setName("小明");
        stu1.setAge(18);
        stu1.setNumber(2019180251);
        stu1.setBirthday(new Date());
        Student stu2 = new Student();
        stu2.setName("小红");
        stu2.setNumber(2019180252);
        stu2.setAge(19);
        stu2.setBirthday(new Date());
        List<Student> friends = new ArrayList<>();
        friends.add(stu1);
//        stu2.setFriends(friends);
//        stu2.setBestFriend(stu1);
        List<Student> stus = new ArrayList<>();
        stus.add(stu1);
        stus.add(stu2);
        // 向数据模型放数据
        map.put("stus", stus);
        FreeMarkerUtil.createHtml("slowQueryTemplate1.ftl","poem1.html","侠客行/","侠客行/",map);

        // 准备map数据
//        HashMap<String, Student> stuMap = new HashMap<>();
//        stuMap.put("stu1", stu1);
//        stuMap.put("stu2", stu2);
//        // 向数据模型放数据
//        map.put("stu1", stu1);
//        // 向数据模型放数据
//        map.put("stuMap", stuMap);
        // 返回模板文件名称
        return "student";
    }


}

