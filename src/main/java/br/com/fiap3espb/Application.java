package br.com.fiap3espb;

import br.com.fiap3espb.stub_classes.NumberConversion;
import br.com.fiap3espb.stub_classes.NumberConversionSoapType;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

public class Application {
    //conversor de números
    public static void main(String[] args) throws MalformedURLException {
        final String WSDL = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso?WSDL";
        final String TARGET = "http://www.dataaccess.com/webservicesserver/";
        final String NAME = "NumberConversion";

        URL url = new URL(WSDL);
        QName qName = new QName(TARGET, NAME);
        Service service = Service.create(url, qName);

        NumberConversionSoapType numberConversion = service.getPort(NumberConversionSoapType.class);
        String convertedNumber = numberConversion.numberToWords(BigInteger.valueOf(0));
        System.out.println(convertedNumber);
    }
}

