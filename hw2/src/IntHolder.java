public class IntHolder {
    private int num;
    public IntHolder(int n) {
        this.num = n;
    }
    public IntHolder(){
        this.num = 0;
    }
    public void setInt(int n) {
        this.num = n;
    }
    public void add(IntHolder n) {
        this.num += n.getInt();
    }
    public void minus(IntHolder n) {
        this.num -= n.getInt();
    }
    public void multi(IntHolder n) {
        this.num *= n.getInt();
    }
    public void div(IntHolder n) {
        this.num /= n.getInt();
    }
    public void ost(IntHolder n) {
        this.num %= n.getInt();
    }
    public int getInt() {
        return num;
    }
    public boolean equals(IntHolder n) {
        return this.num == n.getInt();
    }
    void swap(IntHolder n) {
        int a = n.getInt();
        n.setInt(this.getInt());
        this.setInt(a);
    }
}
