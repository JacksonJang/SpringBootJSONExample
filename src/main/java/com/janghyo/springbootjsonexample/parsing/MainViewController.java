package com.janghyo.springbootjsonexample.parsing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainViewController {

    @GetMapping("/test")
    public void test(@RequestBody HashMap<String, Object> map) {
        List<Map<String, String>> json = (List<Map<String, String>>) map.get("data");
        System.out.println(map);
        System.out.println(json);

        int i = 0;
        for (var item: json) {
            i++;
            System.out.println(item.get("test" + i));
        }
    }

    @GetMapping("/")
    public String index(){
        return "test";
    }
}
