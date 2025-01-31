package com.victor.workshopmongo.dto;

import java.io.Serializable;

public record AuthorDTO(String id, String name) implements Serializable {
}
