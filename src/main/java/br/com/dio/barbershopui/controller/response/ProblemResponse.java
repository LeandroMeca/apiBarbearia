package br.com.dio.barbershopui.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.OffsetDateTime;

public record ProblemResponse(@JsonProperty("status")
                              Integer status,
                              @JsonProperty("timestamp")
                              OffsetDateTime timestamp,
                              @JsonProperty("message")
                              String message) {


    public ProblemResponse{}

}