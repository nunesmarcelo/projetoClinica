package view;
import controller.MedicoController;
import javax.swing.JOptionPane;
import model.Medico;

public class CadastroMedico extends javax.swing.JFrame {
    private Medico medico = new Medico();
   

    public CadastroMedico() {
        super("Cadastrar Médico");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        jEspecialidade = new javax.swing.JLabel();
        jNome1 = new javax.swing.JLabel();
        jNome2 = new javax.swing.JLabel();
        jNome3 = new javax.swing.JLabel();
        jNome4 = new javax.swing.JLabel();
        jNome5 = new javax.swing.JLabel();
        jNome6 = new javax.swing.JLabel();
        jNome7 = new javax.swing.JLabel();
        jNome8 = new javax.swing.JLabel();
        jNome9 = new javax.swing.JLabel();
        jEspecialidade1 = new javax.swing.JLabel();
        jEspecialidade2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextEspecialidade = new javax.swing.JTextField();
        jTextEndereco = new javax.swing.JTextField();
        jTextBairro = new javax.swing.JTextField();
        jTextCidade = new javax.swing.JTextField();
        jTextCrm = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextDataNasc = new javax.swing.JFormattedTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextCpf = new javax.swing.JFormattedTextField();
        jTextRg = new javax.swing.JFormattedTextField();
        jTextTelefone = new javax.swing.JFormattedTextField();
        jTextCelular = new javax.swing.JFormattedTextField();
        jTextSalario = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Cadastro de Médico");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 11, 200, 34);

        jNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome.setText("Nome");
        getContentPane().add(jNome);
        jNome.setBounds(45, 59, 64, 16);

        jEspecialidade.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jEspecialidade.setText("Especialidade");
        getContentPane().add(jEspecialidade);
        jEspecialidade.setBounds(481, 401, 71, 37);

        jNome1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome1.setText("Cpf");
        getContentPane().add(jNome1);
        jNome1.setBounds(488, 59, 64, 16);

        jNome2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome2.setText("RG");
        getContentPane().add(jNome2);
        jNome2.setBounds(44, 120, 64, 16);

        jNome3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome3.setText("E-mail");
        getContentPane().add(jNome3);
        jNome3.setBounds(44, 348, 64, 16);

        jNome4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome4.setText("Endereço");
        getContentPane().add(jNome4);
        jNome4.setBounds(44, 183, 64, 16);

        jNome5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome5.setText("Bairro");
        getContentPane().add(jNome5);
        jNome5.setBounds(44, 234, 64, 16);

        jNome6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome6.setText("Cidade");
        getContentPane().add(jNome6);
        jNome6.setBounds(481, 234, 64, 16);

        jNome7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome7.setText("Data Nasc.");
        getContentPane().add(jNome7);
        jNome7.setBounds(488, 120, 64, 16);

        jNome8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome8.setText("Telefone");
        getContentPane().add(jNome8);
        jNome8.setBounds(44, 291, 64, 29);

        jNome9.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome9.setText("Celular");
        getContentPane().add(jNome9);
        jNome9.setBounds(481, 293, 64, 16);

        jEspecialidade1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jEspecialidade1.setText("CRM");
        getContentPane().add(jEspecialidade1);
        jEspecialidade1.setBounds(481, 338, 71, 37);

        jEspecialidade2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jEspecialidade2.setText("Salário");
        getContentPane().add(jEspecialidade2);
        jEspecialidade2.setBounds(44, 401, 64, 37);

        jTextNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextNome);
        jTextNome.setBounds(113, 51, 287, 33);

        jTextEspecialidade.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextEspecialidade);
        jTextEspecialidade.setBounds(556, 401, 288, 37);

        jTextEndereco.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jTextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEndereco);
        jTextEndereco.setBounds(112, 175, 732, 33);

        jTextBairro.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextBairro);
        jTextBairro.setBounds(112, 226, 288, 33);

        jTextCidade.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextCidade);
        jTextCidade.setBounds(555, 226, 288, 33);

        jTextCrm.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextCrm);
        jTextCrm.setBounds(556, 340, 287, 33);

        jTextEmail.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextEmail);
        jTextEmail.setBounds(112, 346, 288, 37);

        try {
            jTextDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextDataNasc);
        jTextDataNasc.setBounds(556, 112, 288, 33);

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(319, 456, 96, 43);

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCancelar.setText("Voltar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(500, 456, 96, 43);

        try {
            jTextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextCpf);
        jTextCpf.setBounds(556, 51, 288, 33);

        try {
            jTextRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextRg);
        jTextRg.setBounds(112, 112, 288, 33);

        try {
            jTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextTelefone);
        jTextTelefone.setBounds(112, 283, 288, 37);

        try {
            jTextCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextCelular);
        jTextCelular.setBounds(555, 283, 288, 37);

        try {
            jTextSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextSalario);
        jTextSalario.setBounds(112, 401, 288, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 510);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(905, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEnderecoActionPerformed

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if(!this.jTextNome.getText().isEmpty()){
        this.getMedico().setNome(this.jTextNome.getText());
        this.getMedico().setBairro(this.jTextBairro.getText());
        this.getMedico().setCelular(this.jTextCelular.getText());
        this.getMedico().setCidade(this.jTextCidade.getText());
        this.getMedico().setCpf(this.jTextCpf.getText());
        this.getMedico().setCrm(this.jTextCrm.getText());
        if(this.jTextDataNasc.getText().equals("  /  /    ")){
            this.getMedico().setDataNasc("11/11/1111");
        }
        else{
            this.getMedico().setDataNasc(this.jTextDataNasc.getText());
        }
        
        this.getMedico().setEmail(this.jTextEmail.getText());
        this.getMedico().setEndereco(this.jTextEndereco.getText());
        this.getMedico().setEspecialidade(this.jTextEspecialidade.getText());
        this.getMedico().setRg(this.jTextRg.getText());
        this.getMedico().setSalario(this.jTextSalario.getText());
        this.getMedico().setTelefone(this.jTextTelefone.getText());
                
        MedicoController medController = new MedicoController();
        medController.cadastrarMedico(medico);
        this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Necessário informar um nome!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jEspecialidade;
    private javax.swing.JLabel jEspecialidade1;
    private javax.swing.JLabel jEspecialidade2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNome1;
    private javax.swing.JLabel jNome2;
    private javax.swing.JLabel jNome3;
    private javax.swing.JLabel jNome4;
    private javax.swing.JLabel jNome5;
    private javax.swing.JLabel jNome6;
    private javax.swing.JLabel jNome7;
    private javax.swing.JLabel jNome8;
    private javax.swing.JLabel jNome9;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JFormattedTextField jTextCelular;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JFormattedTextField jTextCpf;
    private javax.swing.JTextField jTextCrm;
    private javax.swing.JFormattedTextField jTextDataNasc;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextEspecialidade;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JFormattedTextField jTextRg;
    private javax.swing.JFormattedTextField jTextSalario;
    private javax.swing.JFormattedTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
}
