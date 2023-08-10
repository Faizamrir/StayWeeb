package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Prop implements Serializable {

	@SerializedName("from")
	private From from;

	@SerializedName("to")
	private To to;

	public void setFrom(From from){
		this.from = from;
	}

	public From getFrom(){
		return from;
	}

	public void setTo(To to){
		this.to = to;
	}

	public To getTo(){
		return to;
	}

	@Override
 	public String toString(){
		return 
			"Prop{" + 
			"from = '" + from + '\'' + 
			",to = '" + to + '\'' + 
			"}";
		}
}