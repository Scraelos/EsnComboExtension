/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.esn.esncomboextension;

import com.vaadin.server.AbstractExtension;
import com.vaadin.ui.ComboBox;

/**
 *
 * @author guest
 */
@SuppressWarnings("serial")
public class NoAutcompleteComboBoxExtension extends AbstractExtension {

    private ComboBox<?> comboBox;

    public NoAutcompleteComboBoxExtension(ComboBox comboBox) {
        this.extend(comboBox);
        this.comboBox = comboBox;
    }

}
