//package Construtor;

class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subID, String name, int maxMarks, int marksObtained){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }

    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtained(){return marksObtained;}

    public void setMaxMarks(int mm){
        maxMarks = mm;
    }
    public void setMarksObtained(int mo){
        marksObtained = mo;
    }
    boolean isQualified(){
        return marksObtained >= maxMarks /10*4;
    }
    public String toString(){
        return "\nSubject ID :"+subID+"\nName :"+name+"\nMarks Obtained : "+marksObtained+"\nMax Marks :" +maxMarks;
    }
}

public class test3 {
    public static void main(String[] args) {
        Subject sb[] = new Subject[3];
        sb[0] = new Subject("01", "Himanshu Yadav", 100, 85);
        sb[1] = new Subject("02", "Harsh Mandloi", 100,  90);
        sb[2] = new Subject("03", "Deepak Jain", 100,   90);

        for(Subject s: sb){
            System.out.println(s);
        }

        // System.out.println("Himanshu's profile : " + sb[0]);
        // System.out.println();
        // System.out.println("Harsh's Profile :" + sb[1]);
        // System.out.println();
        // System.out.println("Deepak's Profile : " + sb[2]);
    }
    
}
