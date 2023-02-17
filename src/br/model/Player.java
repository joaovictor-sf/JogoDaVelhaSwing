package br.model;

import javax.swing.*;
import java.awt.*;

public class Player extends JLabel {
    private int pontos;

    {
        pontos = 0;
        this.setFont(new Font("Helvetica",Font.PLAIN,20));
        this.setForeground(Color.BLACK);
    }

    public Player(int pontos) {
        this.pontos = pontos;
    }

    public Player() {
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
