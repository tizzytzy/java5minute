package com.qingguatang.java5minute.course3.model;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongInfoControl {

    @RequestMapping(value = "/songinfo")
    public String index(ModelMap modelMap){


        SongInfo songInfo = new SongInfo();
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(7);
        songInfo.setAlbumImg("http://p1.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg?param=130y130");
        songInfo.setLyrics("Hello, it's me<br/>  你好吗 是我");


        modelMap.addAttribute("song",songInfo);

        return "index";
    }

}
