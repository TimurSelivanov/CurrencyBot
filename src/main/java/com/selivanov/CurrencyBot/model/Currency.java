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

    public Currency() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOfficialRate() {
        return officialRate;
    }

    public void setOfficialRate(Double officialRate) {
        this.officialRate = officialRate;
    }
}
