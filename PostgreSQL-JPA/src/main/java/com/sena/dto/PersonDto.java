package com.sena.dto;

import com.sun.istack.NotNull;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class PersonDto {
    // DTO -> Data transfer object
    // uses service
    private Long id;
    @NotNull
    private String name;
    private String lastname;
    private List<String> addresses;
}
