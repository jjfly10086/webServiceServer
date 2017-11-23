package com.jwh.demo;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by jwh on 2017/11/23.
 * webService test demo
 * 服务发布后在控制台执行：wsimport -s . http://10.9.0.161:8080/services?wsdl
 * 将解析出来的文件导入到webService客户端
 */
@WebService
public class TestService {

    public String f1(String name){
        System.out.println("webService server invoke method");
        return "f1:"+name;
    }
    public void f2(String name){
        System.out.println("f2:"+name);
    }
    public static void main(String[] args){
        Endpoint.publish("http://10.9.0.161:8080/services",new TestService());
    }
}
