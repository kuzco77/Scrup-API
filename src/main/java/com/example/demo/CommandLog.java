package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="log")
public class CommandLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String user_agent, content;
    private Date reg_date;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {this.id = id;}

    public String getUser_agent() { return user_agent; }

    public void setUser_agent(String user_agent) { this.user_agent = user_agent; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public Date getReg_date() { return reg_date; }

    public void setReg_date(Date reg_date) { this.reg_date = reg_date; }
}