// WebTimeBean.java
// Bean that enables the JSF page to retrieve the time from the server
package com.eltonb.webapp.webtime;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "webTimeBean")
public class WebTimeBean 
{ 
    
    public WebTimeBean() {
    }
           
    // return the time on the server at which the request was received
    public String getTime() {
        Date now = new Date();
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(now);
    } 
}