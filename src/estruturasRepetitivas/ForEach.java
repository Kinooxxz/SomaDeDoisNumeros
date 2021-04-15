package estruturasRepetitivas;

public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria","Bob","Alex"};

        for(String obj : vect){
            System.out.println(obj);
        }

        System.out.println("----------------------------");

        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
    }

}
