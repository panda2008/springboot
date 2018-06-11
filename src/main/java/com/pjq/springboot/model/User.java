package com.pjq.springboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@ApiModel
public class User implements Serializable {

    @Id
    @ApiModelProperty(value = "用户ID", required = false)
    private Integer id;

    @ApiModelProperty(value = "用户名称", required = true)
    @NotEmpty
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
