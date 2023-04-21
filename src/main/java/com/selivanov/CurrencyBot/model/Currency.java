package com.selivanov.CurrencyBot.model;

import lombok.Data;

import java.util.Date;

@Data
public class Currency {
    Integer currencyId;
    Date date;
    String currencyAbbreviation;
    Integer currencyScale;
    String currencyName;
    Double currencyOfficialRate;
}
