package br.controller;

import br.model.Player;

import javax.swing.*;
import java.awt.*;

public class Players  extends JPanel{

    Player player1;
    Player player2;

    public Players() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 30));
        this.setBackground(Color.lightGray);
        this.setBounds(0, 0, 400, 100);

        player1 = new Player();
        player2 = new Player();

        player1.setText("player 1" + ": " + player1.getPontos());
        player2.setText("player 2" + ": " + player2.getPontos());

        this.add(player1);
        this.add(player2);
    }

}
