package com.school_app.lib.view;

import com.school_app.lib.model.BaseModel;

public class BaseView<T extends BaseModel>{
    protected final T entity;
    public BaseView(T entity) {
        this.entity = entity;
    }

    public Long getId(){
        return entity.getId();
    }
}
