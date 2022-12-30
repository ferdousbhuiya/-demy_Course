package Arrays;

public class Encapsulation {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}


//       This is another class, outside of the private class



class Main1 {


        public static void main(String[] args) {
            Encapsulation myObj = new Encapsulation();
   //         myObj.name = "Ferdous"; // this will show the error

            myObj.setName("Ferdous");
            System.out.println(myObj.getName());
        }
    }

