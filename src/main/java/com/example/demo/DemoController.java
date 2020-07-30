package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private CommandLogRepository commandLogRepository;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String userAgent, @RequestParam String content) {
        CommandLog commandLog = new CommandLog();
        commandLog.setUser_agent(userAgent);
        commandLog.setContent(content);
        commandLogRepository.save(commandLog);
        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<CommandLog> getCommandLogs() {
        return commandLogRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public CommandLog findCommandLogById(@PathVariable Integer id) {
        return commandLogRepository.findCommandLogById(id);
    }
}
