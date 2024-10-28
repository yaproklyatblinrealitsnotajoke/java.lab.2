public class Student {
    private String n;
    private int[] o;

    public Student(String n, int[] o){
        this.n=n;
        this.o=o.clone();
    }

    public Student(String n){
        int[] a = { };
        this.n=n;
        this.o=a;
    }

    public int[] getO() {
        return o.clone();
    }

    public void setO(int[] o) {
        this.o=o.clone();
    }

    public double sr(){
        int i=0;
        int sum = 0;
        for (int contact: o){
            sum += contact;
            i++;
        }
        if(i==0)
            return 0;
        else
            return sum/i;
    }

    public String otl(){
        if (sr()==5)
            return "Отличник";
        else
            return "Не Отличник";
    }

    public String toString(){
        String list = "";
        for (int contact: o){
            list += contact + " ";
        }


        return n + ":" + list;

    }
}
