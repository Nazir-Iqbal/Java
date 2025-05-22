class demo
{
    public static void main(String args[]){

        // creating the string object
        String name = new String("Nazir");
        System.out.println(name.charAt(0)); // to find the character at particular index
        System.out.println(name + " Iqbal"); // concatanation using the + operator
        System.out.println(name.concat(" Iqbal")); // concatanation using the concat function

        // we also create the string obeject directly in java
        String direct = "This is an Direct String object";
        System.out.println(direct);
    }
}
