/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charlie.tellajoke.jsf.customval;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.commons.lang3.StringUtils;

/**
 * Used to check if a String is a valid password.
 * 
 * @author charlie
 * @version 1
 */
@FacesValidator(value="passwordValidator")
public class MyPasswordValidator implements Validator{

    @Override
  public void validate(FacesContext facesContext, UIComponent uiComponent, 
          Object value) throws ValidatorException {
      
      PasswordValidator passwordValidator = new PasswordValidator();
      String password = (String) value;
      HtmlInputSecret htmlInputSecret = (HtmlInputSecret) uiComponent;
      if(!StringUtils.isEmpty(password)){
          if(!passwordValidator.isPassword(password)){
              FacesMessage facesMessage = new FacesMessage(htmlInputSecret.getLabel()
            + ": password format is not valid");
        throw new ValidatorException(facesMessage);
          }
      }
      
  }
    
}
