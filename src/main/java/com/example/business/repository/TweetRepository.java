package com.example.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.business.domain.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {


}
