/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.httpserver;

import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.openide.explorer.propertysheet.PropertyEnv;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;

/**
 *
 * @author  Gabriel Tichy
 */
public class HostPropertyCustomEditor extends javax.swing.JPanel 
        implements HelpCtx.Provider, ActionListener, PropertyChangeListener {
    private final HostPropertyEditor editor;

    /** Creates new form HostEditorPanel */
    @SuppressWarnings("LeakingThisInConstructor")
    public HostPropertyCustomEditor (HostPropertyEditor ed, PropertyEnv env) {
        editor = ed;
        initComponents ();
        initAccessibility();
        anyRadioButton.addActionListener (this);
        selectedRadioButton.addActionListener (this);
        setPreferredSize (new java.awt.Dimension (300, 200));
        
        // set values from PropertyEditor
        HttpServerSettings.HostProperty hp = (HttpServerSettings.HostProperty)editor.getValue ();
        if (HttpServerSettings.ANYHOST.equals (hp.getHost ())) {
            anyRadioButton.setSelected (true);
            grantTextArea.setText (""); // NOI18N
        }
        else if (HttpServerSettings.LOCALHOST.equals (hp.getHost ())) {
            selectedRadioButton.setSelected (true);
            grantTextArea.setText (hp.getGrantedAddresses ());
        }
        
        env.setState(PropertyEnv.STATE_NEEDS_VALIDATION);
        env.addPropertyChangeListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent event) {
        try {
            if (event.getSource() == anyRadioButton) {
                grantLabel.setEnabled (false);
                grantTextArea.setEnabled (false);
            }
            else if (event.getSource() == selectedRadioButton) {
                grantLabel.setEnabled (true);
                grantTextArea.setEnabled (true);
            }
        } catch (Exception e) {
            Exceptions.printStackTrace(e);
        }
    }
    
    private void initAccessibility()
    {
        hostLabel.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(HostPropertyCustomEditor.class, "ACS_HostLabelA11yDesc"));
        grantLabel.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(HostPropertyCustomEditor.class, "ACS_GrantLabelA11yDesc"));
        grantTextArea.getAccessibleContext().setAccessibleName(NbBundle.getMessage(HostPropertyCustomEditor.class, "ACS_GrantTextAreaA11yName"));
        getAccessibleContext().setAccessibleDescription (NbBundle.getMessage(HostPropertyCustomEditor.class, "ACS_HostPropertyPanelA11yDesc"));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup = new javax.swing.ButtonGroup();
        hostLabel = new javax.swing.JLabel();
        anyRadioButton = new javax.swing.JRadioButton();
        selectedRadioButton = new javax.swing.JRadioButton();
        grantLabel = new javax.swing.JLabel();
        grantScrollPane = new javax.swing.JScrollPane();
        grantTextArea = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 11, 11));
        setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(hostLabel, org.openide.util.NbBundle.getBundle("org/netbeans/modules/httpserver/Bundle").getString("CTL_HostLabel")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(hostLabel, gridBagConstraints);

        buttonGroup.add(anyRadioButton);
        org.openide.awt.Mnemonics.setLocalizedText(anyRadioButton, org.openide.util.NbBundle.getBundle("org/netbeans/modules/httpserver/Bundle").getString("CTL_AnyRadioButton")); // NOI18N
        anyRadioButton.setToolTipText(org.openide.util.NbBundle.getBundle(HostPropertyCustomEditor.class).getString("ACS_AnyRadioButtonA11yDesc")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(anyRadioButton, gridBagConstraints);

        buttonGroup.add(selectedRadioButton);
        selectedRadioButton.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(selectedRadioButton, org.openide.util.NbBundle.getBundle("org/netbeans/modules/httpserver/Bundle").getString("CTL_SelectedRadioButton")); // NOI18N
        selectedRadioButton.setToolTipText(org.openide.util.NbBundle.getBundle(HostPropertyCustomEditor.class).getString("ACS_SelectedRadioButtonA11yDesc")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(selectedRadioButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(grantLabel, org.openide.util.NbBundle.getBundle("org/netbeans/modules/httpserver/Bundle").getString("CTL_GrantLabel")); // NOI18N
        grantLabel.setLabelFor(grantTextArea);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 2, 0);
        add(grantLabel, gridBagConstraints);

        grantTextArea.setToolTipText(org.openide.util.NbBundle.getBundle(HostPropertyCustomEditor.class).getString("ACS_GrantTextAreaA11yDesc")); // NOI18N
        grantScrollPane.setViewportView(grantTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(grantScrollPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private java.lang.Object getPropertyValue () throws java.lang.IllegalStateException {
        if (anyRadioButton.isSelected ())
            return new HttpServerSettings.HostProperty ("", HttpServerSettings.ANYHOST);    // NOI18N
        else if (selectedRadioButton.isSelected ())
            return new HttpServerSettings.HostProperty (grantTextArea.getText (), HttpServerSettings.LOCALHOST);
        
        throw new IllegalStateException ();
    }    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton anyRadioButton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel grantLabel;
    private javax.swing.JScrollPane grantScrollPane;
    private javax.swing.JTextArea grantTextArea;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JRadioButton selectedRadioButton;
    // End of variables declaration//GEN-END:variables

    /** Help context where to find more about the paste type action.
     * @return the help context for this action
     */
    @Override
    public HelpCtx getHelpCtx() {
        String helpid = HostPropertyCustomEditor.class.getName()+"_properties"; //NOI18N
        return new HelpCtx(helpid);
    }        

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (PropertyEnv.PROP_STATE.equals(evt.getPropertyName()) && evt.getNewValue() == PropertyEnv.STATE_VALID) {
            editor.setValue(getPropertyValue());
        }
    }
}
