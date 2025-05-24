package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //configure my java class so that it is equivalent to a table in my relational database
@Table(name = "tb_game")
public class Game { //object game
    //object attributes	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public Game() {
		
	}
	//A constructor is a special method used in object-oriented programming to initialize the state of an object
	//when it's created. It's called when an object is instantiated using the new keyword. Constructors have the
	//same name as the class they belong to, and they do not have a return type (including void).
	public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
			String shortDescription, String longDescription) { //method arguments
		this.id = id; //"this.id" receives the id that came from the argument
		this.title = title; //"this.title" receives the title that came from the argument
		this.year = year; //"this.year" receives the year that came from the argument
		this.genre = genre; //"this.genre" receives the genre that came from the argument
		this.platforms = platforms; //"this.platforms" receives the platforms that came from the argument
		this.score = score; //"this.score" receives the score that came from the argument
		this.imgUrl = imgUrl; //"this.imgUrl" receives the imgUrl that came from the argument
		this.shortDescription = shortDescription; //"this.shortDescription" receives the shortDescription that came from the argument
		this.longDescription = longDescription; //"this.longDescription" receives the longDescription that came from the argument
	}
	
	//encapsulation
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}	
}
