package view;
import java.util.ArrayList;

import controller.ClienteController;
import controller.ConsultaController;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Atendimento;
import model.Medico;

public class CancelarExame extends javax.swing.JFrame {
    private Medico medico;
    private Atendimento consulta = new Atendimento();
    

    public CancelarExame() {
        super("Agendamento de Consulta");
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButtonCancelarConsulta = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelConsulta = new javax.swing.JLabel();
        jTextCpf = new javax.swing.JFormattedTextField();
        jNome3 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Cancelar um Exame");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 30, 193, 34);

        jButtonCancelarConsulta.setBackground(new java.awt.Color(0, 102, 204));
        jButtonCancelarConsulta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCancelarConsulta.setText("Cancelar selecionado");
        jButtonCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarConsulta);
        jButtonCancelarConsulta.setBounds(60, 300, 150, 43);

        jButtonVoltar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonVoltar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseClicked(evt);
            }
        });
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(260, 300, 150, 43);

        jLabelConsulta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabelConsulta.setText("Escolha o exame a cancelar:");
        getContentPane().add(jLabelConsulta);
        jLabelConsulta.setBounds(20, 240, 170, 30);

        try {
            jTextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextCpfMouseExited(evt);
            }
        });
        jTextCpf.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextCpfInputMethodTextChanged(evt);
            }
        });
        jTextCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCpfActionPerformed(evt);
            }
        });
        jTextCpf.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextCpfPropertyChange(evt);
            }
        });
        jTextCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCpfKeyPressed(evt);
            }
        });
        getContentPane().add(jTextCpf);
        jTextCpf.setBounds(199, 100, 220, 33);

        jNome3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome3.setText("Cpf do Cliente");
        getContentPane().add(jNome3);
        jNome3.setBounds(20, 100, 120, 30);

        jComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxMouseClicked(evt);
            }
        });
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox);
        jComboBox.setBounds(200, 240, 220, 30);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 160, 220, 40);

        jLabel3.setText("Consultar CPF");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 150, 150, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 470, 420);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(489, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarMouseClicked

    private void jButtonCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarConsultaActionPerformed
    	ConsultaController consul = new ConsultaController();
        Atendimento cons = (Atendimento) jComboBox.getSelectedItem();
    	if( consul.cancelarConsulta(cons.getId()) ) {
            JOptionPane.showMessageDialog(null, "Exame Cancelado com Sucesso!!!");
            this.dispose();
        }
        
    }//GEN-LAST:event_jButtonCancelarConsultaActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jTextCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCpfActionPerformed
       
    	
    }//GEN-LAST:event_jTextCpfActionPerformed

    private void jTextCpfPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextCpfPropertyChange
        
        
    }//GEN-LAST:event_jTextCpfPropertyChange

    private void jTextCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCpfKeyPressed
       
    }//GEN-LAST:event_jTextCpfKeyPressed

    private void jTextCpfInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextCpfInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCpfInputMethodTextChanged

    private void jTextCpfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextCpfMouseExited
        
    }//GEN-LAST:event_jTextCpfMouseExited

    private void jComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMouseClicked

    	
    }//GEN-LAST:event_jComboBoxMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(! jTextCpf.getText().equals("   .   .   -  ")){
        jComboBox.removeAllItems();
        ConsultaController consul = new ConsultaController();

        ArrayList<Atendimento> atend = consul.pesquisarExameCPF(jTextCpf.getText());
        if(atend != null){
    		for(int i=0;i<atend.size();i++){
    			jComboBox.addItem(atend.get(i));
                }
        }
    	
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelarExame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelarConsulta;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<Object> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNome3;
    private javax.swing.JFormattedTextField jTextCpf;
    // End of variables declaration//GEN-END:variables

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Atendimento getConsulta() {
        return consulta;
    }

    public void setConsulta(Atendimento consulta) {
        this.consulta = consulta;
    }
    
    
    
}
