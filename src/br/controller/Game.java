package br.controller;

import br.model.MyButton;
import br.model.Player;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {
    /*JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;*/
    MyButton button1;
    MyButton button2;
    MyButton button3;
    MyButton button4;
    MyButton button5;
    MyButton button6;
    MyButton button7;
    MyButton button8;
    MyButton button9;
    boolean vez;
    String simbolo = "X";
    Players players = new Players();

    Player player1 = new Player();
    Player player2 = new Player();

    public Game() {
        //this.setLayout(null);
        this.setLayout(new GridLayout(3, 3, 5, 5));
        this.setBackground(Color.white);
        this.setBounds(0, 100, 400, 360);

        vez = false;

        /*Border border = BorderFactory.createLineBorder(Color.black, 3);

        button1 = new MyButton();
        button2 = new MyButton();
        button3 = new MyButton();
        button4 = new MyButton();
        button5 = new MyButton();
        button6 = new MyButton();
        button7 = new MyButton();
        button8 = new MyButton();
        button9 = new MyButton();

        //button1.setBorderPainted(false);
        button1.setBackground(Color.BLUE);
        button1.setFont(new Font("MV Boli",Font.PLAIN,80));
        button1.setFocusable(false);
        button1.addActionListener(this);
        button1.setContentAreaFilled(false);
        button1.setBorder(border);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button2.setBackground(Color.BLUE);
        button2.setFont(new Font("MV Boli",Font.PLAIN,80));
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setContentAreaFilled(false);
        button2.setBorder(border);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button3.setBackground(Color.BLUE);
        button3.setFont(new Font("MV Boli",Font.PLAIN,80));
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setContentAreaFilled(false);
        button3.setBorder(border);
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button4.setBackground(Color.BLUE);
        button4.setFont(new Font("MV Boli",Font.PLAIN,80));
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setContentAreaFilled(false);
        button4.setBorder(border);
        button4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button5.setBackground(Color.BLUE);
        button5.setFont(new Font("MV Boli",Font.PLAIN,80));
        button5.setFocusable(false);
        button5.addActionListener(this);
        button5.setContentAreaFilled(false);
        button5.setBorder(border);
        button5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button6.setBackground(Color.BLUE);
        button6.setFont(new Font("MV Boli",Font.PLAIN,80));
        button6.setFocusable(false);
        button6.addActionListener(this);
        button6.setContentAreaFilled(false);
        button6.setBorder(border);
        button6.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button7.setBackground(Color.BLUE);
        button7.setFont(new Font("MV Boli",Font.PLAIN,80));
        button7.setFocusable(false);
        button7.addActionListener(this);
        button7.setContentAreaFilled(false);
        button7.setBorder(border);
        button7.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button8.setBackground(Color.BLUE);
        button8.setFont(new Font("MV Boli",Font.PLAIN,80));
        button8.setFocusable(false);
        button8.addActionListener(this);
        button8.setContentAreaFilled(false);
        button8.setBorder(border);
        button8.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button9.setBackground(Color.BLUE);
        button9.setFont(new Font("MV Boli",Font.PLAIN,80));
        button9.setFocusable(false);
        button9.addActionListener(this);
        button9.setContentAreaFilled(false);
        button9.setBorder(border);
        button9.setCursor(new Cursor(Cursor.HAND_CURSOR));*/
        button1 = new MyButton();
        button2 = new MyButton();
        button3 = new MyButton();
        button4 = new MyButton();
        button5 = new MyButton();
        button6 = new MyButton();
        button7 = new MyButton();
        button8 = new MyButton();
        button9 = new MyButton();

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1) {
            button1.setText(simbolo);
            button1.setEnabled(false);//Ira deixar o botão desabilidado
        }
        if(e.getSource()==button2) {
            button2.setText(simbolo);
            button2.setEnabled(false);//Ira deixar o botão desabilidado
        }
        if(e.getSource()==button3) {
            button3.setText(simbolo);
            button3.setEnabled(false);//Ira deixar o botão desabilidado
        }
        if(e.getSource()==button4) {
            button4.setText(simbolo);
            button4.setEnabled(false);//Ira deixar o botão desabilidado
        }
        if(e.getSource()==button5) {
            button5.setText(simbolo);
            button5.setEnabled(false);//Ira deixar o botão desabilidado
        }
        if(e.getSource()==button6) {
            button6.setText(simbolo);
            button6.setEnabled(false);//Ira deixar o botão desabilidado
        }
        if(e.getSource()==button7) {
            button7.setText(simbolo);
            button7.setEnabled(false);//Ira deixar o botão desabilidado
        }
        if(e.getSource()==button8) {
            button8.setText(simbolo);
            button8.setEnabled(false);//Ira deixar o botão desabilidado
        }
        if(e.getSource()==button9) {
            button9.setText(simbolo);
            button9.setEnabled(false);//Ira deixar o botão desabilidado
        }

        win();

        if (vez){
            simbolo = "X";
            vez = false;
        }else {
            simbolo = "O";
            vez = true;
        }
    }

    public void win(){
        /**********************************************************************
         * Vertical
         */
        if (button1.getText() != "" && button4.getText() != "" && button7.getText() != "" &&
        button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText())){
            System.out.println("Win");
            button1.setForeground(new ColorUIResource(Color.green));
            button4.setForeground(new ColorUIResource(Color.green));
            button7.setForeground(new ColorUIResource(Color.green));
            if (vez){
                players.player2.setPontos(players.player2.getPontos()+1);
                players.player2.setText("player 2" + ": " + players.player2.getPontos());
                System.out.println(players.player2.getPontos());
            }else {
                //players.player1.setPontos(players.player1.getPontos()+1);
                //players.player1.setText("player 1" + ": " + players.player1.getPontos());
                players.ganharPontos();
                System.out.println(players.player1.getPontos());
            }
        }

        if (button2.getText() != "" && button5.getText() != "" && button8.getText() != "" &&
                button2.getText().equals(button5.getText()) && button2.getText().equals(button8.getText())){
            System.out.println("Win");
        }

        if (button3.getText() != "" && button6.getText() != "" && button9.getText() != "" &&
                button3.getText().equals(button6.getText()) && button3.getText().equals(button9.getText())){
            System.out.println("Win");
        }
        /**********************************************************************
         * Horizontal
         */
        if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText())){
            System.out.println("Win");
        }

        if (button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button4.getText().equals(button5.getText()) && button4.getText().equals(button6.getText())){
            System.out.println("Win");
        }

        if (button7.getText() != "" && button8.getText() != "" && button9.getText() != "" &&
                button7.getText().equals(button8.getText()) && button7.getText().equals(button9.getText())){
            System.out.println("Win");
        }
        /**********************************************************************
         * Diagonal
         */
        if (button1.getText() != "" && button5.getText() != "" && button9.getText() != "" &&
                button1.getText().equals(button5.getText()) && button1.getText().equals(button9.getText())){
            System.out.println("Win");
        }

        if (button3.getText() != "" && button5.getText() != "" && button7.getText() != "" &&
                button3.getText().equals(button5.getText()) && button3.getText().equals(button7.getText())){
            System.out.println("Win");
        }
    }
}
