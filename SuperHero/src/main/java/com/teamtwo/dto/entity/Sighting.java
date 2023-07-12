package com.teamtwo.dto.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sighting {

	private int sightingId;
	private int heroId;
	private int locationId;
	private Timestamp locationDate;
}
