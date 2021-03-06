package assignment1.question3.part1;

import java.awt.Color;

public class Main {
    public static void main(String args[]) {
    	String dnaSeq = "TACGCAATGCGTATCATTCTGCTGGGCGCTCCGGGCGCAGGTAAAGGTACTCAGGCTCAATTCATCATGGAGAAA"
    			+ "TACGGCATTCCGCAAATCTCTACTGGTGACATGTTGCGCGCCGCTGTAAAAGCAGGTTCTGAGTTAGGTCTGAAAGCAAAA"
    			+ "GAAATTATGGATGCGGGCAAGTTGGTGACTGATGAGTTAGTTATCGCATTACTCAAAGAACGTATCACACAGGAAGATTGC"
    			+ "CGCGATGGTTTTCTGTTAGACGGGTTCCCGCGTACCATTCCTCAGGCAGATGCCATGAAAGAAGCCGGTATCAAAGTTGAT"
    			+ "TATGTGCTGGAGTTTGATGTTCCAGACGAGCTGATTGTTGAGCGCATTGTCGGCCGTCGGGTACATGCTGCTTCAGGCCGT"
    			+ "GTTTATCACGTTAAATTCAACCCACCTAAAGTTGAAGATAAAGATGATGTTACCGGTGAAGAGCTGACTATTCGTAAAGAT"
    			+ "GATCAGGAAGCGACTGTCCGTAAGCGTCTTATCGAATATCATCAACAAACTGCACCATTGGTTTCTTACTATCATAAAGAA"
    			+ "GCGGATGCAGGTAATACGCAATATTTTAAACTGGACGGAACCCGTAATGTAGCAGAAGTCAGTGCTGAACTGGCGACTATT"
    			+ "CTCGGTTAATTCTGGATGGCCTTATAGCTAAGGCGGTTTAAGGCCGCCTTAGCTATTTCAAGTAAGAAGGGCGTAGTACCT"
    			+ "ACAAAAGGAGATTTGGCATGATGCAAAGCAAACCCGGCGTATTAATGGTTAATTTGGGGACACCAGATGCTCCAACGTCGA"
    			+ "AAGCTATCAAGCGTTATTTAGCTGAGTTTTTGAGTGACCGCCGGGTAGTTGATACTTCCCCATTGCTATGGTGGCCATTGC"
    			+ "TGCATGGTGTTATTTTACCGCTTCGGTCACCACGTGTAGCAAAACTTTATCAATCCGTTTGGATGGAAGAGGGCTCTCCTT"
    			+ "TATTGGTTTATAGCCGCCGCCAGCAGAAAGCACTGGCAGCAAGAATGCCTGATATTCCTGTAGAATTAGGCATGAGCTATG"
    			+ "GTTCAC";
    	TextPreview txtPre = new TextPreview();
    	txtPre.setText(dnaSeq);
    	txtPre.highlight("AGT");
    	txtPre.highlight("TAA", Color.red);
    	txtPre.highlight("TAG", Color.red);
    	txtPre.highlight("TGA", Color.red);
    }
}