
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculadora extends JFrame {

    public JPanel panel;
    private JTextField interficie;
    private JLabel saludo;
    private JLabel saludo2;
    private JLabel saludo3;
    private JLabel saludo4;
    private JLabel saludo5;
    private String dato1;
    private String operacion;
    double resultado;
    float num1,num2;
    char signo;


    JFrame frame = new JFrame("Suma");
    JTextField fieldNum1 = new JTextField();
    JTextField fieldNum2 = new JTextField();
    JButton btnCalcular = new JButton("Calcular");
    JLabel labelResultado = new JLabel("");
/*
    /** para guardar la operacion a realizar


    /** Los paneles donde colocaremos los botones
    JPanel panelNumeros, panelOperaciones;

    /** Indica si estamos iniciando o no una operación
    boolean nuevaOperacion = true;
    */

    //////////////////////////////////////////////////////////////////////CALCULADORA///////////////////////////
    public Calculadora() {                                                                               //
        setSize(500, 500);                                                                    //
        setTitle("Calculadora_AngelRomeroSanchez");                                                       //
        setMinimumSize(new Dimension(200, 200));                                              //
        iniciarComponentsCalculadora();                                                                   //
        setDefaultCloseOperation(EXIT_ON_CLOSE);                                                          //
        setLocationRelativeTo(null);                                                                      //
    }                                                                                                     //
    ///////////////////////////////////////////////////////////////////////INICIAR//////////////////////////////
    private void iniciarComponentsCalculadora() {                                                          //
        colocarPaneles();                                                                                 //
        interficie();                                                                                     //
        botonesnumeros();                                                                                 //
        botonesaritmeticos();                                                                             //
        botonesespeciales();                                                                              //
    }                                                                                                      //
    ///////////////////////////////////////////////////////////////////////PANELES//////////////////////////////
    private void colocarPaneles() {                                                                        //
        panel = new JPanel();                                                                             //
        panel.setLayout(null);                                                                            //
        panel.setBackground(Color.GRAY);                                                                  //
        this.getContentPane().add(panel);                                                                 //
    }                                                                                                     //
    ///////////////////////////////////////////////////////////////////////INTERFICIE///////////////////////////
    private void interficie() {                                                                            //
        interficie = new JTextField();                                                                    //
        interficie.setBounds(10, 20, 465, 50);                                             //
        interficie.setFont(new Font("arial", 3, 25));                                        //
        panel.add(interficie);                                                                               //
        JOptionPane.showMessageDialog(frame,                                                                 //
                "Pulsa el boton para empezar a calcular", "Bienvenido",                                 //
                JOptionPane.INFORMATION_MESSAGE);                                                            //
                                                                                                             //
        interficie.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {                                            //
                String value = interficie.getText();                                                         //
                int l = value.length();                                                                      //
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {                                      //
                    interficie.setEditable(true);                                                            //
                } else if (ke.getKeyChar() == '.') {                                                         //
                    interficie.setEditable(true);                                                            //
                } else if (ke.getKeyCode() == 8) {                                                           //
                    interficie.setEditable(true);                                                            //
                } else {                                                                                     //
                    interficie.setEditable(false);                                                           //
                }                                                                                            //
            }
        });                                                                                                  //
    }                                                                                                        //
    ///////////////////////////////////////////////////////////////////////BOTONESNUM///////BOTON1////////////
    private void botonesnumeros() {                                                                        //
        JButton boton1 = new JButton();                                                                   //
        boton1.setText("7");                                                                              //
        boton1.setBounds(10, 160, 100, 50);                                             //
        boton1.setEnabled(true);                                                                          //
        boton1.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton1.setFont(new Font("arial", 3, 20));                                          //
                                                                                                          //
        panel.add(boton1);                                                                                //
////////////////////////////////////////////////////////////////////////BOTON2//////////////////////////////
        JButton boton2 = new JButton();                                                                   //
        boton2.setText("8");                                                                              //
        boton2.setBounds(130, 160, 100, 50);                                            //
        boton2.setEnabled(true);                                                                          //
        boton2.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton2.setFont(new Font("arial", 3, 20));                                         //
        panel.add(boton2);                                                                                //
/////////////////////////////////////////////////////////////////////////BOTON3/////////////////////////////
        JButton boton3 = new JButton();                                                                   //
        boton3.setText("9");                                                                              //
        boton3.setBounds(250, 160, 100, 50);                                            //
        boton3.setEnabled(true);                                                                          //
        boton3.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton3.setFont(new Font("arial", 3, 20));                                          //
        panel.add(boton3);                                                                                //
//////////////////////////////////////////////////////////////////////////BOTON4////////////////////////////
        JButton boton4 = new JButton();                                                                   //
        boton4.setText("6");                                                                              //
        boton4.setBounds(250, 230, 100, 50);                                             //
        boton4.setEnabled(true);                                                                          //
        boton4.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton4.setFont(new Font("arial", 3, 20));                                         //
        panel.add(boton4);                                                                                //
//////////////////////////////////////////////////////////////////////////BOTON5////////////////////////////
        JButton boton5 = new JButton();                                                                   //
        boton5.setText("5");                                                                              //
        boton5.setBounds(130, 230, 100, 50);                                            //
        boton5.setEnabled(true);                                                                          //
        boton5.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton5.setFont(new Font("arial", 3, 20));                                          //
        panel.add(boton5);                                                                                //
///////////////////////////////////////////////////////////////////////////BOTON6///////////////////////////
        JButton boton6 = new JButton();                                                                   //
        boton6.setText("4");                                                                              //
        boton6.setBounds(10, 230, 100, 50);                                             //
        boton6.setEnabled(true);                                                                          //
        boton6.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton6.setFont(new Font("arial", 3, 20));                                         //
        panel.add(boton6);                                                                                //
///////////////////////////////////////////////////////////////////////////BOTON7///////////////////////////
        JButton boton7 = new JButton();                                                                   //
        boton7.setText("3");                                                                              //
        boton7.setBounds(250, 300, 100, 50);                                            //
        boton7.setEnabled(true);                                                                          //
        boton7.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton7.setFont(new Font("arial", 3, 20));                                          //
        panel.add(boton7);                                                                                //
///////////////////////////////////////////////////////////////////////////BOTON8///////////////////////////
        JButton boton8 = new JButton();                                                                   //
        boton8.setText("2");                                                                              //
        boton8.setBounds(130, 300, 100, 50);                                            //
        boton8.setEnabled(true);                                                                          //
        boton8.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton8.setFont(new Font("arial", 3, 20));                                          //
        panel.add(boton8);                                                                                //
///////////////////////////////////////////////////////////////////////////BOTON9///////////////////////////
        JButton boton9 = new JButton();                                                                   //
        boton9.setText("1");                                                                              //
        boton9.setBounds(10, 300, 100, 50);                                             //
        boton9.setEnabled(true);                                                                          //
        boton9.setBackground(Color.WHITE);                                                                //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton9.setFont(new Font("arial", 3, 20));                                         //
        panel.add(boton9);                                                                                //
////////////////////////////////////////////////////////////////////////////BOTON10/////////////////////////
        JButton boton10 = new JButton();                                                                  //
        boton10.setText("00");                                                                            //
        boton10.setBounds(10, 370, 100, 50);                                            //
        boton10.setEnabled(true);                                                                         //
        boton10.setBackground(Color.WHITE);                                                               //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton10.setFont(new Font("arial", 3, 20));                                         //
        panel.add(boton10);                                                                               //
////////////////////////////////////////////////////////////////////////////BOTON11/////////////////////////
        JButton boton11 = new JButton();                                                                  //
        boton11.setText("0");                                                                             //
        boton11.setBounds(130, 370, 100, 50);                                           //
        boton11.setEnabled(true);                                                                         //
        boton11.setBackground(Color.WHITE);                                                               //
        //boton1.setBackground(Color.BLACK);                                                              //
        boton11.setFont(new Font("arial", 3, 20));                                         //
        panel.add(boton11);                                                                               //
        ////////////////////////////////////////////////////
        saludo = new JLabel();                                                                            //
        saludo.setBounds(50, 380, 150, 30);                                             //
        saludo.setFont(new Font("arial", 3, 15));                                          //
        panel.add(saludo);                                                                                //
//////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON1///////////////////
        ActionListener oyenteDeAccion = new ActionListener() {                                            //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {                                                  //
                interficie.setText(interficie.getText() + "7");                                           //
            }                                                                                             //
        };                                                                                                //
        boton1.addActionListener(oyenteDeAccion);                                                         //
        ;                                                                                                 //
///////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON2//////////////////
        ActionListener oyenteDeAccion2 = new ActionListener() {                                           //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "8");
            }//
        };                                                                                                //
        boton2.addActionListener(oyenteDeAccion2);                                                        //
        ;                                                                                                 //
////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON3/////////////////
        ActionListener oyenteDeAccion3 = new ActionListener() {                                           //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "9");
            }//
        };                                                                                                //
        boton3.addActionListener(oyenteDeAccion3);                                                        //
        ;                                                                                                 //
/////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON4////////////////
        ActionListener oyenteDeAccion4 = new ActionListener() {                                           //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "6");
            }//
        };                                                                                                //
        boton4.addActionListener(oyenteDeAccion4);                                                        //
//////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON5///////////////
        ActionListener oyenteDeAccion5 = new ActionListener() {                                           //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "5");
            }//
        };                                                                                                //
        boton5.addActionListener(oyenteDeAccion5);                                                        //
        ;                                                                                                 //
///////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON6//////////////
        ActionListener oyenteDeAccion6 = new ActionListener() {                                           //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "4");
            }//
        };                                                                                                //
        boton6.addActionListener(oyenteDeAccion6);                                                        //
        ;                                                                                                 //
////////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON7/////////////
        ActionListener oyenteDeAccion7 = new ActionListener() {                                           //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "3");
            }//
        };                                                                                                //
        boton7.addActionListener(oyenteDeAccion7);                                                        //
        ;                                                                                                 //
/////////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON8////////////
        ActionListener oyenteDeAccion8 = new ActionListener() {                                           //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "2");
            }//
        };                                                                                                //
        boton8.addActionListener(oyenteDeAccion8);                                                        //
        ;                                                                                                 //
//////////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON9///////////
        ActionListener oyenteDeAccion9 = new ActionListener() {                                           //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "1");
            }//
        };                                                                                                //
        boton9.addActionListener(oyenteDeAccion9);                                                        //
        ;                                                                                                 //
///////////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON10/////////
        ActionListener oyenteDeAccion10 = new ActionListener() {                                          //
            @Override                                                                                      //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "00");
            }//
        };                                                                                                //
        boton10.addActionListener(oyenteDeAccion10);                                                      //
        ;                                                                                                 //
///////////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTON11/////////
        ActionListener oyenteDeAccion11 = new ActionListener() {                                          //
            @Override                                                                                     //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + "0");
            }//
        };                                                                                                //
        boton11.addActionListener(oyenteDeAccion11);                                                      //
        ;                                                                                                 //
    }                                                                                                     //
    ////////////////////////////////////////////////////////////////////////////BOTONESESCPECIAL///BOTONES1//
    private void botonesespeciales() {                                                                    //
        JButton botones1 = new JButton();                                                                 //
        botones1.setText(".");                                                                            //
        botones1.setBounds(10, 100, 100, 50);                                           //
        botones1.setEnabled(true);                                                                        //
        botones1.setBackground(Color.LIGHT_GRAY);                                                         //
        //boton1.setBackground(Color.BLACK);                                                              //
        botones1.setFont(new Font("arial", 3, 20));                                        //
        panel.add(botones1);                                                                              //
//////////////////////////////////////////////////////////////////////////////BOTONESESCPECIAL///BOTONES2///
        JButton botones2 = new JButton();                                                                 //
        botones2.setText("AC");                                                                           //
        botones2.setBounds(130, 100, 100, 50);                                          //
        botones2.setEnabled(true);                                                                        //
        botones2.setBackground(Color.LIGHT_GRAY);                                                         //
        //boton1.setBackground(Color.BLACK);                                                              //
        botones2.setFont(new Font("arial", 3, 20));                                       //
        panel.add(botones2);                                                                              //
//////////////////////////////////////////////////////////////////////////////BOTONESESCPECIAL///BOTONES3///
        JButton botones3 = new JButton();                                                                 //
        botones3.setText("<-");                                                                           //
        botones3.setBounds(250, 100, 100, 50);                                          //
        botones3.setEnabled(true);                                                                       //
        botones3.setBackground(Color.LIGHT_GRAY);                                                        //
        //boton1.setBackground(Color.BLACK);                                                             //
        botones3.setFont(new Font("arial", 3, 20));                                       //
/////////////////////////////////////////////////////////////////////////////////BORRA/////////////////////
        ActionListener esborrar = new ActionListener() {                                                 //
            @Override                                                                                    //
            public void actionPerformed(ActionEvent e) {                                                 //
                if (interficie.getText().length() != 0) {                                                //
                    interficie.setText(interficie.getText().substring(0, interficie.getText().length() - 1));//
                } else {                                                                                 //
                    JOptionPane.showMessageDialog(null, "Vacio");                  //
                }                                                                                        //
            }                                                                                            //
        };                                                                                               //
        panel.add(botones3);                                                                             //
///////////////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTONES1///
        ActionListener oyenteDeAccion1 = new ActionListener() {                                          //
            @Override                                                                                    //
            public void actionPerformed(ActionEvent e) {
                interficie.setText(interficie.getText() + ".");
            }//
        };                                                                                              //
        botones1.addActionListener(oyenteDeAccion1);                                                    //
                                                                                                        //
///////////////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTONES2//
        ActionListener oyenteDeAccion2 = new ActionListener() {                                         //
            @Override                                                                                   //
            public void actionPerformed(ActionEvent e) {                                                //
                interficie.setText("");                                                                 //
            }                                                                                           //
        };                                                                                              //
        botones2.addActionListener(oyenteDeAccion2);                                                    //
                                                                                                        //
///////////////////////////////////////////////////////////////////////////////OYENTEDEACCION///BOTONES3//
        ActionListener oyenteDeAccion3 = new ActionListener() {                                         //
            @Override                                                                                   //
            public void actionPerformed(ActionEvent e) {                                                //
                if (interficie.getText().length() != 0) {                                               //
                    interficie.setText(interficie.getText().substring(0, interficie.getText().length() - 1));//
                }                                                                                       //
            }                                                                                           //
        };                                                                                              //
        botones3.addActionListener(oyenteDeAccion3);                                                    //
    }                                                                                                   //
    //////////////////////////////////////////////////////////////////BOTONESARITMETICOS////////SUMA//////
    private void botonesaritmeticos() {                                                                 //
        JButton suma = new JButton();                                                                   //
        suma.setText("+");                                                                              //
        suma.setBounds(370, 100, 100, 50);                                            //
        suma.setEnabled(true);                                                                          //
        suma.setBackground(Color.LIGHT_GRAY);                                                           //
        //boton1.setBackground(Color.BLACK);                                                            //
        suma.setFont(new Font("arial", 3, 20));
           //
                                                                                                        //
                                                                                                        //
        panel.add(suma);                                                                                //
                                                                                                        //
///////////////////////////////////////////////////////////////////BOTONESARITMETICOS////////RESTA////////
        JButton resta = new JButton();                                                                  //
        resta.setText("-");                                                                             //
        resta.setBounds(370, 160, 100, 50);                                           //
        resta.setEnabled(true);                                                                         //
        resta.setBackground(Color.LIGHT_GRAY);                                                          //
        //boton1.setBackground(Color.BLACK);                                                            //
        resta.setFont(new Font("arial", 3, 20));                                         //
        panel.add(resta);                                                                               //
                                                                                                        //
///////////////////////////////////////////////////////////////////BOTONESARITMETICOS////////MULTI////////
        JButton mul = new JButton();                                                                    //
        mul.setText("*");                                                                               //
        mul.setBounds(370, 230, 100, 50);                                             //
        mul.setEnabled(true);                                                                           //
        mul.setBackground(Color.LIGHT_GRAY);                                                            //
        //boton1.setBackground(Color.BLACK);                                                            //
        mul.setFont(new Font("arial", 3, 20));                                           //
        panel.add(mul);                                                                                 //
                                                                                                        //
///////////////////////////////////////////////////////////////////BOTONESARITMETICOS////////DIV//////////
        JButton div = new JButton();                                                                    //
        div.setText("/");                                                                               //
        div.setBounds(370, 300, 100, 50);                                             //
        div.setEnabled(true);                                                                           //
        div.setBackground(Color.LIGHT_GRAY);                                                            //
        //boton1.setBackground(Color.BLACK);                                                            //
        div.setFont(new Font("arial", 3, 20));                                           //
        panel.add(div);                                                                                 //
////////////////////////////////////////////////////////////////////BOTONESARITMETICOS////////IGUAL////////
        JButton igual = new JButton();                                                                  //
        igual.setText("=");                                                                             //
        igual.setBounds(250, 370, 220, 50);                                           //
        igual.setEnabled(true);                                                                         //
        igual.setBackground(Color.LIGHT_GRAY);                                                          //
        //boton1.setBackground(Color.BLACK);                                                            //
        igual.setFont(new Font("arial", 3, 20));                                         //
        panel.add(igual);                                                                               //
                                                                                                        //
///////////////////////////////////////////////////////////////////OYENTEDEACCION/////SUMA////////////////
        ActionListener oyenteDeAccion = new ActionListener() {                                          //
            @Override                                                                                   //
            public void actionPerformed(ActionEvent e) {                                                //
                                                     //
                num1= Float.parseFloat(interficie.getText());
                signo='+';
                interficie.setText("");                                                                 //
            }                                                                                           //
                                                                                                         //
        };                                                                                              //
        suma.addActionListener(oyenteDeAccion);                                                         //
                                                                                                        //
////////////////////////////////////////////////////////////////////OYENTEDEACCION/////RESTA///////////////
        ActionListener oyenteDeAcciones2 = new ActionListener() {                                       //
            @Override                                                                                   //
            public void actionPerformed(ActionEvent e) {                                                //

                num1= Float.parseFloat(interficie.getText());
                signo='-';
                interficie.setText("");//
            }                                                                                           //
                                                                                                        //
        };                                                                                              //
/////////////////////////////////////////////////////////////////////OYENTEDEACCION/////DIV///////////////
            resta.addActionListener(oyenteDeAcciones2);                                                 //
                                                                                                        //
                                                                                                        //
        ActionListener oyenteDeAcciones3 = new ActionListener() {                                       //
            @Override                                                                                   //
            public void actionPerformed(ActionEvent e) {                                                //

                num1= Float.parseFloat(interficie.getText());
                signo='/';
                interficie.setText("");//
                                                                                                        //
            }                                                                                           //
                                                                                                        //
        };                                                                                              //
                                                                                                        //
        div.addActionListener(oyenteDeAcciones3);                                                       //
                                                                                                        //
//////////////////////////////////////////////////////////////////////OYENTEDEACCION/////MULTI////////////
        ActionListener oyenteDeAccion4 = new ActionListener() {                                         //
            @Override                                                                                   //
            public void actionPerformed(ActionEvent e) {                                                //

                num1= Float.parseFloat(interficie.getText());
                signo='*';
                interficie.setText("");//
                                                                                                        //
            }                                                                                           //
        };                                                                                              //
                                                                                                        //
        mul.addActionListener(oyenteDeAccion4);
                                                                                                       //
///////////////////////////////////////////////////////////////////////OYENTEDEACCION/////IGUAL///////////
        ActionListener oyenteDeAccion5 = new ActionListener() {                                         //
            @Override                                                                                   //
            public void actionPerformed(ActionEvent e) {                                                //

                num2 = Integer.parseInt(interficie.getText());

                if (signo == '+') {
                    interficie.setText(Float.toString(num1 + num2));
                } else if (signo == '-') {
                    interficie.setText(Float.toString(num1 - num2));
                } else if (signo == '*') {
                    interficie.setText(Float.toString(num1 * num2));
                } else if (signo == '/') {
                    interficie.setText(Float.toString(num1 / num2));                                     //
                }


                JOptionPane.showMessageDialog(frame,
                        "Buen Trabajo,Haga otra operacion", "",
                        JOptionPane.INFORMATION_MESSAGE);
            }//

        };                                                                                              //
                                                                                                        //
        igual.addActionListener(oyenteDeAccion5);
        ;                                                                                               //
    }                                                                                                   //
//////////////////////////////////////////////////////////////////////////////////////////////////////////
}



