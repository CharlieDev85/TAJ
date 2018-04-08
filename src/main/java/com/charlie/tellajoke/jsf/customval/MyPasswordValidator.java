/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charlie.tellajoke.jsf.customval;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author charlie
 */
@FacesValidator(value="passwordValidator")
public class MyPasswordValidator implements Validator{

    @Override
  public void validate(FacesContext facesContext, UIComponent uiComponent, 
          Object value) throws ValidatorException {

  }
    
}
