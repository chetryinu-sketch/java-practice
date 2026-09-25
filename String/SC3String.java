public class SC3String {
    public static void main(String[] args){

        //Remove Special characters from a string----------------
        // String str="a!B@c#1#2%3";
        // String str2=str.replaceAll("[^a-zA-Z0-9]","");
        // System.out.println(str2);

        //Remove extra spaces from string------------------------
        // String str="    abc  de   fgh  ijk";
        // System.out.println(str.replaceAll("\\s+"," ").trim());  // trim() is used to remove leading and taillling spaces

        //Find number of words in a string------------------------
        String str="I love java programming";
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
}
