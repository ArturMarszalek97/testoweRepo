package rsi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "HelloWorld", targetNamespace = "http://rsi/")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHelloWorldAsString", targetNamespace = "http://rsi/", className = "rsi.GetHelloWorldAsString")
    @ResponseWrapper(localName = "getHelloWorldAsStringResponse", targetNamespace = "http://rsi/", className = "rsi.GetHelloWorldAsStringResponse")
    @Action(input = "http://rsi/HelloWorld/getHelloWorldAsStringRequest", output = "http://rsi/HelloWorld/getHelloWorldAsStringResponse")
    public String getHelloWorldAsString(@WebParam(name = "arg0", targetNamespace = "") String arg0);
}
