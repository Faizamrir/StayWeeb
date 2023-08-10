package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Trailer implements Serializable {

	@SerializedName("youtube_id")
	private String youtubeId;

	@SerializedName("url")
	private String url;

	@SerializedName("embed_url")
	private String embedUrl;

	@SerializedName("images")
	private Images images;

	public void setYoutubeId(String youtubeId){
		this.youtubeId = youtubeId;
	}

	public String getYoutubeId(){
		return youtubeId;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setEmbedUrl(String embedUrl){
		this.embedUrl = embedUrl;
	}

	public String getEmbedUrl(){
		return embedUrl;
	}

	public void setImages(Images images){
		this.images = images;
	}

	public Images getImages(){
		return images;
	}

	@Override
 	public String toString(){
		return 
			"Trailer{" + 
			"youtube_id = '" + youtubeId + '\'' + 
			",url = '" + url + '\'' + 
			",embed_url = '" + embedUrl + '\'' + 
			",images = '" + images + '\'' + 
			"}";
		}
}