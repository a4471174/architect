package composite;

import composite.components.*;

public class Main {

    /**
     * Window  Form
     *     picture
     *     button
     *     button
     *     frame
     *         label
     *         textbox
     *         label
     *         passwordbox
     *         checkbox
     *         label
     *         linklabel
     *
     * @param args
     */
    public static void main(String[] args) {

        Button picture = new Button("LOGO图片");
        Button login = new Button("登录");
        Button register = new Button("注册");


        Frame username = new Label("用户名");
        Frame textbox = new Textbox("文本框");
        Frame password = new Label("密码");
        Frame passwordbox = new Passwordbox("密码框");
        Frame checkbox = new Checkbox("复选框");
        Frame rememberme = new Label("记住用户名");
        Frame forgetpasswd = new Linklabel("忘记密码");


        Frame frame = new Frame("FRAME1");


        WindowForm wf = new WindowForm();
        wf.add(picture);
        wf.add(login);
        wf.add(register);

        wf.add(frame);

        frame.add(username);
        frame.add(textbox);
        frame.add(password);
        frame.add(passwordbox);
        frame.add(checkbox);
        frame.add(rememberme);
        frame.add(forgetpasswd);


    }
}
