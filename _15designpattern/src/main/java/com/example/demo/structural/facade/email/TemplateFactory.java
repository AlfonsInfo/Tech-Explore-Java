package com.example.demo.structural.facade.email;

import com.example.demo.structural.facade.email.Template;
import com.example.demo.structural.facade.email.Template.TemplateType;

public class TemplateFactory {

    public static Template createTemplateFor(TemplateType type) {
        switch (type) {
            case Email:
                return new OrderEmailTemplate();
            default:
                throw new IllegalArgumentException("Unknown TemplateType");
        }

    }
}