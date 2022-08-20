package todoList;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskname;
    private JButton done;
    private JButton remove;

    public Task() {
        GridLayout taskLayout = new GridLayout(1,4);
        taskLayout.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(new Color(255, 234, 17));
        this.setLayout(taskLayout);

        index = new JLabel("");
        index.setPreferredSize(new Dimension(10, 20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255, 234, 17));
        this.add(this.index); //Numeração sequencial, adicionando à coluna primeira coluna "index" da lista criada

        taskname = new JTextField("enter task");
        taskname.setPreferredSize(new Dimension(10, 20));
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(new Color(255, 234, 17));
        this.add(taskname); //Adicionando à coluna "taskname" da lista criada

        done = new JButton("Done");
        done.setFont(new Font("Sans-serif", Font.BOLD, 15));
        done.setPreferredSize(new Dimension(10, 20));
        this.add(this.done);

        remove = new JButton("Remove");
        remove.setFont(new Font("Sans-serif", Font.BOLD, 15));
        remove.setPreferredSize(new Dimension(10, 20));
        this.add(this.remove); //Adicionando à coluna "remove" da lista criada

    }
    public void writeindexjl(int n) {
        this.index.setText(String.valueOf(n));
        this.revalidate();

    }
    public JButton getdonej() {
        return this.done;
    }
    public JButton getremovej() {
        return this.remove;
    }
    public void donestatus() {
        this.taskname.setBackground(Color.green);
        this.index.setBackground(Color.green);
        this.remove.setBackground(Color.green);
        this.done.setBackground(Color.green);
        this.setBackground(Color.green);
        revalidate();
    }

}
