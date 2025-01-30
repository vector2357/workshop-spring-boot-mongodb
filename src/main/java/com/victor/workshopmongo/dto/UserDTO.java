package com.victor.workshopmongo.dto;

import java.io.Serializable;

public record UserDTO(String id, String name, String email) implements Serializable {
}
