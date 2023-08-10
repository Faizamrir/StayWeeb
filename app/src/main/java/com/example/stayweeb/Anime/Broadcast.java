package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Broadcast implements Serializable {

	@SerializedName("day")
	private String day;

	@SerializedName("time")
	private String time;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("string")
	private String string;

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setString(String string){
		this.string = string;
	}

	public String getString(){
		return string;
	}

	@Override
 	public String toString(){
		return 
			"Broadcast{" + 
			"day = '" + day + '\'' + 
			",time = '" + time + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",string = '" + string + '\'' + 
			"}";
		}
}