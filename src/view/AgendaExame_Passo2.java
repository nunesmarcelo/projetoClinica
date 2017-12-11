package view;
import controller.ConsultaController;
import controller.MedicoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Atendimento;
import model.Exame;
import model.Medico;

public class AgendaExame_Passo2 extends javax.swing.JFrame {
    private Exame exame;
    private String dataPesq;

    public AgendaExame_Passo2() {
        super("Agendamento de Exame");
        initComponents();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jDayChooser = new com.toedter.calendar.JDayChooser();
        jNome = new javax.swing.JLabel();
        jNome1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabelEspecialidade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Agendar um Exame");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 30, 228, 34);

        jDayChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDayChooserMouseClicked(evt);
            }
        });
        jDayChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDayChooserPropertyChange(evt);
            }
        });
        getContentPane().add(jDayChooser);
        jDayChooser.setBounds(70, 149, 390, 220);

        jNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome.setText("Escolha um dia");
        getContentPane().add(jNome);
        jNome.setBounds(80, 120, 106, 16);

        jNome1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome1.setText("Escolha um horário");
        getContentPane().add(jNome1);
        jNome1.setBounds(90, 370, 106, 33);

        jComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxPropertyChange(evt);
            }
        });
        getContentPane().add(jComboBox);
        jComboBox.setBounds(110, 400, 314, 33);
        getContentPane().add(jLabelEspecialidade);
        jLabelEspecialidade.setBounds(370, 80, 128, 40);

        jLabel1.setText("Exame:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 80, 104, 40);


        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(120, 450, 121, 43);

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCancelar.setText("Voltar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(290, 450, 127, 43);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 550, 510);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(562, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
            AgendaExame_Passo3 agenda3 = new AgendaExame_Passo3();
            agenda3.setExame(this.getExame());
            agenda3.getConsulta().setHorario((String) this.jComboBox.getSelectedItem());
            agenda3.getConsulta().setDia(this.getDataPesq());
            agenda3.setVisible(true);
            this.dispose();
            
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxPropertyChange
        
    }//GEN-LAST:event_jComboBoxPropertyChange

    private void jDayChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDayChooserMouseClicked
            
    }//GEN-LAST:event_jDayChooserMouseClicked

    private void jDayChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDayChooserPropertyChange
        if(this.getExame() != null){
            jComboBox.removeAllItems();
            this.jLabelEspecialidade.setText(this.getExame().getNome());
        
            Calendar cal = Calendar.getInstance();
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            this.setDataPesq(year+"-"+month+"-"+jDayChooser.getDay());
            ConsultaController consulta = new ConsultaController();
            
            ArrayList<Atendimento> cons = consulta.pesquisarConsultaExame(this.getDataPesq(), this.getExame().getNome());
            
            String horario;
            int horas = 8;
            String min = "00";
            boolean jaUsado = false;
            for(int i=0;i<18;i++){
                horario = horas+":"+min;
                if(cons != null){
                    System.err.println("aqui"+cons+ " vamo ver");
                    for(int j=0;j<cons.size();j++){
                        if(cons.get(j).getHorario().equals(horario)){
                            jaUsado = true;
                        }
                        
                    }
                }
                if(!jaUsado){
                     jComboBox.addItem(horario);
                }
                jaUsado = false;
               
                 if(min.equals("30")){
                    horas++;
                    min = "00";
                 }
                 else{
                     min = "30";
                 }
            }
        }
        
        
        
    }//GEN-LAST:event_jDayChooserPropertyChange

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaExame_Passo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<Object> jComboBox;
    private com.toedter.calendar.JDayChooser jDayChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDoutor;
    private javax.swing.JLabel jLabelEspecialidade;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNome1;
    // End of variables declaration//GEN-END:variables

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public String getDataPesq() {
        return dataPesq;
    }

    public void setDataPesq(String dataPesq) {
        this.dataPesq = dataPesq;
    }


    
}
