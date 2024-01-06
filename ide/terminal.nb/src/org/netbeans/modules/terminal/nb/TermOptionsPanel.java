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
package org.netbeans.modules.terminal.nb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.netbeans.lib.terminalemulator.LineDiscipline;
import org.netbeans.lib.terminalemulator.Term;
import org.netbeans.lib.terminalemulator.support.TermOptions;
import static org.netbeans.modules.terminal.nb.Bundle.*;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.NbBundle.Messages;

/**
 * A copy of org.netbeans.lib.terminalemulator.support.TermOptionsPanel that
 * uses NB's ColorComboBoxes
 */
public final class TermOptionsPanel extends JPanel {

    private final Term term;
    private final PropertyChangeListener propertyListener;
    private boolean inApplyingModel;
    private TermOptions termOptions;
    
    /**
     * Creates new form TermOptionPanel
     */
    @Messages({
	"MSG_Hello=Hello from Term",
	"FontChooser.title=Font Chooser",
	"FontChooser.defaultFont.label=Default Font"
    })
    public TermOptionsPanel() {
        propertyListener = (PropertyChangeEvent e) -> {
            refreshView();
        };
	
	initComponents();
	initCustomComponents();

	term = new Term();
	final String line1String = MSG_Hello() + "\r\n";	// NOI18N
	final char line1[] = line1String.toCharArray();
	term.putChars(line1, 0, line1.length);
	term.pushStream(new LineDiscipline());
	term.setRowsColumns(7, 60);
	term.setClickToType(true);

	previewPanel.add(term, BorderLayout.CENTER);
    }

    private boolean changingSelectByWordText = false;
    
    private void initCustomComponents() {
	selectByWordTextField.getDocument().addDocumentListener(new DocumentListener() {

	    @Override
	    public void insertUpdate(DocumentEvent e) {
		textChangeActionPerformed();
	    }

	    @Override
	    public void removeUpdate(DocumentEvent e) {
		textChangeActionPerformed();
	    }

	    @Override
	    public void changedUpdate(DocumentEvent e) {
		// ignore
	    }

	    private void textChangeActionPerformed() {
		if (inApplyingModel) {
		    return;
		}
		changingSelectByWordText = true;
		String delimiters = selectByWordTextField.getText();
		termOptions.setSelectByWordDelimiters(delimiters);
		changingSelectByWordText = false;
	    }
	});
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descriptionLabel = new javax.swing.JLabel();
        restoreButton = new javax.swing.JButton();
        fontLabel = new javax.swing.JLabel();
        fontText = new javax.swing.JTextField();
        fontButton = new javax.swing.JButton();
        fontSizeLabel = new javax.swing.JLabel();
        fontSizeSpinner = new javax.swing.JSpinner();
        foregroundLabel = new javax.swing.JLabel();
        foregroundComboBox = new org.openide.awt.ColorComboBox();
        backgroundLabel = new javax.swing.JLabel();
        backgroundComboBox = new org.openide.awt.ColorComboBox();
        selectionLabel = new javax.swing.JLabel();
        selectionComboBox = new org.openide.awt.ColorComboBox();
        historySizeLabel = new javax.swing.JLabel();
        historySizeSpinner = new javax.swing.JSpinner();
        tabSizeLabel = new javax.swing.JLabel();
        tabSizeSpinner = new javax.swing.JSpinner();
        selectByWordLabel = new javax.swing.JLabel();
        selectByWordTextField = new javax.swing.JTextField();
        clickToTypeCheckBox = new javax.swing.JCheckBox();
        ignoreKeymapCheckBox = new javax.swing.JCheckBox();
        lineWrapCheckBox = new javax.swing.JCheckBox();
        scrollOnInputCheckBox = new javax.swing.JCheckBox();
        scrollOnOutputCheckBox = new javax.swing.JCheckBox();
        previewLabel = new javax.swing.JLabel();
        previewPanel = new javax.swing.JPanel();
        altSendsEscapeCheckBox = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(descriptionLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.descriptionLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(restoreButton, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.restoreButton.text")); // NOI18N
        restoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(fontLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.fontLabel.text")); // NOI18N

        fontText.setEditable(false);
        fontText.setText(org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.fontText.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(fontButton, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.fontButton.text")); // NOI18N
        fontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(fontSizeLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.fontSizeLabel.text")); // NOI18N

        fontSizeSpinner.setModel(new SpinnerNumberModel(12, termOptions.MIN_FONT_SIZE, termOptions.MAX_FONT_SIZE, 1));
        fontSizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fontSizeSpinnerStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(foregroundLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.foregroundLabel.text")); // NOI18N

        foregroundComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foregroundComboBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(backgroundLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.backgroundLabel.text")); // NOI18N

        backgroundComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundComboBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(selectionLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.selectionLabel.text")); // NOI18N

        selectionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionComboBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(historySizeLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.historySizeLabel.text")); // NOI18N

        historySizeSpinner.setModel(new SpinnerNumberModel(5000, TermOptions.MIN_HISTORY_SIZE, TermOptions.MAX_HISTORY_SIZE, 1));
        historySizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                historySizeSpinnerStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(tabSizeLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.tabSizeLabel.text")); // NOI18N

        tabSizeSpinner.setModel(new SpinnerNumberModel(8, TermOptions.MIN_TAB_SIZE, TermOptions.MAX_TAB_SIZE, 1));
        tabSizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabSizeSpinnerStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(selectByWordLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.selectByWordLabel.text")); // NOI18N

        selectByWordTextField.setText(org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.selectByWordTextField.text")); // NOI18N

        clickToTypeCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(clickToTypeCheckBox, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.clickToTypeCheckBox.text")); // NOI18N
        clickToTypeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickToTypeCheckBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(ignoreKeymapCheckBox, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.ignoreKeymapCheckBox.text")); // NOI18N
        ignoreKeymapCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ignoreKeymapCheckBoxActionPerformed(evt);
            }
        });

        lineWrapCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(lineWrapCheckBox, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.lineWrapCheckBox.text")); // NOI18N
        lineWrapCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineWrapCheckBoxActionPerformed(evt);
            }
        });

        scrollOnInputCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(scrollOnInputCheckBox, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.scrollOnInputCheckBox.text")); // NOI18N
        scrollOnInputCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollOnInputCheckBoxActionPerformed(evt);
            }
        });

        scrollOnOutputCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(scrollOnOutputCheckBox, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.scrollOnOutputCheckBox.text")); // NOI18N
        scrollOnOutputCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollOnOutputCheckBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(previewLabel, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.previewLabel.text")); // NOI18N

        previewPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        previewPanel.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(altSendsEscapeCheckBox, org.openide.util.NbBundle.getMessage(TermOptionsPanel.class, "TermOptionsPanel.altSendsEscapeCheckBox.text")); // NOI18N
        altSendsEscapeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altSendsEscapeCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fontLabel)
                    .addComponent(fontSizeLabel)
                    .addComponent(foregroundLabel)
                    .addComponent(backgroundLabel)
                    .addComponent(selectionLabel)
                    .addComponent(historySizeLabel)
                    .addComponent(descriptionLabel))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(foregroundComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backgroundComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectionComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectByWordTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fontText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fontSizeSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historySizeSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tabSizeSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(restoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fontButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabSizeLabel)
                    .addComponent(previewLabel)
                    .addComponent(selectByWordLabel))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollOnInputCheckBox)
                    .addComponent(clickToTypeCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lineWrapCheckBox)
                    .addComponent(scrollOnOutputCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ignoreKeymapCheckBox)
                    .addComponent(altSendsEscapeCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(previewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restoreButton)
                    .addComponent(descriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontLabel)
                    .addComponent(fontButton)
                    .addComponent(fontText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontSizeLabel)
                    .addComponent(fontSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foregroundLabel)
                    .addComponent(foregroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backgroundLabel)
                    .addComponent(backgroundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectionLabel)
                    .addComponent(selectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historySizeLabel)
                    .addComponent(historySizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabSizeLabel)
                    .addComponent(tabSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectByWordLabel)
                    .addComponent(selectByWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickToTypeCheckBox)
                    .addComponent(lineWrapCheckBox)
                    .addComponent(ignoreKeymapCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scrollOnInputCheckBox)
                    .addComponent(scrollOnOutputCheckBox)
                    .addComponent(altSendsEscapeCheckBox))
                .addGap(18, 18, 18)
                .addComponent(previewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fontSizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fontSizeSpinnerStateChanged
	if (inApplyingModel) {
	    return;
	}
	Object fontSizeObj = fontSizeSpinner.getValue();
	if (fontSizeObj instanceof Integer) {
	    int fontSize = (Integer) fontSizeObj;
	    termOptions.setFontSize(fontSize);
	}
    }//GEN-LAST:event_fontSizeSpinnerStateChanged

    private void historySizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_historySizeSpinnerStateChanged
	if (inApplyingModel) {
	    return;
	}
	Object historySizeObj = historySizeSpinner.getValue();
	if (historySizeObj instanceof Integer) {
	    int historySize = (Integer) historySizeObj;
	    termOptions.setHistorySize(historySize);
	}
    }//GEN-LAST:event_historySizeSpinnerStateChanged

    private void tabSizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabSizeSpinnerStateChanged
	if (inApplyingModel) {
	    return;
	}
	Object tabSizeObj = tabSizeSpinner.getValue();
	if (tabSizeObj instanceof Integer) {
	    int tabSize = (Integer) tabSizeObj;
	    termOptions.setTabSize(tabSize);
	}
    }//GEN-LAST:event_tabSizeSpinnerStateChanged

    private void fontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontButtonActionPerformed
	PropertyEditor pe = PropertyEditorManager.findEditor(Font.class);
	if (pe != null) {
	    pe.setValue(termOptions.getFont());
	    DialogDescriptor dd = new DialogDescriptor(pe.getCustomEditor(), FontChooser_title());

	    String defaultFontString = FontChooser_defaultFont_label();
	    dd.setOptions(new Object[]{DialogDescriptor.OK_OPTION,
		defaultFontString, DialogDescriptor.CANCEL_OPTION});  //NOI18N
            Dialog dialog = DialogDisplayer.getDefault().createDialog(dd);
            dialog.setSize(460, 380);
	    dialog.setVisible(true);
	    if (dd.getValue() == DialogDescriptor.OK_OPTION) {
		Font f = (Font) pe.getValue();
		termOptions.setFont(f);
		applyTermOptions();
	    } else if (dd.getValue() == defaultFontString) {
		Font controlFont = UIManager.getFont("controlFont");			//NOI18N
		int fontSize = (controlFont == null) ? 12 : controlFont.getSize();
		termOptions.setFont(new Font("monospaced", Font.PLAIN, fontSize));	//NOI18N
	    }
	}
    }//GEN-LAST:event_fontButtonActionPerformed

    private void restoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreButtonActionPerformed
	termOptions.resetToDefault();
    }//GEN-LAST:event_restoreButtonActionPerformed

    private void clickToTypeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickToTypeCheckBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	termOptions.setClickToType(clickToTypeCheckBox.isSelected());
    }//GEN-LAST:event_clickToTypeCheckBoxActionPerformed

    private void scrollOnInputCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollOnInputCheckBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	termOptions.setScrollOnInput(scrollOnInputCheckBox.isSelected());
    }//GEN-LAST:event_scrollOnInputCheckBoxActionPerformed

    private void scrollOnOutputCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollOnOutputCheckBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	termOptions.setScrollOnOutput(scrollOnOutputCheckBox.isSelected());
    }//GEN-LAST:event_scrollOnOutputCheckBoxActionPerformed

    private void lineWrapCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineWrapCheckBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	termOptions.setLineWrap(lineWrapCheckBox.isSelected());
    }//GEN-LAST:event_lineWrapCheckBoxActionPerformed

    private void ignoreKeymapCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ignoreKeymapCheckBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	termOptions.setIgnoreKeymap(ignoreKeymapCheckBox.isSelected());
    }//GEN-LAST:event_ignoreKeymapCheckBoxActionPerformed

    private void foregroundComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foregroundComboBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	Color c = foregroundComboBox.getSelectedColor();
	if (c != null) {
	    termOptions.setForeground(c);
	}
    }//GEN-LAST:event_foregroundComboBoxActionPerformed

    private void backgroundComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundComboBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	Color c = backgroundComboBox.getSelectedColor();
	if (c != null) {
	    termOptions.setBackground(c);
	}
    }//GEN-LAST:event_backgroundComboBoxActionPerformed

    private void selectionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionComboBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	Color c = selectionComboBox.getSelectedColor();
	if (c != null) {
	    termOptions.setSelectionBackground(c);
	}
    }//GEN-LAST:event_selectionComboBoxActionPerformed

    private void altSendsEscapeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altSendsEscapeCheckBoxActionPerformed
	if (inApplyingModel) {
	    return;
	}
	termOptions.setAltSendsEscape(altSendsEscapeCheckBox.isSelected());
    }//GEN-LAST:event_altSendsEscapeCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox altSendsEscapeCheckBox;
    private org.openide.awt.ColorComboBox backgroundComboBox;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JCheckBox clickToTypeCheckBox;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JButton fontButton;
    private javax.swing.JLabel fontLabel;
    private javax.swing.JLabel fontSizeLabel;
    private javax.swing.JSpinner fontSizeSpinner;
    private javax.swing.JTextField fontText;
    private org.openide.awt.ColorComboBox foregroundComboBox;
    private javax.swing.JLabel foregroundLabel;
    private javax.swing.JLabel historySizeLabel;
    private javax.swing.JSpinner historySizeSpinner;
    private javax.swing.JCheckBox ignoreKeymapCheckBox;
    private javax.swing.JCheckBox lineWrapCheckBox;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JPanel previewPanel;
    private javax.swing.JButton restoreButton;
    private javax.swing.JCheckBox scrollOnInputCheckBox;
    private javax.swing.JCheckBox scrollOnOutputCheckBox;
    private javax.swing.JLabel selectByWordLabel;
    private javax.swing.JTextField selectByWordTextField;
    private org.openide.awt.ColorComboBox selectionComboBox;
    private javax.swing.JLabel selectionLabel;
    private javax.swing.JLabel tabSizeLabel;
    private javax.swing.JSpinner tabSizeSpinner;
    // End of variables declaration//GEN-END:variables

    /**
     * Set the model for this view. Changes in the panel are directly reflected
     * in this model which may be {@link TermOptions#assign}ed later.
     *
     * @param termOptions
     */
    public void setTermOptions(TermOptions termOptions) {
	if (this.termOptions != null) {
	    this.termOptions.removePropertyChangeListener(propertyListener);
	}

	this.termOptions = termOptions;

	if (this.termOptions != null) {
	    this.termOptions.addPropertyChangeListener(propertyListener);
	}

	refreshView();
    }

    private void applyTermOptions() {
	inApplyingModel = true;
	try {
	    fontSizeSpinner.setValue(termOptions.getFontSize());
	    fontText.setText(termOptions.getFont().getFamily()
		    + " " + // NOI18N
		    termOptions.getFont().getSize());
	    foregroundComboBox.setSelectedColor(termOptions.getForeground());
	    backgroundComboBox.setSelectedColor(termOptions.getBackground());
	    selectionComboBox.setSelectedColor(termOptions.getSelectionBackground());
	    historySizeSpinner.setValue(termOptions.getHistorySize());
	    tabSizeSpinner.setValue(termOptions.getTabSize());
	    // Without this check we will get an
	    // IllegalStateException: Attempt to mutate in notification
	    if (!changingSelectByWordText) {
		selectByWordTextField.setText(termOptions.getSelectByWordDelimiters());
	    }
	    clickToTypeCheckBox.setSelected(termOptions.getClickToType());
	    scrollOnInputCheckBox.setSelected(termOptions.getScrollOnInput());
	    scrollOnOutputCheckBox.setSelected(termOptions.getScrollOnOutput());
	    lineWrapCheckBox.setSelected(termOptions.getLineWrap());
	    ignoreKeymapCheckBox.setSelected(termOptions.getIgnoreKeymap());
	    altSendsEscapeCheckBox.setSelected(termOptions.getAltSendsEscape());
	} finally {
	    inApplyingModel = false;
	}
    }

    private void refreshView() {
	if (termOptions != null) {
	    termOptions.removePropertyChangeListener(propertyListener);
	}

	try {
	    applyTermOptions();
	} finally {
	    if (termOptions != null) {
		termOptions.addPropertyChangeListener(propertyListener);
	    }
	}
	previewTermOptions();
    }

    /**
     * Apply current models values to the preview area Term.
     */
    private void previewTermOptions() {
	if (term == null) {
	    return;
	}

	term.setFixedFont(true);
	term.setFont(termOptions.getFont());

	term.setBackground(termOptions.getBackground());
	term.setForeground(termOptions.getForeground());
	term.setHighlightColor(termOptions.getSelectionBackground());
	term.setHistorySize(termOptions.getHistorySize());
	term.setTabSize(termOptions.getTabSize());
	term.setSelectByWordDelimiters(termOptions.getSelectByWordDelimiters());

	term.setClickToType(termOptions.getClickToType());
	term.setScrollOnInput(termOptions.getScrollOnInput());
	term.setScrollOnOutput(termOptions.getScrollOnOutput());
	term.setHorizontallyScrollable(!termOptions.getLineWrap());
	term.setAltSendsEscape(termOptions.getAltSendsEscape());

	term.setRowsColumns(7, 60);

	patchSizes();
    }

    /**
     * Adjust dialog size and layout. * If the chosen font size is >= 14 the
     * term preview area grows too large for the dialog (I think). The result is
     * that the term preview area, button sizes and the font name textarea all
     * shrink to a point.
     *
     * This is an attempt to force the dialog to resize itself but it doesn't
     * work.
     */
    private void patchSizes() {
	term.invalidate();
	previewPanel.validate();

	previewPanel.invalidate();
	this.validate();

	this.invalidate();
    }
}
