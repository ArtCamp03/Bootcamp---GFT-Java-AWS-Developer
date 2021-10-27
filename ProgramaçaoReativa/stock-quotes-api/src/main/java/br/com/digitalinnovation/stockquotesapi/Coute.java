package br.com.digitalinnovation.stockquotesapi;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Coute {
   
        private long id;
        private String symbol;
        private Double openValue;
        private Double closeValue;
        private Date timeTemp;

}
