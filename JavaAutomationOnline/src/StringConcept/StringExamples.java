package StringConcept;

public class StringExamples {

	public static void main(String[] args) {

		String name="Divakar";
		int number=3;

		/*name="Arun";
		System.out.println(name);
		 */

		System.out.println(name.charAt(5));//to find the character in the position
		System.out.println(name.length());//to find the length
		System.out.println(name.indexOf("k"));//to fine the number in the letter position
		System.out.println(name.indexOf("a",4));
		System.out.println((name.indexOf("ak")));
		System.out.println(name.equals("mapla"));//to compare exact two string
		System.out.println(name.equalsIgnoreCase("divakar"));// to compare with ignore of case
		System.out.println(name.isEmpty());//to check the string is empty or not
		System.out.println(name.contains("ak")); //to check the letter in the string
		System.out.println(name.substring(4));//to crop the string
		System.out.println(name.substring(4,5));
		System.out.println(name.concat(" Ramesh")); //it add the extra string to the string
		System.out.println(name.replace("k", "K"));
		System.out.println(name.replaceAll("Divakar", "Divakar Ramesh"));// to replace the string

		String name1="   hello  ";
		System.out.println(name1.trim());

		System.out.println(String.valueOf(number));
		String name2="DIVAKAR";
		System.out.println(name2.toLowerCase());
		System.out.println(name.toUpperCase());
		//JOIN to STRING
		System.out.println(String.join("/", "02","09","1993"));
		System.out.println(String.join("-", "NEVER","EVER","GIVEUP"));

		//Split
		String split="hai,Im,divakar";
		String[] splitedwords=split.split(",");
		for (String string : splitedwords) {
			System.out.println(string);

		}





	}

}