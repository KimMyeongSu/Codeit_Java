/**
 * Created by Administrator on 2017-07-18.
 */


/*
DNA 염기 서열은 생물의 유전 성질을 결정하는 매우 중요한 역할을 가지고 있습니다.
 템플릿에 주어진 염기 서열에서 TAGG, CCAG, AGCC가 총 몇 번 등장하는지 세어봅시다.
 */
public class DNA {

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

            char [] StringtoChar = dna.toCharArray();

            char[] temp = new char[4];

            int a= 0 ,b = 0, c = 0 ,error =0;
            for (int i=0; i<StringtoChar.length -3; i ++) { //이쪽 반복부분 이해 필요.
                for(int j =0; j < temp.length; j++){
                    temp [j] = StringtoChar[i+j];
                }

                String ChartoString = new String(temp);

                 switch(ChartoString) {
                    case "TAGG" :
                        a++; break;
                    case "CCAG" :
                        b++; break;
                    case "AGCC" :
                        c++; break;
                    default: error++;
                }
            }
        System.out.println("TAGG : " +a);
        System.out.println("CCAG : " +b);
        System.out.println("AGCC : " +c);
      //  System.out.println("error :"+error);
    }

}
