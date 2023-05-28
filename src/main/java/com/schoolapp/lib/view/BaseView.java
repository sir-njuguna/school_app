package com.schoolapp.lib.view;

import com.schoolapp.lib.model.BaseModel;

public class BaseView<T extends BaseModel>{
    protected final T entity;
    public BaseView(T entity) {
        this.entity = entity;
    }

    public Long getId(){
        return entity.getId();
    }
}
