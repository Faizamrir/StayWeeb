package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Items implements Serializable {

	@SerializedName("count")
	private int count;

	@SerializedName("total")
	private int total;

	@SerializedName("per_page")
	private int perPage;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setPerPage(int perPage){
		this.perPage = perPage;
	}

	public int getPerPage(){
		return perPage;
	}

	@Override
 	public String toString(){
		return 
			"Items{" + 
			"count = '" + count + '\'' + 
			",total = '" + total + '\'' + 
			",per_page = '" + perPage + '\'' + 
			"}";
		}
}