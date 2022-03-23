package com.gruposei.gestion_orquestas.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.zxing.WriterException;
import com.gruposei.gestion_orquestas.model.MyError;
import com.gruposei.gestion_orquestas.model.Role;
import com.gruposei.gestion_orquestas.model.Ticket;
import com.gruposei.gestion_orquestas.model.User;
import com.gruposei.gestion_orquestas.service.MyErrorService;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.MessagingException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Optional;

public class testingThings {



    public static void main(String[] args) throws IOException, WriterException, DocumentException, MessagingException {

        PDFGenerator pdf = new PDFGenerator();
        ByteArrayOutputStream bos = pdf.generatePDF("123abc","El show de allá",new Date());

        byte[] bytes = bos.toByteArray();
        InputStream inputStream = new ByteArrayInputStream(bytes);

        MailSender ms = new MailSender();
        ms.sendMessageWithAttachment("davidboffelli@gmail.com","Entrada comprada","Usted a comprado exitosamente una entrada\nSe adjunta el PDF con el código QR", inputStream);
    }
}
