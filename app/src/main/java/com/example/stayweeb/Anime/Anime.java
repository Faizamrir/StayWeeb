package com.example.stayweeb.Anime;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class Anime implements Serializable {

	@SerializedName("pagination")
	private Pagination pagination;

	@SerializedName("data")
	private List<DataItem> data;

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"Anime{" + 
			"pagination = '" + pagination + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}