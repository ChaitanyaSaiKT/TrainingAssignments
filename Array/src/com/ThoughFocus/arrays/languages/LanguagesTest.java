package com.ThoughtFocus.languages;


public class LanguagesTest {
	public static void main(String[] args) {
		Languages language = new Languages();
		language.save("c");
		language.save("c++");
		language.save("Java");
		language.save("Python");
		language.save("JS");
		language.save("c#");
		language.save("Go");
		language.save("Swift");
		language.save("Shell");
		language.save("TypeScript");
		language.save("Ruby");
		language.save("CSS");
		language.save("Scala");
		language.save("Dirt");
		language.save("Perl");

		language.printall();
		
		String resp = language.delete("Dart");
		System.out.println(resp);
		language.printall();
		
		String resp1 = language.delete("c++");
		System.out.println(resp1);
		language.printall();
	
		language.update("Dirt", "Dart");
		language.printall();
		
	}
}
