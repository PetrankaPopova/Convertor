package com.currency.convertor.domain.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

public class ResponseCurrencyModel {

    private Map<String, BigDecimal> rates;

    private String base;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public ResponseCurrencyModel(Map<String, BigDecimal> rates, String base, LocalDate date) {
        this.rates = rates;
        this.base = base;
        this.date = date;
    }

    public Map<String, BigDecimal> getRates() {
        return rates;
    }

    public void setRates(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
