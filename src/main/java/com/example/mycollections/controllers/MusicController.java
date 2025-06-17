package com.example.mycollections.controllers;


import com.example.mycollections.models.Music;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class MusicController {


    private final List<Music> music= new ArrayList<>() {{
        add(new Music("Star Wars: Attack of the Clones", "John Williams", 2002, 13));
        add(new Music("Yes, Yes, Yes", "Mnozil Brass", 2015, 14));
        add(new Music("A Bach Festival", "Empire Brass", 1986, 16));
    }};

    @GetMapping("/json")
    public List<Music> getMusicJson() {return music;}

    @GetMapping("/html")
    public String getMusicHtml() {
        String musicList = "<ul>";
        for(Music album : music){
            musicList += "<li>" + album + "</li>";
        }
        musicList += "</ul>";


        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """
                +
                musicList +

                """
                        </ul>
                    </body>
                    """;
    }
}
