package com.sena;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@ApiModel(description = "Error Response Model")
public class ErrorResponse implements Serializable {

    private static final Long serialVersionUID = 1L;

    @ApiModelProperty(notes = "Error Code", name = "code", value = "200")
    private int code;

    @ApiModelProperty(notes = "Status", name = "message", value = "SUCCESS")
    private String status;

    @ApiModelProperty(name="Message", value = "Invalied field")
    private String message;

}
