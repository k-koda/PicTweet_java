package com.example.business.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {

  @Id
  @GeneratedValue
  private Long id;
  private String text;

  @ManyToOne
  @JoinColumn(updatable = false)
  private User user;
  @ManyToOne
  @JoinColumn(updatable = false)
  private Tweet tweet;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id){
    this.id = id;
  }

  public String getText() {
    return text;
  }
  public void setText(String text){
    this.text = text;
  }


  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  public Tweet getTweet() {
    return tweet;
  }
  public void setTweet(Tweet tweet) {
    this.tweet = tweet;
  }
}
