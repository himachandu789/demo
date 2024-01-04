package com.heloloworld.demo.repo;

import com.heloloworld.demo.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Integer> {
}
