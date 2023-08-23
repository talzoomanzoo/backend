package com.talzoo.ex12;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    @Override // Object의 function override 1
    public boolean equals(Object obj) { // 모든 것 다 잡음
        // TODO Auto-generated method stub
        if(obj instanceof Member) { // obj가 Member 타입객체라면 // 객체 타입 확인: boolean result = 객체 instanceof 타입
            Member member = (Member) obj;
            if(id.equals(member.id)) { // String equals String
                return true;
            } 
        }
        return false;
    }

    @Override // Object의 function override 1
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "-" + id;
    }


}
