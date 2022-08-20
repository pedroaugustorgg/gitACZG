package todoList;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel { //Classe herdada do "JPanel" referente a barra de título presente no topo do aplicativo

    JLabel TitleText = new JLabel("To do List App (ACZG)"); //Variável do tipo "JLabel" e nome "TitleText" orientada ao objeto JLabel (presente na biblioteca padrão do Java "javax.swing" importada para esta classe)
    public TitleBar () { //Método com parâmetros referente a barra

        this.setPreferredSize(new Dimension(400, 80)); //Dimensões do campo (barra) da TopBar/TitleBar: Largura(width) e Altura (height)
        this.setBackground(new Color(90, 143, 123)); //Cor de fundo da barra de título com valores do RGB.

        TitleText.setPreferredSize(new Dimension(300, 80)); //Dimensões do campo de preenchimento do texto
        TitleText.setFont(new Font("Sans-serif", Font.BOLD, 20)); //Fonte e tamanho do texto
        TitleText.setHorizontalAlignment(JLabel.CENTER); //Alinhamento do texto ao campo (barra) da TopBar/TitleBar (Centralizado)
        this.add(this.TitleText); //Impressão na tela da variável "TitleText"
    }

}
