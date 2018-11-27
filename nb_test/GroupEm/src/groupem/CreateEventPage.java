/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupem;

import static groupem.GroupEm.eventss;
import static groupem.GroupEm.updateUserEvents;
import static groupem.GroupEm.userUsername;


/**
 * Create Event Page for GroupEm
 * CSC 3380 Project
 * @author Walter Scott, Ian Andrepont, Leigh Wright, Scott Walker
 * @since 11/27/18
 * @see GroupEm, Login, Event, HomePage, EventPage
 */

public class CreateEventPage extends javax.swing.JFrame {

    /**
     * Creates new CreateEventPage
     */
    public CreateEventPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        cancelCreate = new javax.swing.JButton();
        big_G_create_page = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(682, 318));
        setPreferredSize(new java.awt.Dimension(599, 451));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Effra", 0, 13)); // NOI18N
        jLabel1.setText("Event Name: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 170, 90, 16);

        jLabel2.setFont(new java.awt.Font("Effra", 0, 13)); // NOI18N
        jLabel2.setText("Event Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 210, 90, 16);

        jLabel3.setFont(new java.awt.Font("Effra", 0, 13)); // NOI18N
        jLabel3.setText("Event Description:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 240, 230, 20);

        nameText.setBorder(null);
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText);
        nameText.setBounds(170, 170, 220, 16);

        dateText.setBorder(null);
        getContentPane().add(dateText);
        dateText.setBounds(170, 210, 220, 16);

        descText.setColumns(20);
        descText.setRows(5);
        descText.setBorder(null);
        jScrollPane1.setViewportView(descText);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 270, 320, 120);

        jLabel4.setFont(new java.awt.Font("Effra", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 137, 182));
        jLabel4.setText("Create New Event");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 100, 304, 43);

        createButton.setFont(new java.awt.Font("Effra", 0, 13)); // NOI18N
        createButton.setText("create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createButton);
        createButton.setBounds(340, 410, 82, 29);

        cancelCreate.setFont(new java.awt.Font("Effra", 0, 13)); // NOI18N
        cancelCreate.setText("cancel");
        cancelCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCreateActionPerformed(evt);
            }
        });
        getContentPane().add(cancelCreate);
        cancelCreate.setBounds(20, 410, 84, 29);

        big_G_create_page.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CreateEvent.jpg"))); // NOI18N
        big_G_create_page.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                big_G_create_pageComponentMoved(evt);
            }
        });
        getContentPane().add(big_G_create_page);
        big_G_create_page.setBounds(0, 0, 450, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        System.out.println(eventss.toString());
        Event e = new Event(nameText.getText(), userUsername, descText.getText(), dateText.getText());
        e.addInvitee(userUsername);
        eventss.add(e);
        updateUserEvents(userUsername);
        dispose();
        System.out.println(eventss.toString());
        HomePage hp9 = new HomePage();
        hp9.setResizable(false);
        hp9.setSize(451,487);
        hp9.setLocationRelativeTo(this);
        hp9.setVisible(true);
    }//GEN-LAST:event_createButtonActionPerformed

    private void cancelCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCreateActionPerformed

        dispose();
        HomePage hp1 = new HomePage();
        hp1.setResizable(false);
        hp1.setSize(451,487);
        hp1.setLocationRelativeTo(this);
        hp1.setVisible(true);
    }//GEN-LAST:event_cancelCreateActionPerformed

    private void big_G_create_pageComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_big_G_create_pageComponentMoved
        System.out.println("CREATE PAGE ---  X: " + getX() + "   Y: " + getY() + "    height: " + this.getSize().height +  "  width: " + this.getSize().width);
    }//GEN-LAST:event_big_G_create_pageComponentMoved

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        System.out.println("CREATE PAGE ---  X: " + getX() + "   Y: " + getY() + "    height: " + this.getSize().height +  "  width: " + this.getSize().width);
    }//GEN-LAST:event_formComponentMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateEventPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateEventPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateEventPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateEventPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEventPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel big_G_create_page;
    private javax.swing.JButton cancelCreate;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextArea descText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    // End of variables declaration//GEN-END:variables
}
