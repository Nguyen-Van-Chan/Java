package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileFilter;

public class HocJoptionpaneJFilechooser extends JFrame {
    JMenuBar mnuBar; //khai báo thanh menu
    JMenu mnuFile; //khai báo menu File
    JMenuItem mnuFileSave,mnuFileOpen,mnuFileExit;//khai báo các item trong menu
    JTextArea txtData;
    JFileChooser chooser;
    public HocJoptionpaneJFilechooser(String title)
    {
        super(title);
        addControls();
        addEvents();
    }

    private void addEvents() {
        mnuFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyThoatPhanMem();
            }
        });
        mnuFileOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyMoFile();
            }
        });
        mnuFileSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                xuLyLuuFile();
            }
        });

    }

    private void xuLyLuuFile() {
        if(chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            String data=txtData.getText();
            try {
                FileOutputStream fos=new
                        FileOutputStream(chooser.getSelectedFile());
                OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF8");
                osw.write(data);
                osw.close();
                fos.close();
                JOptionPane.showMessageDialog(null, "Lưu file thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    private void xuLyMoFile() {
        if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            try
            {
                File selectedFile=chooser.getSelectedFile();
                FileInputStream fis=new FileInputStream(selectedFile);
                InputStreamReader isr=new InputStreamReader(fis,"UTF8");
                BufferedReader br=new BufferedReader(isr);
                String line=br.readLine();
                StringBuilder builder=new StringBuilder();
                while(line!=null)
                {
                    builder.append(line);
                    line=br.readLine();
                }
                br.close();
                txtData.setText(builder.toString());
            }
            catch(Exception ex)
            {

            }
        }
    }

    private void xuLyThoatPhanMem() {
        int ret=JOptionPane.showConfirmDialog(null, "Bạn muốn thoát hả?",
                "Xác nhận thoát",
                JOptionPane.YES_NO_OPTION);
        if(ret==JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }

    private void addControls() {
        //tạo menu bar
        setupMenubar();
        //bổ sung text area để hiển thị text
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        txtData=new JTextArea(50,50);
        txtData.setLineWrap(true);//xuống dòng
        txtData.setWrapStyleWord(true);//xuống dòng nguyên từ
        JScrollPane sc=new JScrollPane(txtData,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        con.add(sc,BorderLayout.CENTER);
        //chỉ hiển thị File *.doc hoặc *.docx hoặc *.txt
        chooser=new JFileChooser();




    }


    private void setupMenubar() {
        mnuBar=new JMenuBar();
        setJMenuBar(mnuBar);
        mnuFile=new JMenu("Hệ thống");
        mnuBar.add(mnuFile);
        mnuFileSave=new JMenuItem("Lưu tập tin");
        mnuFileOpen=new JMenuItem("Mở tập tin");
        mnuFileExit=new JMenuItem("Thoát phần mềm");
        mnuFile.add(mnuFileSave);
        mnuFile.add(mnuFileOpen);
        mnuFile.addSeparator();
        mnuFile.add(mnuFileExit);
    }

    public void showWindow()
    {
        this.setSize(700,500);//width x height
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }



}
