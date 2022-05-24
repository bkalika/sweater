//package com.sweater.sweater.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//
//import java.util.Properties;
//
///**
// * @author @bkalika
// * Created on 25.05.2022 10:34 PM
// */
//@Configuration
//public class MailConfig {
//
//    @Value("${spring.mail.host}")
//    private String host;
//
//    @Value("${spring.mail.port}")
//    private int port;
//
//    @Value("${spring.mail.password}")
//    private String password;
//
//    @Value("${spring.mail.protocol}")
//    private String protocol;
//
//    @Value("${mail.debug}")
//    private String debug;
//
//    @Value("${spring.mail.properties.mail.smtp.auth}")
//    private String isSmtpAuth;
//
//    @Value("${spring.mail.properties.mail.smtp.starttls.enable}")
//    private String isStarttlsEnable;
//
////    @Value("${starttls.required}")
////    private String isStarttlsRequired;
//
//    @Value("${spring.mail.properties.mail.smtp.ssl.trust}")
//    private String smtpSslTrust;
//
//    @Bean
//    public JavaMailSender getMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//
//        mailSender.setHost(host);
//        mailSender.setPort(port);
//        mailSender.setPassword(password);
//
//        Properties properties = mailSender.getJavaMailProperties();
//
//        properties.setProperty("mail.transport.protocol", protocol);
//        properties.setProperty("mail.debug", debug);
//        properties.put("mail.smtp.auth", isSmtpAuth);
//        properties.setProperty("mail.smtp.starttls.enable", isStarttlsEnable);
////        properties.setProperty("starttls.required", isStarttlsRequired);
////        properties.put("mail.smtp.ssl.trust", smtpSslTrust);
//        properties.setProperty("mail.smtp.ssl.enable", "true");
//
//        return mailSender;
//    }
//}
