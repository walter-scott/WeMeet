/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupem;

import static groupem.GroupEm.getEvent;
import static groupem.GroupEm.userUsername;
import static groupem.GroupEm.loggedIn;
import static groupem.GroupEm.userEventNames;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Home Page for GroupEm
 * CSC 3380 Project
 * @author Walter Scott, Ian Andrepont, Leigh Wright, Scott Walker
 * @since 11/27/18
 * @see GroupEm, Login, Event, EventPage, CreatePage
 */

public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new HomePage
     */
    public HomePage() {
        initComponents();
        int userEventAmount = 0;
        your_events_label.setText(userUsername + "'s Events");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        logout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        your_events_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(682, 318));
        setPreferredSize(new java.awt.Dimension(599, 451));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        jList1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jList1.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            String[] strings = userEventNames;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSize(new java.awt.Dimension(180, 252));
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 100, 360, 260);

        logout.setFont(new java.awt.Font("Effra", 0, 13)); // NOI18N
        logout.setText("  log out  ");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(20, 400, 110, 30);

        jButton2.setFont(new java.awt.Font("Effra", 0, 13)); // NOI18N
        jButton2.setText("create event");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 400, 120, 29);

        your_events_label.setFont(new java.awt.Font("Effra", 0, 36)); // NOI18N
        your_events_label.setForeground(new java.awt.Color(112, 137, 182));
        your_events_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        your_events_label.setText("Your Events: ");
        your_events_label.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                your_events_labelComponentShown(evt);
            }
        });
        getContentPane().add(your_events_label);
        your_events_label.setBounds(10, 20, 430, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomePage.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 460, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        setVisible(false);
        String s = jList1.getSelectedValue();
        System.out.println(s);
        
        Event ev = getEvent(s);
        System.out.println(ev);
        EventPage e = new EventPage(ev);
        e.setResizable(false);
        e.setSize(451,487);
        e.setLocationRelativeTo(this);
        e.setVisible(true);
        
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CreateEventPage c = new CreateEventPage();
        c.setSize(451,487);
        c.setLocationRelativeTo(this);
        c.setResizable(false);
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        //userEvents = null;
        userEventNames = null;
        userUsername = null;
        loggedIn = false;
        Login l = new Login(this, true);
        l.setResizable(false);
        l.setSize(326, 348);
        l.setLocationRelativeTo(this);
        l.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        l.setVisible(true);
        
        
    }//GEN-LAST:event_logoutActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        System.out.println("HOMEPAGE ---  X: " + getX() + "   Y: " + getY() + "    height: " + this.getSize().height +  "  width: " + this.getSize().width);
        //HOMEPAGE ---  X: 623   Y: 318    height: 451  width: 599
    }//GEN-LAST:event_formComponentMoved

    private void your_events_labelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_your_events_labelComponentShown
        your_events_label.setText(userUsername + "'s Events");
    }//GEN-LAST:event_your_events_labelComponentShown

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel your_events_label;
    // End of variables declaration//GEN-END:variables
}
