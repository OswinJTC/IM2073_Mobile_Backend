package com.IM2073Mobile.IM2073Mobile.Question;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Question")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Level")
    private String level;

    @Column(name = "Description")
    private String description;

    @Column(name = "Option1")
    private String Option1;

    @Column(name = "Option2")
    private String Option2;

    @Column(name = "Option3")
    private String Option3;

    @Column(name = "Option4")
    private String Option4;

    @Column(name = "Answer")
    private String answer;


}