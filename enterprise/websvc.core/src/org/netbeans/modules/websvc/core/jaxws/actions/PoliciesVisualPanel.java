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

/*
 * OWSMPolicies.java
 *
 * Created on 29.06.2011, 18:25:16
 */
package org.netbeans.modules.websvc.core.jaxws.actions;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ListModel;

/**
 *
 * @author ads
 */
public class PoliciesVisualPanel extends javax.swing.JPanel {

    
    public PoliciesVisualPanel(List<String> ids ) {
        initComponents();
        
        String policies[] = ids.toArray(new String[0]);
        ListModel model = new DefaultComboBoxModel( policies);
        list.setModel( model );
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        label = new javax.swing.JLabel();

        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);
        list.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(PoliciesVisualPanel.class, "ACSN_SelectPolicy")); // NOI18N
        list.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(PoliciesVisualPanel.class, "ACSD_SelectPolicy")); // NOI18N

        label.setLabelFor(list);
        org.openide.awt.Mnemonics.setLocalizedText(label, org.openide.util.NbBundle.getMessage(PoliciesVisualPanel.class, "LBL_ChoosePolicyLbl")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(label))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        label.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(PoliciesVisualPanel.class, "ACSN_SelectPolicy")); // NOI18N
        label.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(PoliciesVisualPanel.class, "ACSD_SelectPolicy")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents
    
    
    public String getId() {
        Object selected = list.getSelectedValue();
        if ( selected != null ){
            return selected.toString();
        }
        else {
            return null;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    private javax.swing.JList list;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
    
}
