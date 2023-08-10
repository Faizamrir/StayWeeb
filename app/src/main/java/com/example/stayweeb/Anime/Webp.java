package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Webp implements Serializable {

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("small_image_url")
	private String smallImageUrl;

	@SerializedName("large_image_url")
	private String largeImageUrl;

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setSmallImageUrl(String smallImageUrl){
		this.smallImageUrl = smallImageUrl;
	}

	public String getSmallImageUrl(){
		return smallImageUrl;
	}

	public void setLargeImageUrl(String largeImageUrl){
		this.largeImageUrl = largeImageUrl;
	}

	public String getLargeImageUrl(){
		return largeImageUrl;
	}

	@Override
 	public String toString(){
		return 
			"Webp{" + 
			"image_url = '" + imageUrl + '\'' + 
			",small_image_url = '" + smallImageUrl + '\'' + 
			",large_image_url = '" + largeImageUrl + '\'' + 
			"}";
		}
}