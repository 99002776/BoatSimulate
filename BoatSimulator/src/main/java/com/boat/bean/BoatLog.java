package com.boat.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoatLog {
	private String hid;
	private String name;
	private String model;
	private Integer noOfEngines;

}
