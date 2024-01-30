package com.example.RegisterLogin.Entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STATUS")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true)
    private Integer id;

    @Column(name = "`KEY`")
    private String key;

    @Column(name = "LABEL")
    private String label;
}
