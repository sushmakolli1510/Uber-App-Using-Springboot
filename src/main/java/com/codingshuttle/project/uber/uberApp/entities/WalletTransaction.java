package com.codingshuttle.project.uber.uberApp.entities;

import com.codingshuttle.project.uber.uberApp.entities.enums.TransactionMethod;
import com.codingshuttle.project.uber.uberApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private TransactionType transactionType;
private TransactionMethod transactionMethod;
@CreationTimestamp
private LocalDateTime timeStamp;
private String TransactionId;
@OneToOne
private Ride ride;
@ManyToOne
    private Wallet wallet;
}
