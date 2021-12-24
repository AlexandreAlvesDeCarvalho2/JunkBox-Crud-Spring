package com.alexandre.controller;

import java.util.List;

import com.alexandre.model.Playlist;
import com.alexandre.repository.PlaylistRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class PlaylistaController {
    private final PlaylistRepository playlistRepository;
    @GetMapping("api/Playlist")
    public List<Playlist> getAllPlaylist(){
        return playlistRepository.findAll();
                
    }

    @PostMapping("/api/Playlist")
    public Playlist savePlaylist(@RequestBody Playlist playlist) {
        return playlistRepository.save(playlist);    
    }


}
