package com.nhj.springProjectmelon.model.music.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespMelonJoinDto {
	private int id;
	private String title;
	private String singer;
	private String album;
	private String albumDate;
	private String photo;
	private String genre;
	private String lyrics;
	private int songNo;
	private String videoLink;
	private int likesCount;
	private boolean likesStatus;

}
