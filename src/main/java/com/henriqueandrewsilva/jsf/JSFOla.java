
package com.henriqueandrewsilva.jsf;

import com.henriqueandrewsilva.ejb.EJBOla;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

// @author Henrique Andrew da Silva

@Named(value = "jSFOla")
@RequestScoped
public class JSFOla {

    @EJB
    private EJBOla eJBOla;

    /**
     * Creates a new instance of JSFOla
     */
    
    public JSFOla() {
    }
    
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public void chamar_ejb(){
        this.msg = eJBOla.oi();        
    }
    
}
