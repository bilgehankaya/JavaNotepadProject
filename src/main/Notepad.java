package main;
import Operations.*;
import java.awt.ComponentOrientation;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Notepad extends javax.swing.JFrame {
    OperationExecuter operationExecuter = new OperationExecuter();
    public FindPopUpWindow findWindow = new FindPopUpWindow();
    public Notepad() {
        initComponents();
        setTitle("Untitled - Notepad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        findWindow.setResizable(false);
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPopupMenu = new javax.swing.JPopupMenu();
        Undo = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        SelectAll = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        alignLeft = new javax.swing.JButton();
        alignJustified = new javax.swing.JButton();
        alignRight = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        SaveAs = new javax.swing.JMenuItem();
        sep1 = new javax.swing.JPopupMenu.Separator();
        Close = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undo = new javax.swing.JMenuItem();
        sep_1 = new javax.swing.JPopupMenu.Separator();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        sep_2 = new javax.swing.JPopupMenu.Separator();
        searchOnDictionary = new javax.swing.JMenuItem();
        find = new javax.swing.JMenuItem();
        findNext = new javax.swing.JMenuItem();
        findPrevious = new javax.swing.JMenuItem();
        replace = new javax.swing.JMenuItem();
        sep_3 = new javax.swing.JPopupMenu.Separator();
        selectAll = new javax.swing.JMenuItem();
        timeDate = new javax.swing.JMenuItem();

        Undo.setText("jMenuItem1");
        textPopupMenu.add(Undo);
        textPopupMenu.add(separator1);

        Cut.setText("jMenuItem2");
        textPopupMenu.add(Cut);

        Copy.setText("jMenuItem3");
        textPopupMenu.add(Copy);

        Paste.setText("jMenuItem4");
        textPopupMenu.add(Paste);
        textPopupMenu.add(separator2);

        SelectAll.setText("jMenuItem5");
        textPopupMenu.add(SelectAll);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        scrollPane.setViewportView(textArea);

        alignLeft.setIcon(new javax.swing.ImageIcon("D:\\GitProjects\\JavaNotepad\\src\\main\\align_left.png")); // NOI18N
        alignLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alignLeftActionPerformed(evt);
            }
        });

        alignJustified.setIcon(new javax.swing.ImageIcon("D:\\GitProjects\\JavaNotepad\\src\\main\\align_justified.png")); // NOI18N
        alignJustified.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alignJustifiedActionPerformed(evt);
            }
        });

        alignRight.setIcon(new javax.swing.ImageIcon("D:\\GitProjects\\JavaNotepad\\src\\main\\align_right.png")); // NOI18N
        alignRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alignRightActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setText("New");
        fileMenu.add(New);

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open...");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        fileMenu.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        fileMenu.add(Save);

        SaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SaveAs.setText("Save As...");
        SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
        fileMenu.add(SaveAs);
        fileMenu.add(sep1);

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        fileMenu.add(Close);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");

        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undo.setText("Undo");
        editMenu.add(undo);
        editMenu.add(sep_1);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setText("Cut");
        editMenu.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        editMenu.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste.setText("Paste");
        editMenu.add(paste);

        delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        delete.setText("Delete");
        editMenu.add(delete);
        editMenu.add(sep_2);

        searchOnDictionary.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        searchOnDictionary.setText("Search on Dictionary");
        searchOnDictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOnDictionaryActionPerformed(evt);
            }
        });
        editMenu.add(searchOnDictionary);

        find.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        find.setText("Find...");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        editMenu.add(find);

        findNext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        findNext.setText("Find Next");
        editMenu.add(findNext);

        findPrevious.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        findPrevious.setText("Find Previous");
        editMenu.add(findPrevious);

        replace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        replace.setText("Replace...");
        editMenu.add(replace);
        editMenu.add(sep_3);

        selectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectAll.setText("Select All");
        selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllActionPerformed(evt);
            }
        });
        editMenu.add(selectAll);

        timeDate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        timeDate.setText("Time/Date");
        editMenu.add(timeDate);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(alignLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alignJustified)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alignRight)
                .addContainerGap(468, Short.MAX_VALUE))
            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alignLeft)
                    .addComponent(alignJustified)
                    .addComponent(alignRight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(699, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        operationExecuter.executeStrategy(new CloseFile(this));
    }//GEN-LAST:event_CloseActionPerformed

    private void alignJustifiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alignJustifiedActionPerformed

    }//GEN-LAST:event_alignJustifiedActionPerformed

    private void alignRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alignRightActionPerformed
        operationExecuter.executeStrategy(new RightAligment(this));
    }//GEN-LAST:event_alignRightActionPerformed

    private void alignLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alignLeftActionPerformed
        operationExecuter.executeStrategy(new LeftAlignment(this));
    }//GEN-LAST:event_alignLeftActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        operationExecuter.executeStrategy(new OpenFile(this));
        
    }//GEN-LAST:event_OpenActionPerformed

    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsActionPerformed

    }//GEN-LAST:event_SaveAsActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        operationExecuter.executeStrategy(new Copy(this));
    }//GEN-LAST:event_copyActionPerformed

    private void searchOnDictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOnDictionaryActionPerformed
        operationExecuter.executeStrategy(new SearchOnDictionary(this));  
    }//GEN-LAST:event_searchOnDictionaryActionPerformed

    private void selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllActionPerformed
        findWindow.setText(textArea.getText());
        operationExecuter.executeStrategy(new SelectAll(this));        // TODO add your handling code here:
    }//GEN-LAST:event_selectAllActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
         findWindow.setVisible(true);
         
    }//GEN-LAST:event_findActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Close;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JMenuItem SelectAll;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JButton alignJustified;
    private javax.swing.JButton alignLeft;
    private javax.swing.JButton alignRight;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem find;
    private javax.swing.JMenuItem findNext;
    private javax.swing.JMenuItem findPrevious;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem replace;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JMenuItem searchOnDictionary;
    private javax.swing.JMenuItem selectAll;
    private javax.swing.JPopupMenu.Separator sep1;
    private javax.swing.JPopupMenu.Separator sep_1;
    private javax.swing.JPopupMenu.Separator sep_2;
    private javax.swing.JPopupMenu.Separator sep_3;
    private javax.swing.JPopupMenu.Separator separator1;
    private javax.swing.JPopupMenu.Separator separator2;
    public javax.swing.JTextArea textArea;
    private javax.swing.JPopupMenu textPopupMenu;
    private javax.swing.JMenuItem timeDate;
    private javax.swing.JMenuItem undo;
    // End of variables declaration//GEN-END:variables
}
