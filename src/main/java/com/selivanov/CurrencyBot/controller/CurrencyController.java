package com.selivanov.CurrencyBot.controller;

import com.selivanov.CurrencyBot.model.Currency;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CurrencyController {

    public static String getCurrencyRate(String message, Currency currency) throws IOException, ParseException {
        URL url = new URL("https://www.nbrb.by/api/exrates/rates/" + message + "?parammode=2");
        Scanner scanner = new Scanner((InputStream) url.getContent());
        String result = "";
        while (scanner.hasNext()) {
            result += scanner.nextLine();
        }
        JSONObject object = new JSONObject(result);

        currency.setId(object.getInt("Cur_ID"));
        currency.setDate(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(object.getString("Date")));
        currency.setAbbreviation(object.getString("Cur_Abbreviation"));
        currency.setScale(object.getInt("Cur_Scale"));
        currency.setName(object.getString("Cur_Name"));
        currency.setOfficialRate(object.getDouble("Cur_OfficialRate"));


        return "Official rate of BYN to " + currency.getAbbreviation() + "\n" +
                "on the date: " + getFormatDate(currency) + "\n" +
                "is: " + currency.getOfficialRate() + " BYN per " + currency.getScale() + " " + currency.getAbbreviation();

    }

    private static String getFormatDate(Currency currency) {
        return new SimpleDateFormat("dd MMM yyyy").format(currency.getDate());
    }
}
