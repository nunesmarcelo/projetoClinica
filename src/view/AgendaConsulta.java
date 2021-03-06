package view;
import controller.MedicoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Medico;

public class AgendaConsulta extends javax.swing.JFrame {
    private ArrayList<Medico> med ;

    public AgendaConsulta() {
    	super("Agendamento de Consulta");
    	initComponents();
         
        MedicoController medico = new MedicoController();
        
        med = medico.pesquisarMedico();
        int i;
        for(i=0;i<med.size();i++){
            jComboBoxEspecialidade.addItem(med.get(i).getEspecialidade());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jNome7 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jComboBoxConsulta = new javax.swing.JComboBox<>();
        jNome8 = new javax.swing.JLabel();
        jComboBoxEspecialidade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Agendar uma Consulta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(146, 21, 228, 34);

        jNome7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome7.setText("Selecione um médico:");
        getContentPane().add(jNome7);
        jNome7.setBounds(100, 190, 158, 34);

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(100, 282, 121, 43);

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCancelar.setText("Voltar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(285, 282, 127, 43);

        jComboBoxConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxConsulta);
        jComboBoxConsulta.setBounds(100, 228, 312, 36);

        jNome8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome8.setText("Selecione uma especialidade:");
        getContentPane().add(jNome8);
        jNome8.setBounds(100, 96, 158, 34);

        jComboBoxEspecialidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEspecialidadeItemStateChanged(evt);
            }
        });
        jComboBoxEspecialidade.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxEspecialidadePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialidadeActionPerformed(evt);
            }
        });
        jComboBoxEspecialidade.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxEspecialidadePropertyChange(evt);
            }
        });
        getContentPane().add(jComboBoxEspecialidade);
        jComboBoxEspecialidade.setBounds(100, 136, 312, 36);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 350);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(529, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        AgendaConsulta_Passo2 agenda2 = new AgendaConsulta_Passo2();
        agenda2.setMedico((Medico)(jComboBoxConsulta.getSelectedItem()));
        agenda2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jComboBoxConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxConsultaActionPerformed

    private void jComboBoxEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspecialidadeActionPerformed

    private void jComboBoxEspecialidadePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadePropertyChange
       
        
    }//GEN-LAST:event_jComboBoxEspecialidadePropertyChange

    private void jComboBoxEspecialidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadeItemStateChanged
        
    }//GEN-LAST:event_jComboBoxEspecialidadeItemStateChanged

    private void jComboBoxEspecialidadePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadePopupMenuWillBecomeInvisible
        if(this.getMed() != null){
            jComboBoxConsulta.removeAllItems();
            for(int i=0; i<this.getMed().size();i++){
                if(this.getMed().get(i).getEspecialidade().equals(this.jComboBoxEspecialidade.getSelectedItem())){
                    jComboBoxConsulta.addItem(med.get(i));
                }
            }
        } 
    }//GEN-LAST:event_jComboBoxEspecialidadePopupMenuWillBecomeInvisible

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<Object> jComboBoxConsulta;
    private javax.swing.JComboBox<Object> jComboBoxEspecialidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNome7;
    private javax.swing.JLabel jNome8;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Medico> getMed() {
        return med;
    }

    public void setMed(ArrayList<Medico> med) {
        this.med = med;
    }


    
}
