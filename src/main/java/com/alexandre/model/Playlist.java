package com.alexandre.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


@Table(name= "T_PLAYLIST")
public class Playlist {

    @Id
    private Long ID_MUSICAS;
    
    @GeneratedValue(generator = "my_gen")
    @SequenceGenerator(name = "my_gen", sequenceName = "my_seq_in_db")
    private int SEQ_MUSICA;

    
}
