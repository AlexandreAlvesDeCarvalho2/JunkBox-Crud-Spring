package com.alexandre.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Data
@Table(name = "T_MUSICA")
public class Musica implements Serializable {

    @Id
    @Column(name = "ID_MUSICA", length = 38, nullable = false)

    private Long idMusica;

    @Column(name = "ID_MUSICA_ALBUM", length = 38, nullable = false)
    private int idMusicaAlbum;

    @Column(name = "NM_MUSICA", length = 60, nullable = false)
    private String nmMusica;

    @Column(name = "NM_ARTISTA", length = 100, nullable = false)
    private String nmArtista;

}
