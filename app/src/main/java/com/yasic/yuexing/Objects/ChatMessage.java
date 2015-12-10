package com.yasic.yuexing.Objects;

/**
 * Created by ESIR on 2015/12/9.
 */
public class ChatMessage {
    /**
     * 聊天者
     */
    private String chaterName;

    /**
     * 聊天者头像
     */
    private int chaterHeadPortrait;

    /**
     * 聊天时间
     */
    private String chaterMessageTime;

    /**
     * 聊天信息
     */
    private String chateMessage;

    public ChatMessage(String chaterName, int chaterHeadPortrait, String chaterMessageTime, String chateMessage){
        this.chaterName = chaterName;
        this.chaterHeadPortrait = chaterHeadPortrait;
        this.chaterMessageTime = chaterMessageTime;
        this.chateMessage = chateMessage;
    }

    public void setChaterName(String chaterName) {
        this.chaterName = chaterName;
    }

    public void setChaterHeadPortrait(int chaterHeadPortrait) {
        this.chaterHeadPortrait = chaterHeadPortrait;
    }

    public void setChaterMessageTime(String chaterMessageTime) {
        this.chaterMessageTime = chaterMessageTime;
    }

    public void setChateMessage(String chateMessage) {
        this.chateMessage = chateMessage;
    }

    public String getChaterName() {

        return chaterName;
    }

    public int getChaterHeadPortrait() {
        return chaterHeadPortrait;
    }

    public String getChaterMessageTime() {
        return chaterMessageTime;
    }

    public String getChateMessage() {
        return chateMessage;
    }
}
