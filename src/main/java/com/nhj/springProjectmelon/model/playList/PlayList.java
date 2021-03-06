package com.nhj.springProjectmelon.model.playList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayList {
	private int id;
	private String listName;
	private int userId;
	private int musicId;
}
