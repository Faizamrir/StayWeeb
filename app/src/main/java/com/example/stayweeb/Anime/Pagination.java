package com.example.stayweeb.Anime;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Pagination implements Serializable {

	@SerializedName("last_visible_page")
	private int lastVisiblePage;

	@SerializedName("has_next_page")
	private boolean hasNextPage;

	@SerializedName("current_page")
	private int currentPage;

	@SerializedName("items")
	private Items items;

	public void setLastVisiblePage(int lastVisiblePage){
		this.lastVisiblePage = lastVisiblePage;
	}

	public int getLastVisiblePage(){
		return lastVisiblePage;
	}

	public void setHasNextPage(boolean hasNextPage){
		this.hasNextPage = hasNextPage;
	}

	public boolean isHasNextPage(){
		return hasNextPage;
	}

	public void setCurrentPage(int currentPage){
		this.currentPage = currentPage;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	public void setItems(Items items){
		this.items = items;
	}

	public Items getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"Pagination{" + 
			"last_visible_page = '" + lastVisiblePage + '\'' + 
			",has_next_page = '" + hasNextPage + '\'' + 
			",current_page = '" + currentPage + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}