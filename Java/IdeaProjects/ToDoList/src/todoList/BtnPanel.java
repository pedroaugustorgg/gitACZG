package todoList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BtnPanel extends JPanel { //Classe herdada do "JPanel" referente aos botões presentes no aplicativo
    private JButton addtask;
    private JButton clear;

    Border emptyborder = BorderFactory.createEmptyBorder();

    public BtnPanel() {
        this.setPreferredSize(new Dimension(400, 80)); //Dimensões do campo (barra de rodapé) BtnPanel: Largura(width) e Altura (height)
        this.setBackground(new Color(90, 106, 96)); //Cor de fundo da barra de rodapé com valores do RGB.

        addtask = new JButton("Add Task"); //Variável do tipo "JButton" e nome "addtask" orientada ao objeto JButton (presente na biblioteca padrão do Java "javax.swing" importada para esta classe)
        addtask.setBorder(emptyborder); //Retirada de bordas do botão, deixando apenas o botão em volta do texto.
        addtask.setFont(new Font("Sans-serif", Font.PLAIN, 20)); //Fonte e tamanho do texto
        this.add(addtask); //Impressão na tela da variável "addtask"

        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear All Task"); //Variável do tipo "JButton" e nome "clear" orientada ao objeto JButton (presente na biblioteca padrão do Java "javax.swing" importada para esta classe)
        clear.setBorder(emptyborder); //Retirada de bordas do botão, deixando apenas o botão em volta do texto.
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20)); //Fonte e tamanho do texto
        this.add(clear); //Impressão na tela da variável "clear"

    }
    public JButton getaddtaskbtn() {
        return addtask;
    }
    public JButton getclearbtn() {
        return clear;
    }

}
