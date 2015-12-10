package com.yasic.yuexing.Objects;

/**
 * Created by ESIR on 2015/12/10.
 */
public class Member {
    /**
     * 成员头像
     */
    private int memberHeadPortrait;

    /**
     * 成员姓名
     */
    private String memberName;

    /**
     * 成员类型
     */
    private String memberType;

    public Member(int memberHeadPortrait, String memberName, String memberType){
        this.memberHeadPortrait = memberHeadPortrait;
        this.memberName = memberName;
        this.memberType = memberType;
    }

    public void setMemberHeadPortrait(int memberHeadPortrait) {
        this.memberHeadPortrait = memberHeadPortrait;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public int getMemberHeadPortrait() {
        return memberHeadPortrait;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberType() {
        return memberType;
    }
}
