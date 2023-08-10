package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class To implements Serializable {

	@SerializedName("day")
	private Object day;

	@SerializedName("month")
	private Object month;

	@SerializedName("year")
	private Object year;

	public void setDay(Object day){
		this.day = day;
	}

	public Object getDay(){
		return day;
	}

	public void setMonth(Object month){
		this.month = month;
	}

	public Object getMonth(){
		return month;
	}

	public void setYear(Object year){
		this.year = year;
	}

	public Object getYear(){
		return year;
	}

	@Override
 	public String toString(){
		return 
			"To{" + 
			"day = '" + day + '\'' + 
			",month = '" + month + '\'' + 
			",year = '" + year + '\'' + 
			"}";
		}
}