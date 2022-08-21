package todoList;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskname;
    private JComboBox taskcategory;
    private JComboBox taskpriority;
    private JComboBox taskstatus;
    private JButton done;
    private JButton remove;


    public Task() { //Gerenciamento de tarefas pelo usuário
        GridLayout taskLayout = new GridLayout(1,5); //Número de linhas e colunas na área de tarefas
        taskLayout.setHgap(5);
        this.setPreferredSize(new Dimension(400, 35));
        this.setBackground(new Color(255, 234, 17));
        this.setLayout(taskLayout);

        index = new JLabel("");
        index.setFont(new Font("Sans-serif", Font.BOLD, 25));
        index.setPreferredSize(new Dimension(10, 20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255, 234, 17));
        this.add(this.index); //Numeração sequencial, adicionando à coluna primeira coluna "index" da lista criada

        taskname = new JTextField("enter task");
        taskname.setFont(new Font("Sans-serif", Font.BOLD, 20));
        taskname.setPreferredSize(new Dimension(10, 20));
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(new Color(255, 234, 17));
        this.add(taskname); //Adicionando à coluna "taskname" da lista criada

        String[] category = {"Profissional","Personal"};
        taskcategory = new JComboBox(category);
        taskcategory.setFont(new Font("Sans-serif", Font.BOLD, 25));
        this.setVisible(true);
        this.add(taskcategory);

        String[] priority = {"Low", "Medium", "High"};
        taskpriority = new JComboBox(priority);
        taskpriority.setFont(new Font("Sans-serif", Font.BOLD, 25));
        this.setVisible(true);
        this.add(taskpriority);

        String[] status = {"To do", "Doing", "Done"};
        taskstatus = new JComboBox(status);
        taskstatus.setFont(new Font("Sans-serif", Font.BOLD, 25));
        this.setVisible(true);
        this.add(taskstatus);

        //Botão "Done" desativado, uma vez que já existe o status da atividade
        done = new JButton("Done");
        done.setFont(new Font("Sans-serif", Font.BOLD, 30));
        done.setPreferredSize(new Dimension(10, 20));
        //this.add(this.done);

        remove = new JButton("Remove");
        remove.setFont(new Font("Sans-serif", Font.BOLD, 30));
        remove.setPreferredSize(new Dimension(10, 20));
        this.add(this.remove);

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
