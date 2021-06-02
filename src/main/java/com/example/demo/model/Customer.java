package com.example.demo.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer extends CommonProperties {
  private String firstName;
  private String lastName;
}