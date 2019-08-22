package com.yc.atcrowdfunding.util;
import javax.mail.Message;

import javax.mail.Session;

import javax.mail.Transport;

import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Properties;
import java.util.Random;

/**

 * java发送邮件测试

 */
public class SendMail {
    // 发件人的邮箱地址和密码
    private String sendEmailAccount = "2271020426@qq.com";
    //如果有授权码，此处填写授权码
    private String sendEmailPassword = "xjmmznpfrsnvebjh";
    // 发件人邮箱的 SMTP 服务器地址, 可以登录web邮箱查询
    private  String sendEmailSMTPHost = "smtp.qq.com";
    // 收件人邮箱地址
    private  String receiveMailAccount;
    private String result;
	public String getSendEmailAccount() {
		return sendEmailAccount;
	}
	public void setSendEmailAccount(String sendEmailAccount) {
		this.sendEmailAccount = sendEmailAccount;
	}
	public String getSendEmailPassword() {
		return sendEmailPassword;
	}
	public void setSendEmailPassword(String sendEmailPassword) {
		this.sendEmailPassword = sendEmailPassword;
	}
	public String getSendEmailSMTPHost() {
		return sendEmailSMTPHost;
	}
	public void setSendEmailSMTPHost(String sendEmailSMTPHost) {
		this.sendEmailSMTPHost = sendEmailSMTPHost;
	}
	public String getReceiveMailAccount() {
		return receiveMailAccount;
	}
	public void setReceiveMailAccount(String receiveMailAccount) {
		this.receiveMailAccount = receiveMailAccount;
	}
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	/*public static void main(String[] args) throws Exception {

        // 参数配置

        Properties props = new Properties();

        props.setProperty("mail.transport.protocol", "smtp");

        props.setProperty("mail.smtp.host", sendEmailSMTPHost);

        props.setProperty("mail.smtp.auth", "true");

        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        props.setProperty("mail.smtp.port", "465");

        props.setProperty("mail.smtp.socketFactory.port", "465");

        // 根据配置创建会话对象, 用于和邮件服务器交互

        Session session = Session.getDefaultInstance(props);

        session.setDebug(true);   // 设置为debug模式, 可以查看详细的发送 log

        // 创建一封邮件

        Message message = createMimeMessage(session, sendEmailAccount, receiveMailAccount);

        // 根据 Session 获取邮件传输对象

        Transport transport = session.getTransport();

        // 使用 邮箱账号 和 密码 连接邮件服务器, 这里认证的邮箱必须与 message 中的发件人邮箱一致, 否则会报错

        transport.connect(sendEmailAccount, sendEmailPassword);

        // 发送邮件

        transport.sendMessage(message, message.getAllRecipients());

        // 关闭连接

        transport.close();

    }
*/
    /**

     * 创建一封简单邮件
     * @throws Exception 

     */
    
    public  void send() throws Exception{
    	  Properties props = new Properties();

          props.setProperty("mail.transport.protocol", "smtp");

          props.setProperty("mail.smtp.host", sendEmailSMTPHost);

          props.setProperty("mail.smtp.auth", "true");

          props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

          props.setProperty("mail.smtp.port", "465");

          props.setProperty("mail.smtp.socketFactory.port", "465");

          // 根据配置创建会话对象, 用于和邮件服务器交互

          Session session = Session.getDefaultInstance(props);

          session.setDebug(true);   // 设置为debug模式, 可以查看详细的发送 log

          // 创建一封邮件

          Message message = createMimeMessage(session, sendEmailAccount, receiveMailAccount);

          // 根据 Session 获取邮件传输对象

          Transport transport = session.getTransport();

          // 使用 邮箱账号 和 密码 连接邮件服务器, 这里认证的邮箱必须与 message 中的发件人邮箱一致, 否则会报错

          transport.connect(sendEmailAccount, sendEmailPassword);

          // 发送邮件

          transport.sendMessage(message, message.getAllRecipients());

          // 关闭连接

          transport.close();
    }

    private  Message createMimeMessage(Session session, String sendMail, String receiveMail) throws Exception {

        Message message = new MimeMessage(session);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(new Date());
        String content = "【蚂蚁商城】您本次【"+date+"】操作的验证码是：["+createCode()+"]<br>提示：请勿泄露验证码。";
        message.setFrom(new InternetAddress(sendMail));
        
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail));

        // 设置邮件标题

        message.setSubject("验证码-蚂蚁商城");

        // 设置邮件正文

        message.setText(content);

        message.setSentDate(new Date());

        //保存设置
        message.saveChanges();

        return message;

    }
    
    public  String createCode(){
    	Random rad=new Random();  
        String result  = rad.nextInt(1000000) +"";  
        if(result.length()!=6){  
            return createCode();  
        }
        this.result=result;
        return result;
    }

}
