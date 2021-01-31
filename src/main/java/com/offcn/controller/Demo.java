package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller

public class Demo {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","hello");
        return "index";
    }
    @RequestMapping("/indexuser")
    public String indexuser(Model model){
        User zhangsan = new User(1, "张三", 12);
        Map <String,Object>hashMap = new HashMap();
        hashMap.put("img","wallhaven-5wodp1.jpg");
        model.addAttribute("user",zhangsan);
        model.addAttribute("map",hashMap);
        return "index";
    }

    @RequestMapping("/indexuserlist")
    public String indexuserlist(Model model){
        User zs = new User(1, "zs", 14);
        User ls = new User(2, "ls", 14);
        User ww = new User(3, "ww", 14);
        ArrayList<User> users = new ArrayList<>();
        users.add(zs);
        users.add(ls);
        users.add(ww);
        model.addAttribute("list",users);
        return "index2";
    }
    @RequestMapping("/iff")
    public String iff(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index3";
    }

}
