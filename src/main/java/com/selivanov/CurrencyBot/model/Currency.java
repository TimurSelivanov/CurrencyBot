package com.selivanov.CurrencyBot.model;


import lombok.Data;

import java.util.Date;

@Data
public class Currency {
    Integer id;
    Date date;
    String abbreviation;
    Integer scale;
    String name;
    Double officialRate;
}
