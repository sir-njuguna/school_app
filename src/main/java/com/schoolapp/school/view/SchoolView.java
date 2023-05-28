package com.schoolapp.school.view;

import com.schoolapp.lib.view.BaseView;
import com.schoolapp.school.model.School;

public class SchoolView extends BaseView<School> {
    public SchoolView(School entity) {
        super(entity);
    }

    public String getName(){
        return entity.getName();
    }

    public String getPhysicalAddress(){
        return entity.getPhysicalAddress();
    }

    public String getPhoneNumber(){
        return entity.getPhoneNumber();
    }

    public String getEmailAddress(){
        return entity.getEmailAddress();
    }
}
