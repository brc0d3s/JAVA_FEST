package OOP.Array;

public class Array_Traverse {
    int LA[]={23,56,97,98,65,23,76};
    int i;

    Array_Traverse(){
        for(i=0;i < LA.length;i++){
            System.out.println("Index: " + i + " " + "Value: "+ LA[i]);
        }
    }

    public static void main(String[] args){
        new Array_Traverse();
    }
}
