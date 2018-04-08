/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charlie.tellajoke.jsf.customval;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author charlie
 */

@Named
@RequestScoped
public class AlphanumericValidator {
    /**
     * 
     * 
     * @param facesContext
     * @param uiComponent
     * @param value
     * @throws ValidatorException 
     */
    public void validateAlphanumeric(FacesContext facesContext,
      UIComponent uiComponent,
      Object value) throws ValidatorException {
    if (!StringUtils.isAlphanumeric((String) value)) {
      HtmlInputText htmlInputText = (HtmlInputText) uiComponent;
      FacesMessage facesMessage = new FacesMessage(htmlInputText.
          getLabel()
          + ": only alpha-numeric characters are allowed.");
      throw new ValidatorException(facesMessage);
    }
  }
    
}
