package com.ytc.model;

import java.util.Date;

public class Movie {
    private Integer movieid;

    private String moviename;

    private Double moviescore;

    private String moviedate;

    private Integer movieup;

    private Double movieprice;

   // private Integer movietype;
    private MovieType movieType;

   // private Integer movieaddress;
    private MovieAddress movieAddress;

   // private Integer movieyear;
    private MovieYear movieYear;

    private String movieshow;

   // private Integer moviefile;
    
    private MovieFile movieFile;
    

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename == null ? null : moviename.trim();
    }

    public Double getMoviescore() {
        return moviescore;
    }

    public void setMoviescore(Double moviescore) {
        this.moviescore = moviescore;
    }

    public String getMoviedate() {
        return moviedate;
    }

    public void setMoviedate(String moviedate) {
        this.moviedate = moviedate;
    }

    public Integer getMovieup() {
        return movieup;
    }

    public void setMovieup(Integer movieup) {
        this.movieup = movieup;
    }

    public Double getMovieprice() {
        return movieprice;
    }

    public void setMovieprice(Double movieprice) {
        this.movieprice = movieprice;
    }

	public MovieType getMovieType() {
		return movieType;
	}

	public void setMovieType(MovieType movieType) {
		this.movieType = movieType;
	}

	public MovieAddress getMovieAddress() {
		return movieAddress;
	}

	public void setMovieAddress(MovieAddress movieAddress) {
		this.movieAddress = movieAddress;
	}

	public MovieYear getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(MovieYear movieYear) {
		this.movieYear = movieYear;
	}

	public String getMovieshow() {
		return movieshow;
	}

	public void setMovieshow(String movieshow) {
		this.movieshow = movieshow;
	}

	public MovieFile getMovieFile() {
		return movieFile;
	}

	public void setMovieFile(MovieFile movieFile) {
		this.movieFile = movieFile;
	}

    
   
}