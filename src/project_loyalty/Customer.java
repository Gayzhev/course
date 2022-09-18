package project_loyalty;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }
    private String name;
    private String memberType;
    private boolean isMember = false;

        public Customer(String name, String memberType, boolean isMember) {
        this.name = name;
        this.memberType = memberType;
        this.isMember = isMember;
    }
    public String getName() {
        return name;
    }
    public String getMemberType() {
        return memberType;
    }
    public boolean getIsMember() {
        return isMember;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public boolean setIsMember(boolean isMember) { //проблема
        this.isMember = isMember;
        return isMember;
    }
}



