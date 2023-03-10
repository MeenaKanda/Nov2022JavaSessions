package SeleniumSessions;

public class NestedLoopsConcepts {

	public static void main(String[] args) {

		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55
		
		//time complexity O(n^2)
		for(int i =0; i<=5; i++) {
			for(int j =0; j<=5; j++) {
				System.out.print(i + "" + j + " ");
			//	break;
			}
			System.out.println();
			//break;
			
		}
		System.out.println("----------------------------------------");

/*		000 001 002 003 004 005 
		010 011 012 013 014 015 
		020 021 022 023 024 025 
		030 031 032 033 034 035 
		040 041 042 043 044 045 
		050 051 052 053 054 055 
		100 101 102 103 104 105 
		110 111 112 113 114 115 
		120 121 122 123 124 125 
		130 131 132 133 134 135 
		140 141 142 143 144 145 
		150 151 152 153 154 155 
		200 201 202 203 204 205 
		210 211 212 213 214 215 
		220 221 222 223 224 225 
		230 231 232 233 234 235 
		240 241 242 243 244 245 
		250 251 252 253 254 255 
		-----------------------
		540 541 542 543 544 545 
		550 551 552 553 554 555 */
		
		//time complexity O(n^3)
		for(int v = 0; v<=5; v++) {
			for(int u = 0; u<=5; u++) {
				for(int l=0; l<=5; l++) {
					System.out.print(v+""+u+l+" ");
					//break;
				}
				System.out.println();
				
			}
		}

	}

}
