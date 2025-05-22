class demo
{
    public static void main(String args[]){
        // StringBuffer this is thread safe
        StringBuffer name = new StringBuffer("nazir");
        System.out.println(name.capacity()); // gives 16 extra buffer

        name.append("Iqbal");
        System.out.println(name);

        name.deleteCharAt(4);
        System.out.println(name);

        name.setLength(35);
        System.out.println(name.capacity());
    }
}
