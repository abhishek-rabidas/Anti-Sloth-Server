package com.antislothserver.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SleepRecord {
    private String date;
    private String start;
    private String end;
    private String total;
}