package com.example.case2bugrayus.model.request;

import com.example.case2bugrayus.model.District;
import lombok.Data;

@Data
public class CreateQuarterRequestModel {
    String name;
    int districtId;
}
