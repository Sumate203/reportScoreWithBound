/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportscorewithbound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Source implements Serializable {
    
    public static final String SOME_DATA_PROPERTY = "someData";
    
    private String someData;
    
    private PropertyChangeSupport propertySupport;
    
    public Source() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSomeDataProperty() {
        return someData;
    }
    
    public void setSomeDataProperty(String value) {
        String oldValue = someData;
        someData = value;
        propertySupport.firePropertyChange(someData, oldValue, someData);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
