package com.learn.test.api.provider.service.jms;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author geweijian
 * @data 2017-09-25
 */
public class JMSConsumer {
    //账户 都是默认的admin
    private static final String USER = ActiveMQConnection.DEFAULT_USER;
    //密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    //默认的连接类型
    private static final String URL = ActiveMQConnection.DEFAULT_BROKER_URL;

    //发送消息的数量
    private static final Integer SEND_NUMBER = 5;

    public static void main(String[] args) {
        //定义连接工厂
        ConnectionFactory connectionFactory;

        //连接
        Connection connection = null;

        //会话 接收或者发送消息的线程
        Session session;

        //消息发送的目的
        Destination destination;

        //消息生产者
        MessageConsumer messageConsumer;

        //创建连接工厂
        connectionFactory = new ActiveMQConnectionFactory(JMSConsumer.USER, JMSConsumer.PASSWORD, JMSConsumer.URL);

        try {
            //创建连接
            connection = connectionFactory.createConnection();

            //启动连接
            connection.start();

            //创建session
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            //创建队列 消息是发送到队列中
            destination = session.createQueue("HELLOWORLD");

            messageConsumer = session.createConsumer(destination);

            while (true) {
                TextMessage textMessage = (TextMessage) messageConsumer.receive(100000);
                if(textMessage != null){
                    System.out.println("收到的消息:" + textMessage.getText());
                }else {
                    break;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
