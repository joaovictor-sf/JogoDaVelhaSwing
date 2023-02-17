package br.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    //JPanel players;
    Game game;
    Players players;
    //JPanel game;
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Jogo da Velha");
        this.setSize(416,499);
        this.setLayout(null);
        this.setResizable(false);

        /*players = new JPanel();
        players.setLayout(null);
        players.setBackground(Color.red);
        players.setBounds(43, 0, 400, 100);*/
        players = new Players();

        /*game = new JPanel();
        game.setLayout(null);
        game.setBackground(Color.blue);
        game.setBounds(43, 100, 400, 360);*/
        game = new Game();

        this.add(players);
        this.add(game);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
