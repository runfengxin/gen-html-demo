package com.example.genhtmldemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("test")
    public Object test() {
        Map<String,Object> map = new HashMap<>(16);
        List<Poem> list = new ArrayList<>();
        list.add(new Poem("赵客缦胡缨，", "吴钩霜雪明。"));
        list.add(new Poem("银鞍照白马，", "飒沓如流星。"));
        list.add(new Poem("十步杀一人，", "千里不留行。"));
        list.add(new Poem("事了拂衣去，", "深藏身与名。"));
        map.put("author","李白");
        map.put("poem",list);
        FreeMarkerUtil.createHtml("slowQueryTemplate.ftl","poem.html","侠客行/","侠客行/",map);
        return "ok";
    }
}
