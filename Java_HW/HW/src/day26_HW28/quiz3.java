package day26_HW28;

public class quiz3 {
    public static void main(String[] args) {
        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                   + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                   + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                   + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                   + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                   + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                   + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                   + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                   + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                   + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                   + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                   + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                   + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                   + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                   + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                   + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                   + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                   + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                   + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                   + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                   + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                   + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
        char[] dnaarr = dna.toCharArray();
        
        String tagg = "TAGG";
        String ccag = "CCAG";
        String agcc = "AGCC";
        
        int tagg_n = 0;
        int ccag_n = 0;
        int agcc_n = 0;
        
        char[] tagg_arr = tagg.toCharArray();
        char[] ccag_arr = ccag.toCharArray();
        char[] agcc_arr = agcc.toCharArray(); 
        
        for(int i = 0; i < dnaarr.length; i++) {
        	
        	if( i+1 == dnaarr.length) {
        		break;
        	}
        	
        	if(dnaarr[i] == tagg_arr[0] && dnaarr[i+1] == tagg_arr[1] 
        			&& dnaarr[i+2] == tagg_arr[2] && dnaarr[i+3] == tagg_arr[3]) {
        		tagg_n += 1;
        	}
            	
        	if(dnaarr[i] == ccag_arr[0] && dnaarr[i+1] == ccag_arr[1] 
        			&& dnaarr[i+2] == ccag_arr[2] && dnaarr[i+3] == ccag_arr[3]) {
        		ccag_n += 1;
        	}
        	
        	if(dnaarr[i] == agcc_arr[0] && dnaarr[i+1] == agcc_arr[1] 
        			&& dnaarr[i+2] == agcc_arr[2] && dnaarr[i+3] == agcc_arr[3]) {
        		agcc_n += 1;
        	}

          }
        
        System.out.println("TAGG : " + tagg_n);
        System.out.println("CCAG : " + ccag_n);
        System.out.println("AGCC : " + agcc_n);
    }
}