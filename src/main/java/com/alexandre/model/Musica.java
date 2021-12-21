package com.alexandre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "T_MUSICA")
public class Musica {

    @Id
    @Column(length = 38, nullable = false)
    private Long ID_MUSICA;

	@Column(length = 38, nullable = false)
    private int ID_MUSICA_ALBUM;

    @Column(length = 60, nullable = false)
    private String NM_MUSICA;

	@Column(length = 100, nullable = false)
    private String NM_ARTISTA;
	  

    
}
