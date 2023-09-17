package com.example.demo.structural.facade;

import com.example.demo.structural.facade.email.*;

public class Client {

    public static void main(String[] args) {
        withFacade();
    }

    private static void withFacade()
    {
        Order order = new Order("101", 99);
        EmailFacade emailFacade = new EmailFacade();
        boolean result = emailFacade.sendOrderEmail(order);
        System.out.println("Order Email" + (result?"sent":"Not Sent..."));
    }

    private static void withoutFacade()
    {
        Order order = new Order("101", 99);
        EmailFacade emailFacade = new EmailFacade();
        boolean result = sendOrderEmailWithoutFacade(order);
        System.out.println("Order Email" + (result?"sent":"Not Sent..."));
    }

    private static boolean sendOrderEmailWithoutFacade(Order order){
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
