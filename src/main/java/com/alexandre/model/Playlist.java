package com.alexandre.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_PLAYLIST")
public class Playlist implements Serializable {

    @Id
    @Column(name = "ID_PLAYLIST")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlaylist;

    @Column(name = "MUSICA_PLAYLIST")
    private Long idMusicPlaylist;

}
