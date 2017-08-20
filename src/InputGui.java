import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InputGui extends Frame implements ActionListener {

    private Label label1, label2, label3, label4;
    private TextField[] text1, text2, text3, text4;
    private Button btn1, btn2;

    public InputGui() {
        // TODO Auto-generated constructor stub
        setSize(500, 600);
        // x 버튼 누르면 종료되는 행위
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(null);
        setVisible(true);

        label1 = new Label("날짜");
        label2 = new Label("제목");
        label3 = new Label("금액");
        label4 = new Label("비고");

        text1 = new TextField[10];
        text2 = new TextField[10];
        text3 = new TextField[10];
        text4 = new TextField[10];

        for (int i = 0; i < 10; i++) {
            text1[i] = new TextField(8);
            text2[i] = new TextField(8);
            text3[i] = new TextField(8);
            text4[i] = new TextField(8);
        }

        btn1 = new Button("확인");
        btn2 = new Button("취소");

        // button listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        labelFormLocation();
        textfieldFormLocation();
        btnFormLocation();

        labelAddFrame();
        textfieldAddFrame();
        btnAddFram();
    }

    public void labelFormLocation() {
        label1.setBounds(100, 50, 30, 30);
        label2.setBounds(170, 50, 30, 30);
        label3.setBounds(240, 50, 30, 30);
        label4.setBounds(310, 50, 30, 30);
    }

    public void labelAddFrame() {
        add(label1);
        add(label2);
        add(label3);
        add(label4);
    }

    public void textfieldFormLocation() {
        int y = 80;
        for (int i = 0; i < 10; i++) {
            text1[i].setBounds(100, y, 40, 20);
            text2[i].setBounds(170, y, 40, 20);
            text3[i].setBounds(240, y, 40, 20);
            text4[i].setBounds(310, y, 40, 20);

            y = y + 50;
        }
    }

    public void textfieldAddFrame() {
        for (int i = 0; i < 10; i++) {
            add(text1[i]);
            add(text2[i]);
            add(text3[i]);
            add(text4[i]);
        }
    }

    public void btnFormLocation() {
        btn1.setBounds(180, 550, 60, 50);
        btn2.setBounds(240, 550, 60, 50);
    }

    public void btnAddFram() {
        add(btn1);
        add(btn2);
    }

    @Override // 버튼을 눌렀을 때 액션
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        if ("확인".equals(ae.getActionCommand())) {

        } else if ("취소".equals(ae.getActionCommand())) {
        }
    }

    public void getText() {
        String[] date, title, money, note;

        for (int i = 0; i < 10; i++) {
            text1[i].getText();
        }
    }

//    public static void main(String[] args) {
//        InputGui inputGui = new InputGui();
//
//    }

}
