package com.victor.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public record CommentDTO(String text, Date date, AuthorDTO author) implements Serializable {
}
