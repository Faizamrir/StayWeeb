package com.example.stayweeb.Anime;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataItem implements Serializable {

	@SerializedName("mal_id")
	private int malId;

	@SerializedName("url")
	private String url;

	@SerializedName("images")
	private Images images;

	@SerializedName("trailer")
	private Trailer trailer;

	@SerializedName("approved")
	private boolean approved;

	@SerializedName("titles")
	private List<TitlesItem> titles;

	@SerializedName("title")
	private String title;

	@SerializedName("title_english")
	private Object titleEnglish;

	@SerializedName("title_japanese")
	private String titleJapanese;

	@SerializedName("title_synonyms")
	private List<String> titleSynonyms;

	@SerializedName("type")
	private String type;

	@SerializedName("source")
	private String source;

	@SerializedName("episodes")
	private int episodes;

	@SerializedName("status")
	private String status;

	@SerializedName("airing")
	private boolean airing;

	@SerializedName("aired")
	private Aired aired;

	@SerializedName("duration")
	private String duration;

	@SerializedName("rating")
	private String rating;

	@SerializedName("score")
	private Object score;

	@SerializedName("scored_by")
	private int scoredBy;

	@SerializedName("rank")
	private int rank;

	@SerializedName("popularity")
	private int popularity;

	@SerializedName("members")
	private int members;

	@SerializedName("favorites")
	private int favorites;

	@SerializedName("synopsis")
	private String synopsis;

	@SerializedName("background")
	private Object background;

	@SerializedName("season")
	private String season;

	@SerializedName("year")
	private int year;

	@SerializedName("broadcast")
	private Broadcast broadcast;

	@SerializedName("producers")
	private List<ProducersItem> producers;

	@SerializedName("licensors")
	private List<Object> licensors;

	@SerializedName("studios")
	private List<StudiosItem> studios;

	@SerializedName("genres")
	private List<GenresItem> genres;

	@SerializedName("explicit_genres")
	private List<Object> explicitGenres;

	@SerializedName("themes")
	private List<ThemesItem> themes;

	@SerializedName("demographics")
	private List<DemographicsItem> demographics;

	public void setMalId(int malId){
		this.malId = malId;
	}

	public int getMalId(){
		return malId;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setImages(Images images){
		this.images = images;
	}

	public Images getImages(){
		return images;
	}

	public void setTrailer(Trailer trailer){
		this.trailer = trailer;
	}

	public Trailer getTrailer(){
		return trailer;
	}

	public void setApproved(boolean approved){
		this.approved = approved;
	}

	public boolean isApproved(){
		return approved;
	}

	public void setTitles(List<TitlesItem> titles){
		this.titles = titles;
	}

	public List<TitlesItem> getTitles(){
		return titles;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTitleEnglish(Object titleEnglish){
		this.titleEnglish = titleEnglish;
	}

	public Object getTitleEnglish(){
		return titleEnglish;
	}

	public void setTitleJapanese(String titleJapanese){
		this.titleJapanese = titleJapanese;
	}

	public String getTitleJapanese(){
		return titleJapanese;
	}

	public void setTitleSynonyms(List<String> titleSynonyms){
		this.titleSynonyms = titleSynonyms;
	}

	public List<String> getTitleSynonyms(){
		return titleSynonyms;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setEpisodes(int episodes){
		this.episodes = episodes;
	}

	public int getEpisodes(){
		return episodes;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setAiring(boolean airing){
		this.airing = airing;
	}

	public boolean isAiring(){
		return airing;
	}

	public void setAired(Aired aired){
		this.aired = aired;
	}

	public Aired getAired(){
		return aired;
	}

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setRating(String rating){
		this.rating = rating;
	}

	public String getRating(){
		return rating;
	}

	public void setScore(Object score){
		this.score = score;
	}

	public Object getScore(){
		return score;
	}

	public void setScoredBy(int scoredBy){
		this.scoredBy = scoredBy;
	}

	public int getScoredBy(){
		return scoredBy;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setPopularity(int popularity){
		this.popularity = popularity;
	}

	public int getPopularity(){
		return popularity;
	}

	public void setMembers(int members){
		this.members = members;
	}

	public int getMembers(){
		return members;
	}

	public void setFavorites(int favorites){
		this.favorites = favorites;
	}

	public int getFavorites(){
		return favorites;
	}

	public void setSynopsis(String synopsis){
		this.synopsis = synopsis;
	}

	public String getSynopsis(){
		return synopsis;
	}

	public void setBackground(Object background){
		this.background = background;
	}

	public Object getBackground(){
		return background;
	}

	public void setSeason(String season){
		this.season = season;
	}

	public String getSeason(){
		return season;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setBroadcast(Broadcast broadcast){
		this.broadcast = broadcast;
	}

	public Broadcast getBroadcast(){
		return broadcast;
	}

	public void setProducers(List<ProducersItem> producers){
		this.producers = producers;
	}

	public List<ProducersItem> getProducers(){
		return producers;
	}

	public void setLicensors(List<Object> licensors){
		this.licensors = licensors;
	}

	public List<Object> getLicensors(){
		return licensors;
	}

	public void setStudios(List<StudiosItem> studios){
		this.studios = studios;
	}

	public List<StudiosItem> getStudios(){
		return studios;
	}

	public void setGenres(List<GenresItem> genres){
		this.genres = genres;
	}

	public List<GenresItem> getGenres(){
		return genres;
	}

	public void setExplicitGenres(List<Object> explicitGenres){
		this.explicitGenres = explicitGenres;
	}

	public List<Object> getExplicitGenres(){
		return explicitGenres;
	}

	public void setThemes(List<ThemesItem> themes){
		this.themes = themes;
	}

	public List<ThemesItem> getThemes(){
		return themes;
	}

	public void setDemographics(List<DemographicsItem> demographics){
		this.demographics = demographics;
	}

	public List<DemographicsItem> getDemographics(){
		return demographics;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"mal_id = '" + malId + '\'' + 
			",url = '" + url + '\'' + 
			",images = '" + images + '\'' + 
			",trailer = '" + trailer + '\'' + 
			",approved = '" + approved + '\'' + 
			",titles = '" + titles + '\'' + 
			",title = '" + title + '\'' + 
			",title_english = '" + titleEnglish + '\'' + 
			",title_japanese = '" + titleJapanese + '\'' + 
			",title_synonyms = '" + titleSynonyms + '\'' + 
			",type = '" + type + '\'' + 
			",source = '" + source + '\'' + 
			",episodes = '" + episodes + '\'' + 
			",status = '" + status + '\'' + 
			",airing = '" + airing + '\'' + 
			",aired = '" + aired + '\'' + 
			",duration = '" + duration + '\'' + 
			",rating = '" + rating + '\'' + 
			",score = '" + score + '\'' + 
			",scored_by = '" + scoredBy + '\'' + 
			",rank = '" + rank + '\'' + 
			",popularity = '" + popularity + '\'' + 
			",members = '" + members + '\'' + 
			",favorites = '" + favorites + '\'' + 
			",synopsis = '" + synopsis + '\'' + 
			",background = '" + background + '\'' + 
			",season = '" + season + '\'' + 
			",year = '" + year + '\'' + 
			",broadcast = '" + broadcast + '\'' + 
			",producers = '" + producers + '\'' + 
			",licensors = '" + licensors + '\'' + 
			",studios = '" + studios + '\'' + 
			",genres = '" + genres + '\'' + 
			",explicit_genres = '" + explicitGenres + '\'' + 
			",themes = '" + themes + '\'' + 
			",demographics = '" + demographics + '\'' + 
			"}";
		}
}