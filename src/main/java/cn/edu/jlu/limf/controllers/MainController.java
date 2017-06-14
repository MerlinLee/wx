package cn.edu.jlu.limf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xml.sax.XMLReader;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by merlin on 17-6-14.
 */

@Controller
public class MainController {
    @RequestMapping(value = "/wx", method = RequestMethod.POST, headers = {"content-type=application/json","content-type=application/xml"})
    public @ResponseBody String RecieveXML(@RequestBody String xmlWechat){

        try{
            SAXParserFactory factory=SAXParserFactory.newInstance();//生成SAX的解析器 工厂的实例
            SAXParser parser=factory.newSAXParser();//通过工厂生成SAX解析器
            XMLReader reader=parser.getXMLReader(); //生成XMLReader用来读取文件
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }
}
