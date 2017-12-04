package view;
import controller.ClienteController;
import javax.swing.JOptionPane;
import model.Cliente;

public class CadastroCliente extends javax.swing.JFrame {
    private Cliente cliente = new Cliente();
   

    public CadastroCliente() {
        super("Cadastrar Cliente");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        jNome1 = new javax.swing.JLabel();
        jNome2 = new javax.swing.JLabel();
        jNome3 = new javax.swing.JLabel();
        jNome4 = new javax.swing.JLabel();
        jNome5 = new javax.swing.JLabel();
        jNome6 = new javax.swing.JLabel();
        jNome7 = new javax.swing.JLabel();
        jNome8 = new javax.swing.JLabel();
        jNome9 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextEndereco = new javax.swing.JTextField();
        jTextBairro = new javax.swing.JTextField();
        jTextCidade = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextDataNasc = new javax.swing.JFormattedTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextCpf = new javax.swing.JFormattedTextField();
        jTextRg = new javax.swing.JFormattedTextField();
        jTextTelefone = new javax.swing.JFormattedTextField();
        jTextCelular = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Cadastro de Cliente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(354, 11, 202, 34);

        jNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome.setText("Nome");
        getContentPane().add(jNome);
        jNome.setBounds(51, 59, 64, 16);

        jNome1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome1.setText("Cpf");
        getContentPane().add(jNome1);
        jNome1.setBounds(494, 59, 64, 16);

        jNome2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome2.setText("RG");
        getContentPane().add(jNome2);
        jNome2.setBounds(50, 120, 64, 16);

        jNome3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome3.setText("E-mail");
        getContentPane().add(jNome3);
        jNome3.setBounds(50, 356, 64, 16);

        jNome4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome4.setText("Endereço");
        getContentPane().add(jNome4);
        jNome4.setBounds(50, 183, 64, 16);

        jNome5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome5.setText("Bairro");
        getContentPane().add(jNome5);
        jNome5.setBounds(50, 234, 64, 16);

        jNome6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome6.setText("Cidade");
        getContentPane().add(jNome6);
        jNome6.setBounds(487, 234, 64, 16);

        jNome7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome7.setText("Data Nasc.");
        getContentPane().add(jNome7);
        jNome7.setBounds(494, 120, 64, 16);

        jNome8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome8.setText("Telefone");
        getContentPane().add(jNome8);
        jNome8.setBounds(50, 291, 64, 34);

        jNome9.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome9.setText("Celular");
        getContentPane().add(jNome9);
        jNome9.setBounds(487, 298, 64, 16);

        jTextNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextNome);
        jTextNome.setBounds(119, 51, 287, 33);

        jTextEndereco.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jTextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEndereco);
        jTextEndereco.setBounds(118, 175, 732, 33);

        jTextBairro.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextBairro);
        jTextBairro.setBounds(118, 226, 288, 33);

        jTextCidade.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextCidade);
        jTextCidade.setBounds(561, 226, 288, 33);

        jTextEmail.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextEmail);
        jTextEmail.setBounds(118, 346, 288, 37);

        try {
            jTextDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextDataNasc);
        jTextDataNasc.setBounds(562, 112, 288, 33);

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(325, 456, 96, 43);

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCancelar.setText("Voltar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(506, 456, 96, 43);

        try {
            jTextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextCpf);
        jTextCpf.setBounds(562, 51, 288, 33);

        try {
            jTextRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextRg);
        jTextRg.setBounds(118, 112, 288, 33);

        try {
            jTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextTelefone);
        jTextTelefone.setBounds(118, 288, 288, 37);

        try {
            jTextCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextCelular);
        jTextCelular.setBounds(561, 283, 288, 42);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 520);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(911, 570));
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
        this.getCliente().setNome(this.jTextNome.getText());
        this.getCliente().setBairro(this.jTextBairro.getText());
        this.getCliente().setCelular(this.jTextCelular.getText());
        this.getCliente().setCidade(this.jTextCidade.getText());
        this.getCliente().setCpf(this.jTextCpf.getText());
        if(this.jTextDataNasc.getText().equals("  /  /    ")){
            this.getCliente().setDataNasc("11/11/1111");
        }
        else{
            this.getCliente().setDataNasc(this.jTextDataNasc.getText());
        }
        
        this.getCliente().setEmail(this.jTextEmail.getText());
        this.getCliente().setEndereco(this.jTextEndereco.getText());
        this.getCliente().setRg(this.jTextRg.getText());
        this.getCliente().setTelefone(this.jTextTelefone.getText());
                
        ClienteController clienteController = new ClienteController();
        clienteController.cadastrarCliente(cliente);
        this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Necessário informar um nome!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
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
    public javax.swing.JFormattedTextField jTextCpf;
    private javax.swing.JFormattedTextField jTextDataNasc;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEndereco;
    public javax.swing.JTextField jTextNome;
    private javax.swing.JFormattedTextField jTextRg;
    private javax.swing.JFormattedTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
