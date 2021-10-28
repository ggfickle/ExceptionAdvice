package com.example.demo.pojo;


import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ToString
public class Person implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    @NotNull(message = "name不能为空")
    private String name;

    /**
     * 性别 1：男  2：女
     */
    @DecimalMax(value = "1", message = "sex必须大雨1")
    private Integer sex;
}
