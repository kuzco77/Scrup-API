package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CommandLogRepository extends CrudRepository<CommandLog, Integer> {
    CommandLog findCommandLogById(Integer id);
}
