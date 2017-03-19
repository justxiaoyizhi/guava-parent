package com.xyz.exam;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

/**
 * Created by Xiao on 2017/3/12.
 */
@AllArgsConstructor
public class Person {
    @Getter
    private String name;
    private Date birth;

    public Date getBirth() {
        return new Date(birth.getTime());
    }
}
