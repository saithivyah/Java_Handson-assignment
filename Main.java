import java.util.*;
class RnaTranscription {
String transcribe(String dnaStrand) {
String[] dna = {"G", "C", "T", "A"};
String[] rna = {"C", "G", "A", "U"};
String result = "";
List list1 = Arrays.asList(dna);
for(int i = 0; i < dnaStrand.length(); i++) {
for(int j = 0; j < dna.length; j++) {
if(dna[j].equals(Character.toString(dnaStrand.charAt(i)))) {
result += rna[j];
}
if(!list1.contains(Character.toString(dnaStrand.charAt(i)))) {
return "Invalid Input";
}
}
}
return result;
}
}
class Main
{
public static void main(String args[])
{
String dnaStrand="GCTAAT";

RnaTranscription r= new RnaTranscription();
System.out.println("DNA :"+ dnaStrand);
System.out.println("RNA :"+r.transcribe(dnaStrand));
}
}
