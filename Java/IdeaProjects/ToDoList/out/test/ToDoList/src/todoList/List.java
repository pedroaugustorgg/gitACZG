package todoList;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    public List() {
        GridLayout Layout = new GridLayout(10, 1);
        Layout.setVgap(5);
        this.setLayout(Layout);
        //this.setBackground(Color.blue);

    }
    public void indexnum() {
        Component[] listcomp = this.getComponents();
        for (int i = 0; i < listcomp.length; i++) {
            if(listcomp[i] instanceof Task) {
                ((Task)listcomp[i]).writeindexjl(i+1); //Para escrever a ordem das tarefas (tasks)
            }
        }
    }
}
