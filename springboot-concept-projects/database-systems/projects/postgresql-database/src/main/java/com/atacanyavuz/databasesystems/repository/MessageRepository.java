package com.atacanyavuz.databasesystems.repository;

import com.atacanyavuz.databasesystems.repository.dto.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
