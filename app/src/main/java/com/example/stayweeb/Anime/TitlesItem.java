package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class TitlesItem implements Serializable {

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"TitlesItem{" + 
			"type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}