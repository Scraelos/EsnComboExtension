/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.esn.esncomboextension.client;

import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.client.ui.VComboBox;
import com.vaadin.shared.ui.Connect;
import org.esn.esncomboextension.NoAutcompleteComboBoxExtension;

/**
 *
 * @author guest
 */
@SuppressWarnings("serial")
@Connect(NoAutcompleteComboBoxExtension.class)
public class NoAutcompleteComboBoxExtensionConnector extends AbstractExtensionConnector {

    private VComboBox comboBox;

    @Override
    protected void extend(ServerConnector target) {
        comboBox = (VComboBox) ((ComponentConnector) target).getWidget();
        comboBox.tb.getElement().setAttribute("autocomplete", "off");
        /*comboBox.addAttachHandler(new com.google.gwt.event.logical.shared.AttachEvent.Handler() {
            @Override
            public void onAttachOrDetach(com.google.gwt.event.logical.shared.AttachEvent event) {
                if (event.isAttached()) {
                }
            }
        });*/
        
    }

}
