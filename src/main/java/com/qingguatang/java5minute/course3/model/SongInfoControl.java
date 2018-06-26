package com.qingguatang.java5minute.course3.model;


import com.qingguatang.java5minute.course4.model.Comment;
import com.qingguatang.java5minute.course5.CommentPostControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SongInfoControl {


    private static Map<String,SongInfo> songInfoMap = new HashMap<>();


    @Autowired
    private CommentPostControl commentPostControl;

    @RequestMapping(value = "/songinfo")
    public String index(String songId,ModelMap modelMap){


        if (songId == null){

            songId = "35847388";

        }

        SongInfo songInfo = songInfoMap.get(songId);
        modelMap.addAttribute("song",songInfo);

        List<Comment> comments = commentPostControl.getComments(songId);
        modelMap.addAttribute("comments",comments);

        return "index";
    }

    @RequestMapping(value = "/songinfo/get")
    @ResponseBody
    public SongInfo get(String songId){

        SongInfo songInfo = songInfoMap.get(songId);

        return songInfo;

    }

    @PostConstruct
    public void init(){

        SongInfo songInfo = new SongInfo();
        songInfo.setId("35847388");
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(7);
        songInfo.setAlbumImg("http://p1.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg?param=130y130");
        songInfo.setLyrics("Hello, it's me<br/>  你好吗 是我");
        songInfoMap.put("35847388",songInfo);

        songInfo = new SongInfo();
        songInfo.setId("16435049");
        songInfo.setName("Someone Like You");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Someone Like You");
        songInfo.setCommentCount(8);
        songInfo.setAlbumImg("http://p1.music.126.net/-g2ieFBmoy7T8crwFaAdxQ==/109951163077007716.jpg?param=130y130");
        songInfo.setLyrics("i heard<br/>  我听说");
        songInfoMap.put("16435049",songInfo);

    }

}
