package br.com.fiap3espb;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class Application {
    public static void main(String[] args) throws MalformedURLException {
        final String WSDL = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso?WSDL";
        final String TARGET = "http://www.dataaccess.com/webservicesserver/";
        final String NAME = "NumberConversion";

        URL url = new URL(WSDL);
        QName qName = new QName(TARGET, NAME);
        Service service = Service.create(url, qName);
    }
}

