package com.designpattern.bridge.solution_1;
/**
 * 使用站内消息方式发送【普通】信息
 * @author Json
*/
public class CommonSystemMessage implements UrgencyMessage {

	@Override
	public void send(String message, String users) {
		message = "*普通*：" + message;
		System.out.println("使用站内消息方式，发送信息【"+message+"】To【"+users+"】");
	}
}
