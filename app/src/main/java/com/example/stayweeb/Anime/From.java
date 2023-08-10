package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class From implements Serializable {

	@SerializedName("day")
	private int day;

	@SerializedName("month")
	private int month;

	@SerializedName("year")
	private int year;

	public void setDay(int day){
		this.day = day;
	}

	public int getDay(){
		return day;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getMonth(){
		return month;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	@Override
 	public String toString(){
		return 
			"From{" + 
			"day = '" + day + '\'' + 
			",month = '" + month + '\'' + 
			",year = '" + year + '\'' + 
			"}";
		}
}