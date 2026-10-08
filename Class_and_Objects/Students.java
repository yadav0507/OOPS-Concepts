public class Students {

    public int rollNo;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total(){
        return m1 + m2 + m3;
    }

    public float average(){
        return (float) total() /3;
    }

    public char grade(){
        if(average() >= 60){
            return 'A';
        }
        else
            return 'B';
    }
    public String details(){
        return "RollNO:"+ rollNo+"\n" +"Name:" +name + "\n"+"course" + course +"\n";
    }

    public static void main(String[] args){
        Students s = new Students();

        s.rollNo = 1;
        s.name = "Himansnhu";
        s.course = "Cs";
        s.m1 = 80;
        s.m2 = 90;
        s.m3 = 50;

        System.out.print(s.total());
        System.out.println(s.average());
        System.out.println(s.details());

    }
    
}
