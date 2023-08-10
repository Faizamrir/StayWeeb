package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Aired implements Serializable {

	@SerializedName("from")
	private String from;

	@SerializedName("to")
	private Object to;

	@SerializedName("prop")
	private Prop prop;

	@SerializedName("string")
	private String string;

	public void setFrom(String from){
		this.from = from;
	}

	public String getFrom(){
		return from;
	}

	public void setTo(Object to){
		this.to = to;
	}

	public Object getTo(){
		return to;
	}

	public void setProp(Prop prop){
		this.prop = prop;
	}

	public Prop getProp(){
		return prop;
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
			"Aired{" + 
			"from = '" + from + '\'' + 
			",to = '" + to + '\'' + 
			",prop = '" + prop + '\'' + 
			",string = '" + string + '\'' + 
			"}";
		}
}