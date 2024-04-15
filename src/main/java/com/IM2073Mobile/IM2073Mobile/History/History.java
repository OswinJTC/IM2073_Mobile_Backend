package com.IM2073Mobile.IM2073Mobile.History;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "History")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Q_id")
    private int questionId;

    @Column(name = "CountA")
    private int countA;

    @Column(name = "CountB")
    private int countB;

    @Column(name = "CountC")
    private int countC;

    @Column(name = "CountD")
    private int countD;



}