package jbackend.ConfigureInstruction.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WebContr {

    @Value("${app.name}")
    private String appName;

    @Autowired
    private dbSetting dbSetting;

    @Autowired
    private Environment env;

    @GetMapping("/appname")
    public String getAppName(){
        return appName+" "+dbSetting.getConnection()+" "+dbSetting.getHost()+" "+dbSetting.getPort();
    }

    @GetMapping("/envdetails")
    public String getDetails(){
        return env.toString();
    }





}
