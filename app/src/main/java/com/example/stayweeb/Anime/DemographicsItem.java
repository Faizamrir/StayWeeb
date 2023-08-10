package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DemographicsItem implements Serializable {

	@SerializedName("mal_id")
	private int malId;

	@SerializedName("type")
	private String type;

	@SerializedName("name")
	private String name;

	@SerializedName("url")
	private String url;

	public void setMalId(int malId){
		this.malId = malId;
	}

	public int getMalId(){
		return malId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"DemographicsItem{" + 
			"mal_id = '" + malId + '\'' + 
			",type = '" + type + '\'' + 
			",name = '" + name + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}