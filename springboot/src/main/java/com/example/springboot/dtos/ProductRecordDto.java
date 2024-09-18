package com.example.springboot.dtos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.math.BigInteger;

public record ProductRecordDto(@NotBlank String name,@NotNull BigDecimal price) {

}
