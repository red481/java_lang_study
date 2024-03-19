package ch12.sec03.exam01;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member member){
            if(id.equals(member.id)){
                return true;
            }
        }
        return false;
    }
}
