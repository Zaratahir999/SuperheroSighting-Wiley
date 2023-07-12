package com.teamtwo.dto.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SuperPower {
	
 private int superPowerId;
 private String superPowerName;
 private int heroId;
}
