package com.qingguatang.java5minute.course7;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MusicControl {

    private static final Map<String,String> music = new HashMap<>();

    @RequestMapping(value = "/song/music")
    @ResponseBody
    public String getMusicSrc(String songId){return music.get(songId);}


    @PostConstruct
    public void init(){

        music.put("35847388","http://m10.music.126.net/20180616013236/76bb2184a54648f7696b2b17bf5be088/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");

    }

            }
