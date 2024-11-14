package com.sanket.marksheet_service.entity;


public class Marks {
    String id;
    Long sub1;
    Long sub2;

    public Marks(String id, Long sub1, Long sub2, Long sub3, Long sub4) {
        this.id = id;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSub1() {
        return sub1;
    }

    public void setSub1(Long sub1) {
        this.sub1 = sub1;
    }

    public Long getSub2() {
        return sub2;
    }

    public void setSub2(Long sub2) {
        this.sub2 = sub2;
    }

    public Long getSub4() {
        return sub4;
    }

    public void setSub4(Long sub4) {
        this.sub4 = sub4;
    }

    public Long getSub3() {
        return sub3;
    }

    public void setSub3(Long sub3) {
        this.sub3 = sub3;
    }

    Long sub3;
    Long sub4;
}
