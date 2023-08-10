package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Images implements Serializable {

	@SerializedName("jpg")
	private Jpg jpg;

	@SerializedName("webp")
	private Webp webp;

	public Jpg getJpg() {
		return jpg;
	}

	public void setJpg(Jpg jpg) {
		this.jpg = jpg;
	}

	@Override
 	public String toString(){
		return 
			"Images{" + 
			"jpg = '" + jpg + '\'' +
			",webp = '" + webp + '\'' +
			"}";
		}
}