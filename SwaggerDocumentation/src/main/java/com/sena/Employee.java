package com.sena;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@ApiModel(description = "Employee Model")
public class Employee implements Serializable {

    private static final Long serialVersionUID = 1L;

    @ApiModelProperty(notes= "Id of the Employee", name = "id", required = true, value = "5432")
    private Long id;

    @ApiModelProperty(notes = "Name of the Employee", name = "name", required = true, value= "Tom")
    private String name;

    @ApiModelProperty(notes = "Department of the Employee", name = "department", required = true, value = "Electrical")
    private String department;

    @ApiModelProperty(notes = "Phone number of Employee", name = "phoneNumber", required = true, value = "5489998877")
    private Long phoneNumber;

}
