package com.example.demo.structural.facade.email;

import com.example.demo.structural.facade.Order;

public class EmailFacade {
    public boolean sendOrderEmail(Order order){
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template) // isi pesan
                .withStationary(stationary) // template header footer email
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }
}
