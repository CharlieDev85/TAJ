package com.charlie.tellajoke.jsfjpa.customval;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class ArbitraryMessageController implements Serializable {

    @Inject
    FacesContext fc;

    public void usernameError(){
        FacesMessage fm = new FacesMessage(
                FacesMessage.SEVERITY_ERROR,
                "Username already Exists",
                "Change your username");

        fc.addMessage(null, fm);
    }
}
