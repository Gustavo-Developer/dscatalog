package com.mendes.dscatalog.dto;

import com.mendes.dscatalog.entities.Category;

import java.io.Serial;
import java.io.Serializable;

public class CategoryDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public CategoryDTO() {}

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO (Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
