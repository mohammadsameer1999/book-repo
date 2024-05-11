package com.sameer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tokens")
public class Token {
    @Id
    @GeneratedValue
    private Long id;
    private String token;
    private LocalDate createdAt;
    private LocalDate expiredAt;
    private LocalDate validatedAt;
    @ManyToOne
    @Column(name = "userId",nullable = false)
    private User user;
}
