package com.learn.test.api.provider.service.exception.constant;

import lombok.Getter;


/**
 * @author geweijian
 * @data 2017-09-21
 */
@Getter
public enum ErrorEnum {
    MARKET(1, "营销费用结算"),
    PAY_CAV(2, "代付费用结算"),;


    private Integer value;

    private String name;

    ErrorEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ErrorEnum valueOf(Integer value) {

        if (value == 1) {
            return MARKET;
        } else if (value == 2) {
            return PAY_CAV;
        } else {
            return null;
        }
    }


}
